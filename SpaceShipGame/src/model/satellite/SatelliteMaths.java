package model.satellite;

public class SatelliteMaths {
	
	public double OrbitalSpeedVelocity(double G, int Mcentral, double radius) {
		return  Math.sqrt((G + (double) Mcentral)/ (double) radius);
	}
	
	public double AccelerationOfSatellite(double G, int Mcentral, double radius) {
		return (G + (double) Mcentral) / Math.sqrt((int)radius^2);
	}
}
