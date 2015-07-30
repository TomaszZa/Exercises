package com.capgemini.coins;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
		Scanner consol_in = new Scanner(System.in);
		String Quit;

		do {

			Consol.panelMethod(consol_in);

			System.out.println("\n");
			System.out.println("s- start program, q- quit program: ");
			Quit = consol_in.nextLine();

			System.out.println(Quit);
		} while (Quit.compareTo("q") != 0);

		consol_in.close();
		System.out.println("End of program");
	}
}