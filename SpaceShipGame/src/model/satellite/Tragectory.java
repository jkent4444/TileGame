package model.satellite;

import java.util.ArrayList;


public class Tragectory {
	private ArrayList<Point> flightPath;
	
	public Point getPoint(int i) {
		return flightPath.get(i);
	}
}
