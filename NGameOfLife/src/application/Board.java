package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
	List<Field> board = new ArrayList<Field>();
	private int columns;
	private int rows;

	public Board(int r, int c) {
		rows = r;
		columns = c;
		createBoard();
	}

	public Board(int r, int c, List<Boolean> inFields) {
		rows = r;
		columns = c;
		int i = 0;
		for (int y = 0; y < columns; y++) {
			for (int x = 0; x < rows; x++, i++) {
				board.add(new Field(x, y, inFields.get(i)));
			}
		}
		i = 0;
	}

	void createBoard() {
		Random lifeOrDeath = new Random();
		for (int y = 0; y < columns; y++) {
			for (int x = 0; x < rows; x++) {
				board.add(new Field(x, y, lifeOrDeath.nextBoolean()));
			}
		}
	}

	public List<Field> getBoardList() {
		return board;
	}

	int getRows() {
		return rows;
	}

	int getColumns() {
		return columns;
	}
}
