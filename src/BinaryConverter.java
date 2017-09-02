import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter  {
	
	public static void main(String[] args) {
		BinaryConverter s=new BinaryConverter();
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setSize(700, 70);
		JTextField answer=new JTextField(20);
		JTextField answer2=new JTextField(20);
		JButton button=new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.setVisible(true);
		panel.add(answer);
		panel.add(button);
		panel.add(answer2);
		button.setVisible(true);
		button.setText("convert");
	}
	int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		 if(!Pattern.matches("\2", binary)) {
			 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
				return 0;
		 }
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}


}
