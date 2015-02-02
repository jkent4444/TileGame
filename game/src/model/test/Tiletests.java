package model.test;


import java.awt.Point;

import model.main.world.Tile;
import model.main.world.tileType;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tiletests {
	
	@Test
	public void testTileType() throws Exception {
		Tile t1 = new Tile(new Point(0,0), tileType.floor);
		
		assertEquals(t1.getTileType(), tileType.floor);
		assertEquals(t1.getPositon(), new Point(0,0));
	}	
	
	@Test
	public void testTileChange() throws Exception {
		Tile t1 = new Tile(new Point(0,0), tileType.floor);
		t1.setPosition(new Point(1,1));
		t1.setType(tileType.wall);
		assertEquals(t1.getPositon(), new Point(1,1));
		assertEquals(t1.getTileType(), tileType.wall);
	}
	
	@Test (expected = Exception.class)
	public void testTileFalse() throws Exception {
		Tile t1 = new Tile(new Point(0,0), tileType.floor);
		t1.setPosition(new Point(-1,1));
	}	
}
