package model.tutorialclasses;

import java.awt.*;
import javax.swing.JFrame;

/**
 * 
 * @author John
 *
 */
public class Screen {
	
	//your GPU
	private GraphicsDevice vc;
	
	/**
	 * Sets value of vc to your video card
	 */
	public Screen() {
		//environment objects controls the graphics settings not just screen
		GraphicsEnvironment env = 
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		//gets access from screen
		vc = env.getDefaultScreenDevice();
		
	}
	
	/**
	 * converts window to fullscreen
	 * 
	 * @param dm Monitor settings (etc framerate)
	 * @param window
	 */
	public void setFullScreen(DisplayMode dm, JFrame window){
		//removes border minimize, close, Maximize
		window.setUndecorated(true);
		
		//disallows resizing
		window.setResizable(false);
		
		//sets vc to fullscreen
		vc.setFullScreenWindow(window);
		
		if(dm !=null && vc.isDisplayChangeSupported()) {
			try{ 
				vc.setDisplayMode(dm);
			} catch (Exception ex) {}
		}
	}
	
	public Window getFullScreenWindow(){
		return vc.getFullScreenWindow();
	}
	
	public void restoreScreen(){
		
		Window w = vc.getFullScreenWindow();
		if(w != null) {
			w.dispose();
		}
		vc.setFullScreenWindow(null);
	}
}
