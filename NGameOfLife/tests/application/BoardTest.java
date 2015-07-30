package application;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testLenghtOfRandomList() {
		Board board = new Board(3, 3);
		assertEquals(9, board.getBoardList().size());
	}

	@Test
	public void testLenghtOfManualList() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 9; i++) {
			list.add(true);
		}
		Board board = new Board(3, 3, list);
		assertEquals(9, board.getBoardList().size());
	}

	@Test
	public void testLastValueOfManualList() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 8; i++) {
			list.add(false);
		}
		list.add(true);

		Board board = new Board(3, 3, list);
		assertEquals(true, board.getBoardList().get(8).getLifeStatus());
	}

	@Test
	public void testFirstValueOfManualList() {
		List<Boolean> list = new ArrayList<Boolean>();
		for (int i = 0; i < 9; i++) {
			list.add(false);
		}
		list.remove(0);
		list.add(0, true);

		Board board = new Board(3, 3, list);
		assertEquals(true, board.getBoardList().get(0).getLifeStatus());
	}

}
