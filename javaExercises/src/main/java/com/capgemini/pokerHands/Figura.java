package com.capgemini.pokerHands;

public enum Figura {
	ROYALFLUSH(true, "CardsInOrderWithRoyal", "NoTheSameCards"), SFLUSH(true, "CardsInOrder", "NoTheSameCards"),
	FOUR(true|false, "CardsNoInOrder", "FourSameCards"), FULL(true|false, "CardsNoInOrder", "ThreeAndTwoSameCards"),
	FLUSH(true, "CardsNoInOrder", "NoTheSameCards"), FLUSH1(true, "CardsInOrderWithRoyal", "NoTheSameCards"),
	FLUSH2(true, "CardsInOrder", "NoTheSameCards"),FLUSH3(true, "CardsNoInOrder", "ThreeSameCards"),
	FLUSH4(true, "CardsNoInOrder", "TwoPairsCards"),FLUSH5(true, "CardsNoInOrder", "OnePairCards"),
	FLUSH6(true, "CardsNoInOrder", "NoTheSameCards"),STRAIGHTR(false, "CardsInOrderWithRoyal", "NoTheSameCards"),
	STRAIGHTN(false, "CardsInOrder", "NoTheSameCards"),THREE(false, "CardsNoInOrder", "ThreeSameCards"),
	TWOPAIR(false, "CardsNoInOrder", "TwoPairsCards"), PAIR(false, "CardsNoInOrder", "OnePairCards"),
	HIGHEST(false, "CardsNoInOrder", "NoTheSameCards");

	private boolean sameColor;
	private String sequence;
	private String numberOfSame;

	Figura(boolean areOfColor, String seq, String same) {
		sameColor = areOfColor;
		sequence = seq;
		numberOfSame = same;
	}

	public static Figura parseByValues(boolean areOfColor, String seq, String same) {
		for (Figura f : values()) {
			if (f.isEqualInValues(areOfColor, seq, same))
				return f;
		}
		return null;
	}

	boolean isEqualInValues(boolean areOfColor, String seq, String same) {
		return areOfColor == sameColor && sequence.compareTo(seq)==0 && same.compareTo(numberOfSame)==0;
	 }

	public boolean isSameColor() {
		return sameColor;
	}

	public String getSequence() {
		return sequence;
	}

	public String getNumberOfSame() {
		return numberOfSame;
	}

}
