package model.main.world.objects;

public class Item {
	private String name;
	private boolean holdable;
	private boolean dropable;
	private int type;
	
	public void nullItem() {
		this.holdable = true;
		this.dropable = false;
		this.name = "null";	
		this.type = 0;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
}
