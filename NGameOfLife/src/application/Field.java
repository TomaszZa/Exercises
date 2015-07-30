package application;

public class Field {
	private boolean lifeStatus;
	private int numberOfNeighbours = 0;
	private Coordinates coordinates = new Coordinates();

	Field(int wx, int wy) {
		coordinates.x = wx;
		coordinates.y = wy;
	}

	Field(int wx, int wy, boolean ls) {
		coordinates.x = wx;
		coordinates.y = wy;
		lifeStatus = ls;
	}

	public void checkNeighbours() {
		if (numberOfNeighbours < 2 || numberOfNeighbours > 3)
			lifeStatus = false;
		if (numberOfNeighbours == 3)
			lifeStatus = true;
	}

	public void putNeighbours(int neighbours) {
		if (neighbours <= 8 && neighbours >= 0)
			numberOfNeighbours = neighbours;
		if (neighbours < 0 | neighbours > 8)
			System.out.println("Neighbours should have value from 0 to 8");
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public boolean getLifeStatus() {
		return lifeStatus;
	}

	public void putLifeStatus(Boolean ls) {
		lifeStatus = ls;
	}

	public class Coordinates {
		public int x;
		public int y;
	}

}
