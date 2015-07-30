package com.capgemini.placeToSplit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Interface {
	public static void interfejs() {
		PrintWriter consol_output = new PrintWriter(System.out, true);

		try (BufferedReader console_input = new BufferedReader(new InputStreamReader(System.in));
				Scanner numbers_input = new Scanner(System.in)) { // automatyczna
																	// obsluga
																	// wyjatkow

			consol_output.println("Add array size: ");

			PlaceToSplit.temp = console_input.readLine(); // odczytuje lancuch z
															// wejscia konsoli
			PlaceToSplit.size = Integer.parseInt(PlaceToSplit.temp); // zamienia
																		// lancuch
																		// na
																		// int
																		// za
																		// pomoca
			// obiektu opakowujacego Integer

			PlaceToSplit.array = new int[PlaceToSplit.size]; // tworzy obiekt
																// tablicy z
																// dana
																// wielkoscia

			consol_output.println("Add data to the array: ");

			int j = 0;
			do {
				consol_output.println("Add " + j + " number to array:");
				PlaceToSplit.charakter = numbers_input.nextInt(); // zapisuje
																	// odczytywany
				// znak do zmiennej znak
				PlaceToSplit.array[j++] = PlaceToSplit.charakter;
			} while (j < PlaceToSplit.size);

			PlaceToSplit.splitrez = PlaceToSplit.canBalance(PlaceToSplit.array);
			consol_output.print("Array analizing: ");
			consol_output.println();
			consol_output.print("{");

			for (int i = 0; i < PlaceToSplit.array.length; i++) {
				consol_output.print(PlaceToSplit.array[i]);
				if (i < PlaceToSplit.array.length - 1)
					consol_output.print(",");
			}
			consol_output.println("}");
			consol_output.println();
			consol_output.println("If it's possible to divide array on two values: " + PlaceToSplit.splitrez);

		} catch (IOException exc) {
			System.out.println("Console read failure: " + exc);
		}
	}

}
