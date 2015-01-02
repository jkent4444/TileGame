package model.satellite;

/**
 * asteroid belt is a satellite that can't orbit
 * with width > 0 and density > 0
 * @author John
 *
 */
public class AsteroidBelt extends Satellite {
	public int width;
	public double density;
	
	/**
	 * creates a Asteroid belt at default position
	 * with width == 1 and density == 0.1
	 * 
	 */
	public AsteroidBelt(){
		new Satellite();
		this.width = 1;
		this.density = 0.1;
	}
	
	/**
	 * creates a asteroid belt with given parameters
	 * @param position != 0 
	 * @param radius > 0
	 * @param velocity > 0
	 * @param width > 0
	 * @param density > 0
	 */
	public AsteroidBelt(Point position, double radius, double velocity, 
			int width, double density) {
		new Satellite(position, radius, velocity, false);
		this.width = width;
		this.density = density;
	}
}
