import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	JFrame f1=new JFrame();
		JPanel p1=new JPanel();
		JButton b1=new JButton();
		JButton b2=new JButton();
	public static void main(String[] args) {
		NastySurprise ns=new NastySurprise();
		ns.run();
	}void run(){
		
		f1.setVisible(true);
		f1.add(p1);
		p1.setVisible(true);
		p1.add(b1);
		p1.add(b2);
		b1.setText("Trick");
		b2.setText("Treat");
		b1.setVisible(true);
		b2.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f1.pack();
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			showPictureFromTheInternet("https://i.pinimg.com/236x/d6/69/4c/d6694cd378fcde4fadf6c1af296d0109--big-teddy-bear-chow-chow-puppies.jpg");
		}else {
			showPictureFromTheInternet("https://i.ytimg.com/vi/WwlMnX_u6kE/hqdefault.jpg");
			
		}
	}
}
