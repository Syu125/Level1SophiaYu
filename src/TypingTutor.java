import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TypingTutor implements KeyListener{
	char currentLetter=generateRandomLetter();
int count=0;
	public static void main(String[] args) {
		
		TypingTutor t1=new TypingTutor();
		t1.run();
		
		
	}char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}JLabel l1=new JLabel(Character.toString(currentLetter));
	JFrame f1=new JFrame();
	void run(){
		
		f1.setSize(300,200);
		f1.setVisible(true);
		f1.add(l1);
		l1.setFont(l1.getFont().deriveFont(28.0f));
		l1.setHorizontalAlignment(JLabel.CENTER);
		f1.addKeyListener(this);
		f1.setTitle("Type or Die");
		l1.setVisible(true);
		f1.validate();
		
			}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key=e.getKeyChar();
	System.out.println("You typed: " + key  ); 
	if(currentLetter == e.getKeyChar()) {
		f1.getContentPane().setBackground(Color.GREEN);
		System.out.println("Correct!");
		count+=1;
		if(count%5==0) {
			showTypingSpeed(5);
		}
	}else {
		f1.getContentPane().setBackground(Color.RED);
		System.out.println("Wrong!");
	}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter=generateRandomLetter();
		l1.setText(Character.toString(currentLetter));
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}
	Date timeAtStart = new Date();


}
