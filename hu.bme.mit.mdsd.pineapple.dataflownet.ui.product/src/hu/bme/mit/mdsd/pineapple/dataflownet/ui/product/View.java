package hu.bme.mit.mdsd.pineapple.dataflownet.ui.product;

import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachine;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.SystemBuilder;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.Dispatcher;

import java.util.List;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	public static final String ID = "hu.bme.mit.mdsd.pineapple.dataflownet.ui.product.view";
	private FormToolkit toolkit;
	private ScrolledForm form;

	/**
	 * The constructor.
	 */
	public View() {
	}

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		this.setPartName("Main view");
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setText("Dataflow net user interface");

		GridLayout layout = new GridLayout();
		form.getBody().setLayout(layout);
		layout.numColumns = 3;
				
		SystemBuilder builder = Dispatcher.buildSystem(DataflowNetApplication.processID);
		builder.init();
		ViewPartsManager viewPartsManager = new ViewPartsManager();
		viewPartsManager.createParts(form,builder);
		builder.addListener(viewPartsManager);
		builder.startStateMachines();
		
		List<StateMachine> sms = builder.getStateMachines();
		try {
			StateMachineView.setBuilder(builder);
			for (int i = 0; i < sms.size(); i++) {
				StateMachineView.putStateMachine(sms.get(i).getName(), sms.get(i));
			}
			
			for(int i=0;i<sms.size();i++){
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getActivePage().showView("hu.bme.mit.mdsd.pineapple.dataflownet.ui.product.statemachineview",
						sms.get(i).getName(), IWorkbenchPage.VIEW_CREATE);
			}
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	/**
	 * Passing the focus request to the form.
	 */
	public void setFocus() {
		form.setFocus();
	}

	/**
	 * Disposes the toolkit
	 */
	public void dispose() {
		toolkit.dispose();
		super.dispose();
	}
}