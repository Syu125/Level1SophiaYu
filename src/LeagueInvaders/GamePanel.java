package LeagueInvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer t1;
	Font titleFont;
	Font enterFont;
	Font instructFont;
	Font endFont;
	Font killFont;
	Font restartFont;
	Rocketship r1;
	ObjectManager om;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;

	public static BufferedImage alienImg;

	public static BufferedImage rocketImg;

	public static BufferedImage bulletImg;

	public static BufferedImage spaceImg;

	public GamePanel() {
		t1 = new Timer(1000 / 60, this);
		titleFont = new Font("Impact", Font.PLAIN, 50);
		enterFont = new Font("Tahona", Font.PLAIN, 30);
		instructFont = new Font("Tahona", Font.PLAIN, 30);
		endFont = new Font("Impact", Font.PLAIN, 50);
		killFont = new Font("Tahona", Font.PLAIN, 20);
		restartFont = new Font("Tahona", Font.PLAIN, 25);
		r1 = new Rocketship(250, 700, 50, 50);
		om = new ObjectManager(r1);
		try {

            alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));

            rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));

            bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));

            spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));

    } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

    }


	}

	void startGame() {
		t1.start();
	}

	void updateMenuState() {

	}

	void updateGameState() {
		om.update();
		om.manageEnemies();
		om.checkCollision();
		om.purgeObjects();
		if (r1.isAlive == false) {
			currentState = END_STATE;
		}
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 500, 800);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS", 80, 300);
		g.setFont(enterFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press ENTER to start", 100, 450);
		g.setFont(instructFont);
		g.setColor(Color.YELLOW);
		g.drawString("Press SPACE for instructions", 40, 500);

	}

	void drawGameState(Graphics g) {
		g.drawImage(spaceImg, 0, 0, 500, 800, null );
		om.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 500, 800);
		g.setFont(endFont);
		g.setColor(Color.BLACK);
		g.drawString("G A M E  O V E R", 100, 300);
		g.setFont(killFont);
		g.setColor(Color.BLACK);
		g.drawString("You killed " + om.score + " enemies", 140, 450);
		g.setFont(restartFont);
		g.setColor(Color.BLACK);
		g.drawString("Press ENTER to restart", 110, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
		repaint();

	}

	@Override
	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("1");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			System.out.println(currentState);
			if (currentState == END_STATE) {
				System.out.println("end");
				r1 = new Rocketship(250, 700, 50, 50);
				om = new ObjectManager(r1);

			}
			if (++currentState > END_STATE) {
				currentState = MENU_STATE;
				// System.out.println("2");
			}

		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			r1.x -= 20;

		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			r1.x += 20;

		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			om.addProjectile(new Projectile(r1.x, r1.y, 10, 10));
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("3 ");
	}
}
