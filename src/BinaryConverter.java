import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JTextField answer=new JTextField(20);
		JTextField answer2=new JTextField(20);
		JButton button=new JButton();
	public static void main(String[] args ) {
		BinaryConverter s=new BinaryConverter();
		s.converter();
	}
		void converter() {
		frame.setSize(700, 70);
		
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(answer);
		panel.add(button);
		panel.add(answer2);
		button.setVisible(true);
		button.setText("convert");
		button.addActionListener(this);
		frame.setTitle("Converter");
	}
		 String convert(String binary) {
		   	 int asciiValue = Integer.parseInt(binary, 2);
		   	 char theLetter = (char) asciiValue;
		   	 return "" + theLetter;
		    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String one = answer.getText();
		answer2.setText(convert(one));
	}


}
