package com.capgemini.coins;

import java.util.List;
import java.util.Scanner;

public class Consol {
	static void panelMethod(Scanner consol_in) {

		int Result = 0, NumberofCoins = 0;
		List<Integer> ShowList;

		System.out.println("Add number of Coins");
		NumberofCoins = consol_in.nextInt();
		consol_in.nextLine(); // delete enter
		System.out.print("Sequence from Coins:");

		ShowList = Coins.CreateList(NumberofCoins);
		Result = Coins.solution(ShowList);

		for (int i = 0; i < ShowList.size(); i++) {
			System.out.print(ShowList.get(i));
		}

		System.out.println();
		System.out.println("Points from coins: " + Result);

	}

}
