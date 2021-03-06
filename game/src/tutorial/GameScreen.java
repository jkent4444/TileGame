package tutorial;

import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

import client.Animation;
import client.ScreenManager;

public class GameScreen {
	public static void main(String args[]) {
		GameScreen gs = new GameScreen();
		gs.run();
	}
	
	private Animation a;
	private ScreenManager s;
	private Image bg;
	
	private static final DisplayMode modes1[] = {
		new DisplayMode(800, 600, 32, 0),
		new DisplayMode(800, 600, 24, 0),
		new DisplayMode(800, 600, 16, 0),
		new DisplayMode(1900, 1080, 32, 0),
		new DisplayMode(1900, 1080, 24, 0),
		new DisplayMode(1900, 1080, 16, 0),
	};
	
	//load images and add scenes
	public void loadImages(){
		bg = new ImageIcon("stars.jpg").getImage();
		Image face1 = new ImageIcon("spaceship1.jpg").getImage();
		Image face2 = new ImageIcon("spaceship2.jpg").getImage();
		
		a = new Animation();
		
		a.addScene(face1, 250);
		a.addScene(face2, 250);
	}
	
	//main method called from main
	public void run(){
		s = new ScreenManager();
		try {
			DisplayMode dm = s.findFirstCompatibleMode(modes1);
			s.setFullScreen(dm);
			loadImages();
			movieLoop();
		} finally {
			s.restoreScreen();
		}
		
	}
	
	//play movie
	public void movieLoop(){
		long startingTime = System.currentTimeMillis();
		long cumTime = startingTime;
		
		while(cumTime - startingTime < 6000) {
			long timePassed = System.currentTimeMillis() - cumTime;
			cumTime += timePassed;
			a.update(timePassed);
			
			//draw and update screen
			Graphics2D g = s.getGraphics();
			draw(g);
			g.dispose();
			s.update();
			
			try {
				Thread.sleep(20);
			} catch(Exception ex) {}
		}
	}
	
	//draws graphis
	public void draw(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(a.getImage(), 0, 0, null);
	}
}

