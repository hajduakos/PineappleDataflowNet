package hu.bme.mit.mdsd.pineapple.dataflownet.test;

import static org.junit.Assert.*;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Token;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.LocalSystemBuilder;

import org.junit.Test;

public class TestSprinklerLocal {

	private final static int timeout = 300;
	@Test
	public void test() throws InterruptedException {
		LocalSystemBuilder lsb = LocalSystemBuilder.getInstance();
		lsb.init();
		lsb.startStateMachines();
		
		// Moisture low, sprinkler turns on
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(20.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);

		// Moisture low, sprinkler still on
		lsb.getChannel_5_ch_sens_moisture().put(new Token<Double>(10.0));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_7_ch_contr_sprinkler().get().getValue() == true);

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

}
