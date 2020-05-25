package com.leomehraban.dogImage.game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;



public class Game extends JPanel implements KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Dog dog;
	Animate a;
	Dog otherDog;
	public Game() {
		dog = new Dog(30,40,40,40,"dog.png");
		otherDog = new Dog(25,100,40,40,"guide-dog.png");
		addKeyListener(this);
		setFocusable(true);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {


	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			a = new Animate(this);
			new Thread(a).start();
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			dog.posX -= 15;
		}
		else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			dog.posX += 15;
		}
		else if (e.getKeyCode() == KeyEvent.VK_UP) {
			dog.posY -= 15;
		}
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			dog.posY += 15;
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) {
			otherDog.posY -= 15;
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			otherDog.posX -= 15;
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			otherDog.posY += 15;
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			otherDog.posX += 15;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	public void update() {
		repaint();
	}
	public void paintComponent(Graphics g) {
		dog.draw(g, this);
		otherDog.draw(g, this);
	}

}
