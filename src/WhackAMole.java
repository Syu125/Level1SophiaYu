import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener{
	
	Random t=new Random();
	int o=t.nextInt(18);
	int count=0;
public static void main(String[] args) {
	WhackAMole w=new WhackAMole();
	w.run();
}
JFrame f1=new JFrame();
	JPanel p1=new JPanel();
	JButton b[]=new JButton[18];
void run() {
	
	f1.setSize(300, 300);
	f1.add(p1);
	f1.setVisible(true);
	p1.setVisible(true);
	drawButtons(o);
f1.validate();
}
 void drawButtons(int r) {
	
	
	for(int i=0;i<b.length;i++) {
		b[i]=new JButton();
		p1.add(b[i]);
		b[i].setVisible(true);
		b[i].addActionListener(this);
	}
b[r].setText("mole!");
}

void speak(String words) {
try {
	Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b[o]) {
		speak("hooray!");
		count+=1;
		if(count%10==0) {
			endGame(null, 10);
		}
		f1.dispose();
		o=t.nextInt(18);
		run();
		
		
	}else {
		speak("Ha ha");
	}
}
}




