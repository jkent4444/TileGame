package model.main.world.objects;

import java.util.ArrayList;

public class Bag {
	private ArrayList<Object> Items;
	private int bagSize;
	
	public void setBag(int bagSize) {
		Item item;
		this.bagSize = bagSize;
		for(int i = 0; i < bagSize; i++) {
			item = new Item();
			item.nullItem();
			Items.add(item);
		}
	}
	
	public void addItem(Item item) {
		int nextPos = getNextNullItem();
		if(nextPos != -1) {
			Items.add(nextPos, item);
		} else {
			//throw error bag is full
		}
		
	}
	
	public void addItem(int position, Item item) {
		if( ((Item) Items.get(position)).getType() == -1) {
			Items.set(position, item);
		} else {
			//throw error is something is there thats not null
		}
	}
	
	public void addItem(int position, Item item, int num) {
		if(item instanceof stackableItem) {
			if(((stackableItem) Items.get(position)).getType() == 2) {
				((stackableItem) Items.get(position)).inc(num);
			}
		} else {
			//throw error if not
		}
		
	}
	
	public int getNextNullItem() {
		for(int i = 0; i < bagSize; i++) {
			if(((Item) Items.get(i)).getType() == 0) {
				return i;
			}
		}
		return -1;
	}
}
