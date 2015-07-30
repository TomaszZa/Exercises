package com.capgemini.taxi;

import java.io.PrintWriter;
import java.util.Date;

public class Console {
	private final int SIZE_NEW = 5;
	private City city = new City();

	private void wyswietl_tax() {

		PrintWriter konsola = new PrintWriter(System.out, true);

		Date data = new Date();
		city.obliczenia();
		city.check_taxi();
		konsola.println("Dostepne taxowki w promieniu 1 km( do 5 rekordow): ");
		konsola.println("Data i godzina(odswiezanie co 1 min): " + data.toString());
		for (int i = 0; i < SIZE_NEW; i++) {
			konsola.println("Taxowka: " + city.getNazwaTaxWs()[i] + " Odleglosc: " + city.getOdlTaxWs()[i] + " m.");
		}
	}

	public void repeatTaxi() {
		for (;;) {
			wyswietl_tax();
			try {
				Thread.sleep(60000);
			} catch (InterruptedException exc) {
				System.out.println("Blad opoznienia.");
			}

		}
	}

}
