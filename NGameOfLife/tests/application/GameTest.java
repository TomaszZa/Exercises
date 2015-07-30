package application;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import console.Console;

public class GameTest {

	@Test
	public void testGoThroughtFieldsForManualCreatedBoard() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 25; i++) {
			list.add(false);
		}
		list.remove(7);
		list.add(7, true);

		list.remove(12);
		list.add(12, true);

		list.remove(17);
		list.add(17, true);

		Board board = new Board(5, 5, list);
		Console console = new Console(5, 5);
		Game game = new Game(board, console);
		console.putGame(game);
		try {
			game.goThroughtFields();
		} catch (EndOfGameException exc) {
			System.out.println(exc);
		}
		assertTrue(board.getBoardList().get(11).getLifeStatus());
		assertTrue(board.getBoardList().get(12).getLifeStatus());
		assertTrue(board.getBoardList().get(13).getLifeStatus());

	}

	@Test
	public void testGoThroughtFieldsForManualCreatedBoardWithExceptionAllDeath() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 9; i++) {
			list.add(false);
		}
		list.remove(0);
		list.add(0, true);

		Board board = new Board(3, 3, list);
		Console console = new Console(3, 3);
		Game game = new Game(board, console);
		console.putGame(game);
		try {
			game.goThroughtFields();
		} catch (EndOfGameException exc) {
			return;
		}
		fail("EndOfGameException shoul accure !");
	}

	@Test
	public void testGoThroughtFieldsForManualCreatedBoardWithExceptionTheSameBoard() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 9; i++) {
			list.add(false);
		}
		list.remove(1);
		list.add(1, true);

		list.remove(3);
		list.add(3, true);

		list.remove(5);
		list.add(5, true);

		list.remove(7);
		list.add(7, true);

		Board board = new Board(3, 3, list);
		Console console = new Console(3, 3);
		Game game = new Game(board, console);
		console.putGame(game);
		try {
			game.goThroughtFields();
		} catch (EndOfGameException exc) {
			return;
		}
		fail("EndOfGameException shoul accure !");
	}

}
