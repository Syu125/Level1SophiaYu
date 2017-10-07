import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener{
	char currentLetter;
	public static void main(String[] args) {
		TypingTutor t1=new TypingTutor();
		t1.run();
	}char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}void run(){
		JFrame f1=new JFrame();
		JLabel l1=new JLabel();
		f1.setVisible(true);
		l1.setVisible(true);
		l1.setFont(l1.getFont().deriveFont(28.0f));
		l1.setHorizontalAlignment(JLabel.CENTER);
		f1.addKeyListener(this);
		f1.setTitle("Type or Die");
		l1.setText(Character.toString(currentLetter));
		f1.add(l1);
		f1.pack();
			}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		
	}
	

}
