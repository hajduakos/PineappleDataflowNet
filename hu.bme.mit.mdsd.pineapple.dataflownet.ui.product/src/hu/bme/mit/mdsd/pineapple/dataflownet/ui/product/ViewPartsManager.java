package hu.bme.mit.mdsd.pineapple.dataflownet.ui.product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.IDataflowNetView;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachine;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachineState;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.SystemBuilder;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.ui.ChannelMediator;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class ViewPartsManager implements IDataflowNetView {

	private Map<String, Text> labels = new HashMap<>();
	
	public void createParts(ScrolledForm form, final SystemBuilder builder) {

		GridData gd = new GridData();
		gd.grabExcessHorizontalSpace = true;
		gd.horizontalAlignment = GridData.FILL;
		Label stateMachinesLabel = new Label(form.getBody(), SWT.NULL);
		stateMachinesLabel.setText("STATE MACHINES");
		gd.horizontalSpan = 3;
		stateMachinesLabel.setLayoutData(gd);
		
		List<StateMachine> stateMachines = builder.getStateMachines();
		for (StateMachine stateMachine : stateMachines) {
			Text label = new Text(form.getBody(), SWT.NULL);
			label.setEditable(false);
			label.setText("Current state of " + stateMachine.getName() + " is: " + stateMachine.getCurrentState().getName());
			label.setLayoutData(gd);
			labels.put(stateMachine.getName(), label);
		}
		
		
		Label separator = new Label(form.getBody(), SWT.HORIZONTAL | SWT.SEPARATOR);
        GridData gridData = new GridData();
        gridData.horizontalSpan = 3;
        gridData.horizontalAlignment = GridData.FILL;
        gridData.verticalAlignment = GridData.CENTER;
        // This needs to be set to true in order to achieve automatic resizing of the component
        gridData.grabExcessHorizontalSpace = true;
        gridData.grabExcessVerticalSpace = false;
        // Set the layout data for the separator
        separator.setLayoutData(gridData);
		
		Label channelsLabel = new Label(form.getBody(), SWT.NULL);
		
		channelsLabel.setText("ADD TOKENS TO CHANNELS");
		gd.horizontalSpan = 3;
		channelsLabel.setLayoutData(gd);
		
		Set<String> channelNames = builder.getChannelNames();
		for (final String channelName : channelNames) {
			
			Label label = new Label(form.getBody(),SWT.NULL);
			label.setText("Channel " + channelName + ":");

			final Text text = new Text(form.getBody(), SWT.BORDER);
			text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Button button = new Button(form.getBody(), SWT.PUSH);
			button.setText("Put token to channel");
			button.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					Display.getDefault().asyncExec(new Runnable() {
						
						@Override
						public void run() {
							boolean putToChannel = ChannelMediator.putToChannel(builder.getChannelByName(channelName), text.getText());
							if(putToChannel){
								MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Success", "A token was put to the channel successfully.");
							} else {								
								MessageDialog.openWarning(Display.getDefault().getActiveShell(), "Failure", "The token could not be put to the channel.");
							}
						}
					});
				}
			});
		}
		
	}

	@Override
	public void stateMachineStateChanged(final StateMachine sm, final StateMachineState sms) {
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				Text label = labels.get(sm.getName());
				label.setText("Current state of " + sm.getName() + " is: " + sms.getName());
			}
		});
	}

}
