package model.tutorialclasses;

import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import client.Animation;

public class MainGame {
	
	public static void main(String args[]) {
		DisplayMode dm = new DisplayMode(600, 800, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		MainGame mg = new MainGame();
		mg.run(dm);
	}
	private Screen screen;
	private Image bg;
	private Animation a;

	//loads pictures from computer to java and adds scene
	public void loadPics() {
		bg = new ImageIcon("stars.jpg").getImage();
		Image ship1 = new ImageIcon("spaceship1.jpg").getImage();
		Image ship2 = new ImageIcon("spaceship2.jpg").getImage();
		a = new Animation();
		a.addScene(ship1, 250);
		a.addScene(ship2, 250);
	}
	
	public void run(DisplayMode dm) {
		screen = new Screen();
		try{
			screen.setFullScreen(dm, new JFrame());
			loadPics();
			movieLoop();
		} finally {
			screen.restoreScreen();
		}
	}
	
	//main movie loop
	public void movieLoop() {
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		
		while(cumTime - startingTime < 5000) {
			//amount of time running through loop
			long timePassed = System.currentTimeMillis() - cumTime;
			//add timepassed to cumulative time
			cumTime += timePassed;
			a.update(timePassed);
			
			Graphics g = screen.getFullScreenWindow().getGraphics();
			draw(g);
			g.dispose();
			try{
				Thread.sleep(20);
			}catch(Exception e){}
		}
	}
	
	//draw method
	public void draw(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a.getImage(), 0, 0, null);
	}
}
