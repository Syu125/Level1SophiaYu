import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CardBattle {
	JFrame board = new JFrame();
	JPanel p1 = new JPanel();
	JLabel l1 = new JLabel();
	JLabel l2 = new JLabel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	ImageIcon ii1;
	ImageIcon ii2;

	public static void main(String[] args) {
		CardBattle cb = new CardBattle();
		cb.run();
	}

	void run() {
		ii1 = new ImageIcon(this.getClass().getResource("vaporeon.png"));
		ii2 = new ImageIcon(this.getClass().getResource("download.png"));
		

		board.setVisible(true);
		l1.setVisible(true);
		l2.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		p1.setVisible(true);
		board.add(p1);
		p1.add(l1);
		l1.setIcon(ii1);
		l2.setIcon(ii2);
		b1.setText("Attack");
		b1.setBounds(10, 400, 50, 100);
		b2.setBounds(400, 400, 10, 20);
		b2.setText("Attack");
		l1.contains(10, 10);
		l2.contains(400, 10);
		board.pack();
	
	}
}
