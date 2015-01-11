package model;
import java.awt.*;

import javax.swing.JFrame;

public class MainScreen extends JFrame {
	public static void main(String[] args) {
		
		//width, height, bit color, freshRate
		DisplayMode dm = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
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
}
