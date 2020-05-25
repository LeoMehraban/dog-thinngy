package com.leomehraban.dogImage.game;



public class Animate implements Runnable {
	Game g;
	public Animate(Game game) {
		g = game;
	}
	@Override
	public void run() {
		while(true) {
			g.update();
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}