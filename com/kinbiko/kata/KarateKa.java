package com.kinbiko.kata;

public class KarateKa extends Athlete implements KataPerformer {
	private Style style;
	
	public int perform(Kata kata) {
		int multiplier = kata.getStyle() == style ? 2 : 1;
		int score = getGrace();
		score += getStrength();
		score += getSpeed();
		score += getBalance();
		score += kata.getDifficulty();
		score += kata.getNumberOfMoves();
		score *= multiplier;
		return score;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}
	
}
