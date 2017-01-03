package com.kinbiko.kata;

import org.junit.Assert;
import org.junit.Test;

public class KarateKaTest {
	
	KarateKa target = new KarateKa();
	
	@Test
	public void testPerform() {
		Kata kata = makeKata();
		KarateKa karateKa = makeKarateKa();
		int performanceScore = karateKa.perform(kata);
		Assert.assertEquals(17, performanceScore);
	}

	private KarateKa makeKarateKa() {
		KarateKa kevin = new KarateKa();
		kevin.setGrace(3);
		kevin.setStrength(10);
		kevin.setBalance(0);
		kevin.setSpeed(2);
		kevin.setStyle(Style.GOJU_RYU);
		return kevin;
	}

	private Kata makeKata() {
		Kata fallingOver = new Kata();
		fallingOver.setStyle(Style.SHOTOKAN);
		fallingOver.setDifficulty(1);
		fallingOver.setNumberOfMoves(1);
		
		return fallingOver;
	}
}
