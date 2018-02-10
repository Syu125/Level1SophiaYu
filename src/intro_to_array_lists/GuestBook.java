import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	JFrame f1 = new JFrame();
	JPanel p1 = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	String allNames = "";
	String number = "";
	int count = 0;
	ArrayList<String>name = new ArrayList<>();
	
	public static void main(String[] args)  {
	GuestBook gb = new GuestBook();
	gb.create();
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
void create() {
	f1.setVisible(true);
	f1.add(p1);
	p1.setVisible(true);
	p1.add(b1);
	p1.add(b2);
	b1.setVisible(true);
	b1.setText("Add Name");
	b2.setVisible(true);
	b2.setText("View Names");
	b1.addActionListener(this);
	b2.addActionListener(this);
	f1.pack();
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		count++;
		name.add(JOptionPane.showInputDialog("Enter in a name."));
		
	}
	
	if(e.getSource()==b2) {
		for(int i = 0; i<name.size();i++) {
			int n = i+1;
			number = "Guest #" + n + ": ";
			allNames = allNames + "\n"+ number + name.get(i);
			if(i==name.size()-1) {
			JOptionPane.showMessageDialog(null, allNames);
			allNames = "";
			number = "";
		
			}
		}
	}
	}

}
	