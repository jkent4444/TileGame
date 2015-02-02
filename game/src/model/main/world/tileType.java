package model.main.world;

public enum tileType {
	floor (0),
	wall (1);
	
	private int index;
	tileType(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}