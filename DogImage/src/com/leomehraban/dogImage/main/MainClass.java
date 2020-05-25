package com.leomehraban.dogImage.main;

import javax.swing.JFrame;

import com.leomehraban.dogImage.game.*;

public class MainClass {

	public static void main(String[] args) {
		JFrame window = new JFrame("Dog Thing");
		Game gameThinggey = new Game();
		window.getContentPane().add(gameThinggey);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setSize(500,500);
		window.setResizable(true);
	}

}
