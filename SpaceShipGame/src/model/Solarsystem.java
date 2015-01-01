package model;
import model.satellite.AsteroidBelt;
import model.satellite.Planet;
import model.satellite.Sun;

/
public class Solarsystem {
	private Planet[] Planets;
	private Sun[] Suns;
	private AsteroidBelt[] AsteroidBelts;
	
	public Solarsystem(int p, int s, int a) {
		for(int i = 0; i < p; i++) {
			Planets[p] = new Planet();
		}
		
		for(int x = 0; x < s; x++) {
			Suns[x] = new Sun();
		}
		
		for(int y = 0; y < a; y++) {
			AsteroidBelts[y] = new AsteroidBelt();
		}
	}
	
	public int getNumPlanets() {
		return Planets.length;
	}
	
	public int getNumSuns() {
		return Suns.length;
	}
	
	public int getNumAsteroidBelts() {
		return AsteroidBelts.length;
	}
}
