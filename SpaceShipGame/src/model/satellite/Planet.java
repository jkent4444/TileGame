package model.satellite;

/** 
 * defines a Planet which extends a Satellite
 * 
 * where type > 0 and Gravity > 0
 * @author John
 *
 */
public class Planet extends Satellite {
	public double gravity;
	public int type;
	public double mass;
	
	/**
	 * Creates a planet at default position
	 * where gravity 1 and type = 1
	 */
	public Planet() {
		new Satellite();
		this.gravity = 1;
		this.type = 1;
	}
	
	/**
	 * creates a planet with the given parameters
	 * @param position != 0
	 * @param radius > 0
	 * @param velocity > 0
	 * @param gravity > 0
	 * @param type > 0
	 */
	public Planet(Point position, double radius, double velocity, 
			double gravity, int type, double mass) {
		new Satellite(position, radius, velocity, true);
		this.gravity = gravity;
		this.type = type;
		this.mass = mass;
	}
}
