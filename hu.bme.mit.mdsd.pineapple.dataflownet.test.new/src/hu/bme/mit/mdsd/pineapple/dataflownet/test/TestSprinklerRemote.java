package hu.bme.mit.mdsd.pineapple.dataflownet.test;

import static org.junit.Assert.*;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Token;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.LocalSystemBuilder;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.RemoteSystemBuilder;

import org.junit.Test;

public class TestSprinklerRemote {

	private final static int timeout = 600;
	@Test
	public void test() throws InterruptedException {
		LocalSystemBuilder lsb = LocalSystemBuilder.getInstance();
		lsb.init();
		lsb.startStateMachines();
		
		RemoteSystemBuilder rsb = RemoteSystemBuilder.getInstance();
		rsb.init();
		rsb.startStateMachines();
		
		// Low moisture on remote, local sprinkler turns on
		rsb.getChannel_1_ch_sens_front_moisture().put(new Token<Double>(10.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);
		
		// Normal moisture on remote, local sprinkler stays on
		rsb.getChannel_1_ch_sens_front_moisture().put(new Token<Double>(90.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);
		
		// Normal moisture on local, local sprinkler turns off
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(50.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == false);
		

		lsb.stopStateMachines();
		rsb.stopStateMachines();
	}

}
