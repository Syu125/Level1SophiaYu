import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyButton implements MouseListener {
	public static void main(String[] args) {
		EasyButton eb=new EasyButton();
	
	eb.showEasyButton();
	//eb.mouseClicked(e);
	}
	
	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */

	JLabel easyButtonImage;

	private void showEasyButton() {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		URL imageURL = null;
		try {
			imageURL = new File("/Users/league/Google Drive/league-images/easy_button.jpg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}
		Icon icon = new ImageIcon(imageURL);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}


	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		speak("Animal Jumping");
	}


	@Override
	public void mousePressed(MouseEvent f) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent g) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent h) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent i) {
		// TODO Auto-generated method stub
		
	}


	

}

