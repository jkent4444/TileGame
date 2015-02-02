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
	
	public static tileType getTileType(int index) {
		for(tileType type: tileType.values()) {
			if(type.getIndex() == index) {
				return type;
			}
		}
		return null;
	}
}