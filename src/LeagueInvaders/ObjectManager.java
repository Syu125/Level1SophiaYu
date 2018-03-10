package LeagueInvaders;

import java.awt.Graphics;

public class ObjectManager {
 Rocketship r2;
	public ObjectManager(Rocketship r) {
		r2 = r;
	}
	void update() {
		r2.update();
	}
	void draw(Graphics g) {
		r2.draw(g);
	}
}
