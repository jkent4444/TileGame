package client;

import java.awt.Image;
import java.util.ArrayList;

/**
 * handles animations
 * @author John
 *
 */
public class Animation {
	//scenes in animation
	private ArrayList scenes;
	
	//current scene
	private int sceneIndex;
	
	//total time animation has run
	private long movieTime;
	
	//Time to reset animation
	private long totalTime;
	
	/**
	 * Constructor function creates new animation
	 */
	public Animation() {
		scenes = new ArrayList();
		totalTime = 0;
		start();
	}
	
	//start animation from begining
	private synchronized void start() {
		movieTime = 0;
		sceneIndex = 0;
		
	}
	
	//add scene to ArrayList and set time for each scene
	public synchronized void addScene(Image i, long t) {
			totalTime += t;
			scenes.add(new OneScene(i, totalTime));
		
	}
	
	//updates image based on lapsed time
	public synchronized void update(long timePassed){
		if(scenes.size() > 1){
			movieTime += timePassed;
			if(movieTime >= totalTime){
				movieTime = 0;
				sceneIndex = 0;
			}
			while(movieTime > getScene(sceneIndex).endTime) {
				sceneIndex++;
			}
		}
	}
	
	//get animations current scene (aka image)
	public synchronized Image getImage() {
		if(scenes.size() == 0) {
			return null;
		} else {
			return getScene(sceneIndex).pic;
		}
	}
	
	//get scene
	
	private OneScene getScene(int x) {
		return (OneScene)scenes.get(x);
	}
	
	/**
	 * private inner class to handle one scene
	 */
	private class OneScene{
		Image pic;
		long endTime;
		
		public OneScene(Image pic, long endTime) {
			this.pic = pic;
			this.endTime = endTime;
		}
	}
}
