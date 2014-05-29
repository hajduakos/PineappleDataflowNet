package hu.bme.mit.mdsd.pineapple.dataflownet.ui.product;

import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.IDataflowNetView;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachine;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachineState;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachineTransition;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.SystemBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

public class StateMachineView extends ViewPart implements IDataflowNetView{

	private static SystemBuilder builder;
	
	public static void setBuilder(SystemBuilder builder){
		StateMachineView.builder = builder;
	}
	
	public static final String ID = "hu.bme.mit.mdsd.pineapple.dataflownet.ui.product.statemachineview";
	
    private Graph graph;
    private int layout = 1;

	private String id;

    private static Map<String,StateMachine> stateMachines = new HashMap<>();

	private Map<StateMachineState,GraphNode> nodes;

	private List<GraphConnection> transitions;
    
    public static void putStateMachine(String name, StateMachine sm){
    	stateMachines.put(name, sm);
    }
	
	public StateMachineView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {

		builder.addListener(this);
		
//    	IWorkbenchPage wbp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//    	String id = wbp.getActivePartReference().getId();
    	// TODO get ID
    	id = this.getViewSite().getSecondaryId();
    	setPartName(id);
    	
    	graph = new Graph(parent, SWT.NONE);
    	nodes = new HashMap<>();
    	transitions = new ArrayList<>();
    	
    	StateMachine stateMachine = stateMachines.get(id);
    	Set<StateMachineState> stateMachineStates = stateMachine.getStateMachineStates();
    	for (StateMachineState stateMachineState : stateMachineStates) {
    		int style = SWT.NONE;
    		GraphNode graphNode = new GraphNode(graph, style, stateMachineState.getName());
    		if(stateMachine.getCurrentState().equals(stateMachineState)){
    			graphNode.setBackgroundColor(graph.HIGHLIGHT_ADJACENT_COLOR);
    		}
			nodes.put(stateMachineState,graphNode);
		}

    	
    	for (StateMachineState stateMachineState : stateMachineStates) {
			Set<StateMachineTransition> outputTransitions = stateMachineState.getOutputTransitions();
			for (StateMachineTransition stateMachineTransition : outputTransitions) {
				
				GraphConnection transition = new GraphConnection(graph, ZestStyles.CONNECTIONS_DIRECTED, nodes.get(stateMachineState), nodes.get(stateMachineTransition.getToState()));
				transitions.add(transition);
				
			 	// TODO
				transition.setText(stateMachineTransition.getLabel());
				
			}
		}
    	
//        // Lets have a directed connection
//        new GraphConnection(graph, , node1, node2);
//        // Lets have a dotted graph connection
//        new GraphConnection(graph, ZestStyles.CONNECTIONS_DOT, node2, node3);
//        // Standard connection
//        new GraphConnection(graph, SWT.NONE, node3, node1);
//        // Change line color and line width
//        GraphConnection graphConnection = new GraphConnection(graph, SWT.NONE, node1, node4);
//        graphConnection.changeLineColor(parent.getDisplay().getSystemColor(SWT.COLOR_GREEN));
//        // Also set a text
//        graphConnection.setText("This is a text");
//        graphConnection.setHighlightColor(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
//        graphConnection.setLineWidth(3);

    	graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
//        graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
        // Selection listener on graphConnect or GraphNode is not supported
        // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236528
//        graph.addSelectionListener(new SelectionAdapter() {
//            @Override
//            public void widgetSelected(SelectionEvent e) {
//                System.out.println(e);
//            }
//
//        });
		
	}
	
    public void setLayoutManager() {
        switch (layout) {
        case 1:
            graph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
            layout++;
            break;
        case 2:
            graph.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
            layout = 1;
            break;

        }

    }

	@Override
	public void setFocus() {

	}


	/**
	 * Disposes the toolkit
	 */
	public void dispose() {
		super.dispose();
	}

	@Override
	public void stateMachineStateChanged(final StateMachine sm, final StateMachineState sms) {
		
		final String id = this.id;
		
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				if(sm.getName().equals(id)){
					for (GraphNode node : nodes.values()) {
						node.setBackgroundColor(graph.DEFAULT_NODE_COLOR);
					}
					
					nodes.get(sms).setBackgroundColor(graph.HIGHLIGHT_ADJACENT_COLOR);
				}
				
			}
		});
		
	}
}
