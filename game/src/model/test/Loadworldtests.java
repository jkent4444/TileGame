package model.test;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import model.main.world.FileFormatException;
import model.main.world.Tile;
import model.main.world.Worldreader;

import org.junit.Test;

import static org.junit.Assert.*;

public class Loadworldtests {
	public ArrayList<Tile> worldTile;
	
	@Test
	public void singlecorrect() throws FileNotFoundException, FileFormatException {
		worldTile = Worldreader.worldreader("tilemap1.txt",1,1);
	}
	
	@Test
	public void doubleinlinecorrect() throws FileNotFoundException, FileFormatException {
		worldTile = Worldreader.worldreader("tilemap2.txt",2,1);
		
	}
	
	@Test
	public void doublebelowcorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemap3.txt",2,1);
		
	}
	
	@Test
	public void squarecorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemap4.txt",2,2);
		
	}
	
	@Test (expected = Exception.class)
	public void rshapecorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi9.txt",2,2);
		
	}
	
	@Test (expected = Exception.class)
	public void singleincorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi1.txt",1,1);
		
	}
	
	@Test (expected = Exception.class)
	public void single2incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi2.txt",1,1);
		
	}
	
	@Test (expected = Exception.class)
	public void single3incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi3.txt",1,1);
		
	}
	
	@Test (expected = Exception.class)
	public void single4incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi6.txt",1,1);
	}
	
	@Test (expected = Exception.class)
	public void single5incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi7.txt",1,1);
	}
	
	@Test (expected = Exception.class)
	public void doubleincorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi4.txt",2,1);
		
	}
	
	@Test (expected = Exception.class)
	public void double2incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi5.txt",2,1);
		
	}
	
	@Test (expected = Exception.class)
	public void double3incorrect() throws FileNotFoundException, FileFormatException{
		worldTile = Worldreader.worldreader("tilemapi8.txt",2,1);
		
	}
}
