package com.capgemini.pascalrectangle;
import java.util.Scanner;

/**
 * Created by ldrygala on 2015-01-23.
 * 0                     1
 * 1                   1   1
 * 2                 1   2   1
 * 3               1   3   3   1
 * 4             1   4   6   4   1
 * 5           1   5   10  10   5   1
 * 6         1   6   15  20  15   6   1
 * 7       1   7   21  35  35   21  7   1
 * 8     1   8   28  56  70  56   28  8   1
 * 9   1   9  36   84  126 126  84  36  9   1
 */
public class PascalRectangle {
	private long array[] = new long[1];  //tablica do przechowywania wierszy
	private long array_temp[];   //tymczasowa tablica do obliczen 
	private int lines;
	private int elem = 1;
	
	public void buildRectangle(){
		Scanner consol_input = new Scanner(System.in);
		
		System.out.print("Add number of lines:");  
		lines = consol_input.nextInt();       //odczytywanie liczby wierszy
		
		for(int i = 0; i <= lines ; i++){   //wpisywanie na konsoli nr wiersza
			if(i>0) System.out.print("*"+(i-1));      //i ma wartosc bierzacego wiersza
			
			for(int j = (lines-i); j>0; j--){   //zapelnianie odstepami
				System.out.print("   ");
			}
			show_line(i);
			create_new_line(i);
			}
		consol_input.close();
		}
	
	private void create_new_line(int i){  //tworzy nowa tablice na podststawie starej
		array = new long[elem++];        //tworzenie tablicy na nowy wiersz
		
		for(int j = 0; j <= i; j++){
			if((j == 0)|(j == i)) array[j] = 1;        //inicjalizuje tablice do wyswietlenia kolejnego wiersza
			else if(i==1) array[2] = 2;                  //zlikwidowac else if
			else array[j] = pascal(array_temp[j-1],array_temp[j]);
		}
	}
	
	
	
	private void show_line(int i){   //wyswietla bierzacy wiersz
		array_temp = new long[array.length];  //to avoid working on oryginal array
		
		for(int j = 0; j<array.length; j++){
			if(i>0) System.out.print("  "+array[j]+"  ");  //wyswietlanie bierzacego wiersza
			array_temp[j] = array[j];                //przepisywanie w celu zapamietania go do obliczen
		}
		System.out.println();  //go to next line
	}
	
	
	
    private long pascal(long c, long r) {
    	long w; 
    	w = c+r;
        return w;
    }
}
