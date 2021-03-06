package model.main.world;

public enum TileDecorator {
	grass(0,tileType.floor),
	dirt(1,tileType.floor),
	stone(2,tileType.wall),
	rocks(3,tileType.wall);
	
	private tileType type;
	private int index;
	
	TileDecorator(int index, tileType type) {
		this.type = type;
		this.index = index;
	}
	public int getIndex() {
		return index;
	}
	public tileType getType() {
		return type;
	}
	
	public static TileDecorator getTileDecorator(int index) {
		for(TileDecorator type: TileDecorator.values()) {
			if(type.getIndex() == index) {
				return type;
			}
		}
		return null;
	}

}
