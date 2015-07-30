package application;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FieldTests {

	@Test
	public void testWhenDeathAndThreeNeighbours() {
		Field field = new Field(1, 1, false);
		field.putNeighbours(3);
		field.checkNeighbours();
		assertTrue(field.getLifeStatus());
	}

	@Test
	public void testWhenLifeAndThreeNeighbours() {
		Field field = new Field(1, 1, true);
		field.putNeighbours(3);
		field.checkNeighbours();
		assertTrue(field.getLifeStatus());
	}

	@Test
	public void testWhenDeathAndTwoNeighbours() {
		Field field = new Field(1, 1, false);
		field.putNeighbours(2);
		field.checkNeighbours();
		assertFalse(field.getLifeStatus());
	}

	@Test
	public void testWhenLifeAndTwoNeighbours() {
		Field field = new Field(1, 1, true);
		field.putNeighbours(2);
		field.checkNeighbours();
		assertTrue(field.getLifeStatus());
	}

	@Test
	public void testWhenDeathAndEightNeighbours() {
		Field field = new Field(1, 1, false);
		field.putNeighbours(8);
		field.checkNeighbours();
		assertFalse(field.getLifeStatus());
	}

	@Test
	public void testWhenLifeAndEightNeighbours() {
		Field field = new Field(1, 1, true);
		field.putNeighbours(8);
		field.checkNeighbours();
		assertFalse(field.getLifeStatus());
	}

	@Test
	public void testWhenDeathAndZeroNeighbours() {
		Field field = new Field(1, 1, false);
		field.putNeighbours(0);
		field.checkNeighbours();
		assertFalse(field.getLifeStatus());
	}

	@Test
	public void testWhenLifeAndZeroNeighbours() {
		Field field = new Field(1, 1, true);
		field.putNeighbours(0);
		field.checkNeighbours();
		assertFalse(field.getLifeStatus());
	}

	@Test
	public void testWhenBadValueOfNeighboursAdded() { // test with use of
														// console
		Field field = new Field(1, 1, false);
		field.putNeighbours(-1);
	}

}
