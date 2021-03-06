package model.tutorialclasses;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Images extends JFrame {
	public static void main(String[] args) {
		
		//width, height, bit color, freshRate
		DisplayMode dm = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Images i = new Images();
		i.run(dm);
	}
	
	private Screen s;
	private Image bg;
	private Image pic;
	private boolean loaded;
	
	//run method
	public void run (DisplayMode dm) {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 24));	
		loaded = false;
		s = new Screen();
		try{
			s.setFullScreen(dm, this);
			loadPics();
			try{
				Thread.sleep(5000);
				
			} catch (Exception ex) {}
			
		} finally {
			s.restoreScreen();
		}
	}
	
	//loads pictures
	public void loadPics() {
		bg = new ImageIcon("stars.jpg").getImage();
		pic = new ImageIcon("spaceship.jpg").getImage();
		loaded = true;
		repaint();
	}

	public void paint(Graphics g) {
		//changes g to graphics 2d to round edges off letters
		if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		if(loaded){
			g.drawImage(bg, 0, 0, null);
			g.drawImage(pic, 170, 180, null);
		}
	}
}
