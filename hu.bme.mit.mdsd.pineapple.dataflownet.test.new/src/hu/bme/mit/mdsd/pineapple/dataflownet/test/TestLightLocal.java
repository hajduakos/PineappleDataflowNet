package hu.bme.mit.mdsd.pineapple.dataflownet.test;

import static org.junit.Assert.*;
import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Token;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.BoolPair;
import hu.bme.mit.mdsd.pineapple.dataflownet.process.LocalSystemBuilder;

import org.junit.Test;

public class TestLightLocal {

	private final static int timeout = 600;
	@Test
	public void test() throws InterruptedException {
		LocalSystemBuilder lsb = LocalSystemBuilder.getInstance();
		lsb.init();
		lsb.startStateMachines();
		
		// Small movement, no light
		lsb.getChannel_3_ch_sens_movement().put(new Token<BoolPair>(new BoolPair(true,false)));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == false);

		// Big movement, light on
		lsb.getChannel_3_ch_sens_movement().put(new Token<BoolPair>(new BoolPair(true,true)));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == true);
		
		// Lightness comes, light turns off
		lsb.getChannel_4_ch_sens_lightness().put(new Token<Boolean>(true));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == false);

		// Big movement but lightness, no light
		lsb.getChannel_3_ch_sens_movement().put(new Token<BoolPair>(new BoolPair(true,true)));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == false);

		// Lightness goes away, light remains turned off
		lsb.getChannel_4_ch_sens_lightness().put(new Token<Boolean>(false));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == false);

		// Small movement, no light
		lsb.getChannel_3_ch_sens_movement().put(new Token<BoolPair>(new BoolPair(true,false)));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == false);

		// Big movement, light on
		lsb.getChannel_3_ch_sens_movement().put(new Token<BoolPair>(new BoolPair(true,true)));
		Thread.sleep(timeout);
		assertTrue(lsb.getChannel_6_ch_contr_light().get().getValue() == true);
		
		lsb.stopStateMachines();
	}

}
