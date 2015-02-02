package model.main.world;

import java.awt.Point;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Holds Tiles and Objects in the game world
 * 
 * @author John
 *
 */
public class World {
	private ArrayList<Tile> worldTiles;
	private int length;
	private int width;
	
	/**
	 * Creates Default world with 1x1 dimension
	 * @param length 
	 * @throws Exception
	 */
	public World(int length, int width) throws Exception {
		worldTiles = new ArrayList<Tile>();
		this.length = length;
		this.width = width;
		createTiles(length,width);
	}
	
	/**
	 * Adds default tiles to world by given length and width
	 * @param length, length of world in tile lengths
	 * @param width, width of world in tile lengths
	 * @throws Exception may go out of bounds
	 */
	private void createTiles(int length, int width) throws Exception {	
		for(int i = 0; i < length; i++) {
			for(int c = 0; c < width; c++) {				
					worldTiles.add(i*c, new Tile(new Point(i,c), tileType.floor));		
			}
		}		
	}
	
	/**
	 * loads tiles onto worldTiles via world reader
	 * @param filename, name of file to read tiles from
	 * @throws FileFormatException 
	 * @throws FileNotFoundException 
	 */
	public void loadTiles(String filename) throws FileNotFoundException, FileFormatException {
		worldTiles = Worldreader.worldreader(filename);		
	}
	
	/**
	 * updates Tile by position
	 * @param type, type of tile
	 * @param position, position of tile
	 */
	public void updateTile(tileType type, Point position) {
		worldTiles.get(position.x*position.y).setType(type);
	}
	
	/**
	 * gets copy of the TileList
	 * @return copy of tilelist
	 */
	public ArrayList<Tile> getTileList() {
		ArrayList<Tile> temp = new ArrayList<Tile>();
		temp = worldTiles;
		return temp;
		
	}
	
	public void changeLength(int length) {
		this.length = length;
	}
	
	public void changeWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
}