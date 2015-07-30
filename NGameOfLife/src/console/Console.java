package console;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.Game;

public class Console {
	private int rows = 0;
	private int columns = 0;
	private String buffor;
	Scanner console = new Scanner(System.in);
	List<Boolean> listToBoard = new ArrayList<Boolean>();
	Game consoleGame;

	public Console() {
	}

	public Console(int r, int c) {
		rows = r;
		columns = c;
	}

	public void readFromConsole() {
		System.out.println("Add number of rows: ");
		buffor = console.nextLine();
		rows = Integer.parseInt(buffor);
		System.out.println("Add umber of columns: ");

		buffor = console.nextLine();
		columns = Integer.parseInt(buffor);

		int character = 0;
		do {
			System.out.println("Choose the how to start game(m-manually,a-automaticly): ");
			try {
				character = System.in.read();
			} catch (IOException exc) {
				System.out.println("Console read error!");
			}
			switch (character) {
			case 'a':
				consoleGame.createBoard(rows, columns);
				break;
			case 'm':
				for (int i = 0; i < rows * columns; i++) {
					System.out.println("Add true or false for field number " + i);
					listToBoard.add(console.nextBoolean());
				}
				consoleGame.createBoard(rows, columns, listToBoard);
				break;
			}

		} while (character != 'm' && character != 'a');
	}

	public void writeOnConsole() {
		System.out.println("New Board: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (consoleGame.getBoard().getBoardList().get(i + j * rows).getLifeStatus())
					System.out.print("1");
				if (!(consoleGame.getBoard().getBoardList().get(i + j * rows).getLifeStatus()))
					System.out.print("0");

			}
			System.out.println();
		}
	}

	public void putGame(Game game) {
		consoleGame = game;
	}
}
