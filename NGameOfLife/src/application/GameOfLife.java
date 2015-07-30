package application;

import console.Console;

public class GameOfLife {
	public static void main(String args[]) {
		boolean endOfGame = false;
		Console console = new Console();
		Game firstGame = new Game(console);
		console.putGame(firstGame);
		console.readFromConsole();
		console.writeOnConsole();
		do {
			try {
				firstGame.goThroughtFields();
			} catch (EndOfGameException exc) {
				System.out.println(exc);
				endOfGame = true;
			}
		} while (!endOfGame);
	}

}
