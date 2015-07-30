package application;

import java.util.ArrayList;
import java.util.List;

import console.Console;

public class Game {
	Console console;
	Board board;

	public Game(Console c) {
		console = c;
	}

	public Game(Board b, Console c) {
		board = b;
		console = c;
	}

	public void goThroughtFields() throws EndOfGameException {
		int nNeighbours = 0;
		List<Field> temporaryBoard = new ArrayList<Field>();

		for (int i = 0; i < board.getBoardList().size(); i++) {
			nNeighbours = checkField(i);
			board.getBoardList().get(i).putNeighbours(nNeighbours);
			temporaryBoard.add(new Field(0, 0, board.getBoardList().get(i).getLifeStatus()));
		}
		int countFalse = 0;
		int theSameBoard = 0;
		for (int i = 0; i < board.getBoardList().size(); i++) {
			board.getBoardList().get(i).checkNeighbours();
			if (!(board.getBoardList().get(i).getLifeStatus()))
				countFalse++;
			if (board.getBoardList().get(i).getLifeStatus() == temporaryBoard.get(i).getLifeStatus())
				theSameBoard++;
		}
		console.writeOnConsole();
		if (countFalse == board.getBoardList().size() || theSameBoard == board.getBoardList().size())
			throw new EndOfGameException();
	}

	private int checkField(int i) { // tu jest blad !!
		int x;
		int y;
		int xtemp;
		int ytemp;
		int nNeighbours = 0;

		x = board.getBoardList().get(i).getCoordinates().x;
		y = board.getBoardList().get(i).getCoordinates().y;
		xtemp = x;
		ytemp = y;

		for (int j = -1; j < 2; j++) {
			for (int l = -1; l < 2; l++) {
				xtemp += l;
				ytemp += j;

				if (xtemp == -1)
					xtemp = board.getRows() - 1;
				if (xtemp == board.getRows())
					xtemp = 0;
				if (ytemp == -1)
					ytemp = board.getColumns() - 1;
				if (ytemp == board.getColumns())
					ytemp = 0;

				if (!(l == 0 && j == 0))
					if (board.getBoardList().get(xtemp + ytemp * board.getRows()).getLifeStatus())
						nNeighbours++;
				xtemp = x;
				ytemp = y;
			}
		}

		return nNeighbours;
	}

	public void createBoard(int r, int c) {
		board = new Board(r, c);
	}

	public void createBoard(int r, int c, List<Boolean> l) {
		board = new Board(r, c, l);
	}

	public Board getBoard() {
		return board;
	}

}
