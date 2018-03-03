package LeagueInvaders;
import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame f1;
	GamePanel gp;
	public static void main(String[] args) {
		LeagueInvaders LI = new LeagueInvaders();
		LI.setup();
	}
	public LeagueInvaders() {
		f1 = new JFrame();
		gp = new GamePanel();
		f1.getContentPane().setPreferredSize(new Dimension(500, 800));
		f1.add(gp);
		f1.addKeyListener(gp);
        f1.pack();
	}
	void setup() {
		final int w = 500;
		final int h = 800;
		f1.setSize(w, h);
		f1.setVisible(true);
		gp.startGame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
