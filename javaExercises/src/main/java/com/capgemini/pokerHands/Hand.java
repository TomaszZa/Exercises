package com.capgemini.pokerHands;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Hand {
	private BufferedReader file;
	private List<Card> cardsOnHand = new ArrayList<Card>();

	Hand(BufferedReader f) {
		file = f;
		try {
			readFileCards();
		} catch (IOException exc) {
			System.out.println("File read failure!");
		}
	}

	private void readFileCards() throws IOException {
		char kindRead, suitRead;

		for (int i = 0; i < 5; i++) {
			kindRead = (char) file.read();
			if (kindRead == '\n')
				kindRead = (char) file.read(); // new read
			suitRead = (char) file.read();
			file.read(); // deliting space
			cardsOnHand.add(new Card(kindRead, suitRead));
		}
	}

	public List<Card> getCardsOnHand() {
		return cardsOnHand;
	}
}
