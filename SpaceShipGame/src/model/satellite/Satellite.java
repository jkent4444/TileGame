package model.satellite;


public class Satellite {
	private Point position;
	public int type;
	public double radius;
	public double velocity;
	
	public Satellite() {
		position = new Point(0,0);
	}
}
