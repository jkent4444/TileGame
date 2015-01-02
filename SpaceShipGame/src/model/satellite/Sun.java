package model.satellite;

/**
 * Creates a Sun that is a Satellite that cannot orbit
 * 
 * Gravity != null and Gravity > 0;
 * Mass != null and Mass > 0
 * 
 * @author John
 *
 */
public class Sun extends Satellite {
	public double Gravity;	//defines the gravity of a sun
	public double Mass; // define the mass of a sun

	
	public Sun() {
		new Satellite();
		this.canOrbit = false;
		this.Gravity = 1;
		this.Mass = 1;
	}
	
	public Sun(Point position, double radius, double velocity, double Gravity,
			double Mass) {
		new Satellite(position, radius, velocity, false);
		this.Gravity = Gravity;
		this.Mass = Mass;
	}
	
	
}
