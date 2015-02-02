package model.tutorialclasses;

import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import client.controllers.Core;

public class KeyTest extends Core implements KeyListener {
	public static void main(String[] args) {
		new KeyTest().run();
	}
	private String mess = "";
	
	//init also call init from superclass
	public void init() {
		super.init();
		Window w = s.getFullScreenWindow();
		
		//disables tab and other traversal keys
		w.setFocusTraversalKeysEnabled(false);
		w.addKeyListener(this);
		mess = "press escape to exit";
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ESCAPE) {
			stop();
		} else {
			mess = "Pressed : " + KeyEvent.getKeyText(keyCode);
			//disallows multiple key presses such as alt+f
			e.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		mess = "Released : " + KeyEvent.getKeyText(keyCode);
		e.consume();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		e.consume();	
	}

	@Override
	public synchronized void draw(Graphics2D g) {
		Window w = s.getFullScreenWindow();
		g.setColor(w.getBackground());
		g.fillRect(0, 0, s.getWidth(), s.getHeight());
		g.setColor(w.getForeground());
		g.drawString(mess, 30, 30);
	}
}
