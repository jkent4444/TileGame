package model.main.world.objects;

public class stackableItem extends Item {
	private int stackSize;
	private int count;
	
	public void stableItem(int stackSize) {
		this.stackSize = stackSize;
		this.setType(2);
		this.count = 0;
	}
	
	public void inc(int num) {
		if(!((count + num) >= stackSize)) {
			this.count += num;
		}
	}
}
