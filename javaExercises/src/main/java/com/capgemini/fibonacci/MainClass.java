package com.capgemini.fibonacci;

public class MainClass {
	public static void main(String args[]) {

		for (int i = 1; i <= 19; i++) {
			System.out.print("F" + i + "  ");
		}
		System.out.println();

		for (int i = 1; i <= 19; i++) {
			System.out.print(Fibonacci.fib(i) + "   ");
		}
	}
}
