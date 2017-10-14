import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {
public static void main(String[] args) {
	WhackAMole w=new WhackAMole();
	w.run();
}
void run() {
	JFrame f1=new JFrame();
	JPanel p1=new JPanel();
	f1.setSize(300, 300);
	f1.add(p1);
	f1.setVisible(true);
	p1.setVisible(true);
	JButton b[]=new JButton[18];
	for(int i=0;i<b.length;i++) {
		b[i]=new JButton();
		p1.add(b[i]);
		b[i].setVisible(true);
	}
f1.validate();
}
}
