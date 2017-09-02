import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChuckleClicker implements ActionListener{
	JButton button=new JButton();
		JButton button2=new JButton();
	public static void main(String[] args) {
		ChuckleClicker Chuck=new ChuckleClicker();
		Chuck.makeButtons();
	}

	 void makeButtons(){
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		
		frame.setSize(250, 100);
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(button);
		panel.add(button2);
		button.setVisible(true);
		button2.setVisible(true);
		button.setText("joke");
		button2.setText("punchline");
		button.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");
		if(e.getSource() == button) {
			JOptionPane.showMessageDialog(null, "MATH");
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "Mental Abuse To Humans");
		}
	}
	
}
