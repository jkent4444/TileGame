package model.tutorialclasses;

import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import client.controllers.Core;

public class MouseInput extends Core implements KeyListener, MouseMotionListener, 
	MouseListener, MouseWheelListener{
	public static void main(String[] args) {
		new MouseInput().run();
	}
	private String mess = "";
	
	public void init() {
		super.init();
		Window w = s.getFullScreenWindow();
		w.addMouseListener(this);
		w.addMouseMotionListener(this);
		w.addMouseWheelListener(this);
		w.addKeyListener(this);
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		mess = "moving the mouse wheel";
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	
	@Override
	public void mousePressed(MouseEvent e) {
		mess = "you pressed down the mouse";
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		mess = "you released the mouse";		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mess = "you are dragging the mouse";
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mess = "you are moving your mouse";
		
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
		g.drawString(mess, 40, 50);
		
	}

}
