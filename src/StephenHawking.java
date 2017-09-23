import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StephenHawking implements KeyListener {
	
    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args){
		StephenHawking sh=new StephenHawking();
		sh.name();
	   
	}  void name(){
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.addKeyListener(this);
	    }
    // 2. ask the user for a sentence
    // 3. call the speak method below and send it the sentence
    // 4. repeat steps 2 and 3 a lot of times

/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		speak(Character.toString(e.getKeyChar()));
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



}

// Copyright Wintriss Technical Schools 2014


