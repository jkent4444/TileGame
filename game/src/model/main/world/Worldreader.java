package model.main.world;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Worldreader {
	private static ArrayList<Tile> worldTile;
	
	public static ArrayList<Tile> worldreader(String filename) throws FileNotFoundException, FileFormatException {
		worldTile = new ArrayList<Tile>();
		FileReader mapfile = new FileReader(filename);
		Scanner in = new Scanner(mapfile);
		String line = "";
		String[] lineArray;
		String[] tileDetails;
		int lineNumber = 1;
		int width = 0;
		
		while(in.hasNextLine()) {
			line = in.nextLine();
			lineArray = line.split(" ");
			
			//check and set the width of each line
			if(lineNumber == 1) {
				width = lineArray.length;
			} else {
				if(lineArray.length != width) {
					throw new FileFormatException(); 
				}
			}
			System.out.println(width);
			
			//check if contents of entries are correct
			for(int i = 0; i < lineArray.length; i++) {
				System.out.println(lineArray[i].toString());
				if(lineArray[i].contains(":")) {
					tileDetails = lineArray[i].split(":");
					if(tileDetails.length == 2) {
						try{
							worldTile.add(new Tile(new Point(), 
									tileType.Integer.parseInt(tileDetails[0]), Integer.parseInt(tileDetails[1]));
							;
						} catch(Exception e) {
							throw new FileFormatException();
						}
					} else {
						throw new FileFormatException();
					}
				} else {
					throw new FileFormatException();
				}
			}
			lineNumber++;
		}
		return worldTile;
	}
}
