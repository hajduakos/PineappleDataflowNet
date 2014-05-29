package hu.bme.mit.mdsd.pineapple.dataflownet.test;

import static org.junit.Assert.*;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.IDataflowNetView;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachine;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.StateMachineState;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Token;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.LocalSystemBuilder;

import org.junit.Test;

public class TestListeners implements IDataflowNetView {

	private final static int timeout = 300;
	@Test
	public void test() throws InterruptedException {
		LocalSystemBuilder lsb = LocalSystemBuilder.getInstance();
		lsb.init();
		lsb.startStateMachines();
		lsb.addListener(this);
		
		// Moisture low, sprinkler turns on
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(20.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);

		// Moisture low, sprinkler still on
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(10.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);
		
		lsb.removeListener(this);
		
		// Moisture normal, sprinkler turns off
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(30.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == false);		

		// Moisture normal, sprinkler still off
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(30.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == false);
		
		
		lsb.stopStateMachines();
	}
	@Override
	public void stateMachineStateChanged(StateMachine sm, StateMachineState sms) {
		System.out.println("StateMachine [" + sm.getName() + "] changed to [" + sms.getName() + "]");
		
	}

}
