import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Spamalot implements ActionListener {
static final String FAKE_USERNAME = "puffclouds2.0@gmail.com";
static final String FAKE_PASSWORD = "gmailpuffclouds4life";
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	static JTextField tf=new JTextField(20);
	JButton b1=new JButton();
	JButton b2=new JButton();
 static String subject="";
	 static String message="";
	static String recipient=tf.getText();
public static void main(String[] args) {
	Spamalot s=new Spamalot();
	s.spam();
	s.sendSpam(recipient, subject, message);
	
}
void spam(){
	frame.setVisible(true);
	frame.add(panel);
	panel.setVisible(true);
	panel.add(tf);
	tf.setVisible(true);
	panel.add(b1);
	b1.setVisible(true);
	b1.setText("BAD");
	panel.add(b2);
	b2.setVisible(true);
	b2.setText("GOOD");
	b1.addActionListener(this);
	b2.addActionListener(this);

	frame.pack();
	
}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;


	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	System.out.println(sendSpam("leagueofamazing@gmail.com","hi","hi"));
	// TODO Auto-generated method stub
	if(e.getSource()==b1){
		subject="Hi, friend";
		message="I know where you live.";
		
	}if(e.getSource()==b2){
		subject="Congratulations!";
		message="You just won a free ticket to Disneyland!";
	}
}

}
