package model.satellite;

/**
 * @author John Kent
 * A class that specifies a orbiting mass
 */
public class Satellite {
	public String name;
	public Point position;
	public int type;
	public double radius;
	public double velocity;
	public boolean canOrbit;
	
	/**
	 * Assigns default satellite to point
	 */
	public Satellite() {
		position = new Point(0,0);
	}
	
	/**
	 * Builds a Satellite with given stats
	 * 
	 * @param position is a Point object and is never negative
	 * @param radius is a double value and is never negative
	 * @param velocity is a double value
	 * @param canOrbit true if satellite will orbit another satellite
	 */
	public Satellite(Point position, double radius, double velocity,
			boolean canOrbit) {
		this.position = position;
		this.radius = radius;
		this.velocity = velocity;
		this.canOrbit = canOrbit;
	}
}
