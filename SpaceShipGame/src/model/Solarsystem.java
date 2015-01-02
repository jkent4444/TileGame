package model;


import model.satellite.AsteroidBelt;
import model.satellite.Planet;
import model.satellite.Point;
import model.satellite.Sun;


public class Solarsystem {
	public Point position;
	private Planet[] Planets;
	private Sun[] Suns;
	private AsteroidBelt[] AsteroidBelts;
	
	/**
	 * Initialize a Solar system 
	 * @param p This is the number of Planets
	 * @param s This is the number of Suns where Suns.length > 0
	 * @param a This is the number of AsteroidBelts
	 * @param position the position of the solar system in the visible universe
	 * 			where position not negative
	 */
	public Solarsystem(int p, int s, int a, Point position) {
		this.position = position;
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
	
	/**
	 * get number of planets
	 * @return number of Planets in this solar system
	 */
	public int getNumPlanets() {
		return Planets.length;
	}
	
	/**
	 * get number of suns
	 * @return number of Suns in this solar system
	 */
	public int getNumSuns() {
		return Suns.length;
	}
	
	/**
	 * get number of asteroid belts
	 * @return number of asteroid belts in this solar system
	 */
	public int getNumAsteroidBelts() {
		return AsteroidBelts.length;
	}
}
