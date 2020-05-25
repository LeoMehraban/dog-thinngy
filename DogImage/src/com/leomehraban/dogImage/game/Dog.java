package com.leomehraban.dogImage.game;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Dog extends Rectangle {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image pic;
	int posX,posY;
	int height,width;
	
	public Dog(int x,int y,int h,int w, String filename) {
		posX = x;
		posY = y;
		width = w;
		height = h;
		try {
			pic = ImageIO.read(new File(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void draw(Graphics g,Component c) {
		g.drawImage(pic, posX ,posY,width,height,c);
	}
}
