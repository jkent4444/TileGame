package model.tutorialclasses;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class MainScreen extends JFrame {
	public static void main(String[] args) {
		
		//width, height, bit color, freshRate
		DisplayMode dm = new DisplayMode(1920, 1080, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		MainScreen ms = new MainScreen();
		ms.run(dm);
	}
	
	public void run (DisplayMode dm) {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setFont(new Font("Arial", Font.PLAIN, 24));	
		Screen s = new Screen();
		try{
			s.setFullScreen(dm, this);
			try{
				Thread.sleep(5000);
			} catch (Exception ex) {}
			
		} finally {
			s.restoreScreen();
		}
	}
	
	public void paint(Graphics g) {
		//changes g to graphics 2d to round edges off letters
		if(g instanceof Graphics2D){
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		g.drawString("This is gonna be awesome", 200, 200);
	}
}
