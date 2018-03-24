package LeagueInvaders;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Alien extends GameObject{
	Random random = new Random();
	int pattern;
	public Alien(int x, int y, int width, int height) {
		super(x,y,width,height);
	}
	void update(){
		super.update();
		pattern = random.nextInt(10);
		y+=pattern;
	
	}
	void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.fillRect(x, y, width, height);
	}
}
