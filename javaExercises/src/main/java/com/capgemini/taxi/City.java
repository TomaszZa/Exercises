package com.capgemini.taxi;

import java.util.Random;

public class City {
	private final int SIZE = 1000;
	private int tab_x[] = new int[SIZE];
	private int tab_y[] = new int[SIZE];
	private double tab_odl_tax[] = new double[SIZE];
	private String nazwa_tax[] = new String[SIZE];
	private boolean zaj_tax[] = new boolean[SIZE];
	Taxi taxi;

	public City() {
		for (int i = 0; i < tab_odl_tax.length; i++) {
			tab_x[i] = 500;
			tab_y[i] = 500;
			tab_odl_tax[i] = 0;
			nazwa_tax[i] = "Taxowka" + i;
			zaj_tax[i] = false;
		}
		taxi = new Taxi(this);
	}

	private int losowanie() {

		int losowa;
		Random los = new Random();
		losowa = los.nextInt();
		if (losowa > 100)
			losowa = 100;
		if (losowa < -100)
			losowa = -100;
		return losowa;
	}

	protected void obliczenia() {

		for (int i = 0; i < 1000; i++) {
			tab_x[i] += losowanie();
			tab_y[i] += losowanie();
			tab_odl_tax[i] = pitagoras(tab_x[i], tab_y[i]);
			if (tab_x[i] == tab_y[i])
				zaj_tax[i] = true;
			else
				zaj_tax[i] = false;
		}
	}

	private double pitagoras(int x, int y) {

		return Math.sqrt(x * x + y * y);
	}

	public void check_taxi() {
		taxi.check_taxi();
	}

	public double[] getOdlTaxWs() {
		return taxi.getOdlTaxWs();
	}

	public String[] getNazwaTaxWs() {
		return taxi.getNazwaTaxWs();
	}

	public boolean[] getZaj_tax() {
		return zaj_tax;
	}

	double[] getTab_odl_tax() {
		return tab_odl_tax;
	}

	String[] getNazwa_tax() {
		return nazwa_tax;
	}

}
