package com.capgemini.taxi;

import java.util.ArrayList;
import java.util.List;

public class Taxi {
	private final int SIZE_NEW = 5;
	private double tab_odl_tax_ws[] = new double[SIZE_NEW];
	private String nazwa_tax_ws[] = new String[SIZE_NEW];
	City city;

	public Taxi(City c) {
		city = c;
	}

	public void check_taxi() {

		List<Double> lista_totw = new ArrayList<Double>();
		List<String> lista_ntw = new ArrayList<String>();

		for (int i = 0; i < city.getTab_odl_tax().length; i++) {
			if (city.getTab_odl_tax()[i] < 1000 && city.getZaj_tax()[i] == false) {
				lista_totw.add(city.getTab_odl_tax()[i]);

				lista_ntw.add(city.getNazwa_tax()[i]);
			}
		}

		quicksort(lista_ntw, lista_totw, 0, lista_totw.size() - 1);

		for (int i = 0; i < SIZE_NEW; i++) {

			tab_odl_tax_ws[i] = lista_totw.get(i).doubleValue();

			nazwa_tax_ws[i] = lista_ntw.get(i);
		}
	}

	private void quicksort(List<String> lista_ntw, List<Double> lista_totw, int left, int right) {

		int i, j;
		Double x, y;
		String z;
		i = left;
		j = right;
		x = lista_totw.get((left + right) / 2);
		do {
			while ((lista_totw.get(i) < x) && (i < right))
				i++;
			while ((x < lista_totw.get(j)) && (j > left))
				j--;
			if (i <= j) {
				y = lista_totw.get(i);
				z = lista_ntw.get(i);

				lista_totw.add(i, lista_totw.get(j));
				lista_totw.remove(i + 1);
				lista_totw.add(j, y);
				lista_totw.remove(j + 1);

				lista_ntw.add(i, lista_ntw.get(j));

				lista_ntw.remove(i + 1);
				lista_ntw.add(j, z);
				lista_ntw.remove(j + 1);
				i++;
				j--;
			}
		} while (i <= j);
		if (left < j)
			quicksort(lista_ntw, lista_totw, left, j);

		if (i < right)
			quicksort(lista_ntw, lista_totw, i, right);
	}

	public double[] getOdlTaxWs() {
		return tab_odl_tax_ws;
	}

	public String[] getNazwaTaxWs() {
		return nazwa_tax_ws;
	}

	public int getSize() {
		return SIZE_NEW;
	}

}
