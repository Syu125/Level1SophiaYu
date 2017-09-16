import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton b1=new JButton();
	JButton b2=new JButton();
	JButton b3=new JButton();

	public static void main(String[] args) {
		TootMachine tm=new TootMachine();
		tm.toot();
	}
		void toot(){
	frame.setVisible(true);
	frame.add(panel);
	panel.setVisible(true);
	panel.add(b1);
	b1.setVisible(true);
	panel.add(b2);
	b2.setVisible(true);
	panel.add(b3);
	b3.setVisible(true);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	frame.pack();
}
	
private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
	
	

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() ==b1) {
		playSound("laugh1.wav");
	}
	if(e.getSource() ==b2) {
		playSound("Laugh2.wav");
	}
	if(e.getSource() ==b3) {
		playSound("L7.wav");
	}
}
}