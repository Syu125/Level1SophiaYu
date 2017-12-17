import javax.swing.JFrame;
import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	static int x= 10;
	static int y= 10;
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";

// 1. Create a frame & make it visible
JFrame f1 = new JFrame();
f1.setVisible(true);
		// 2. Add the panel to the frame
		f1.add(panel);
		// 3. Set the background image of the panel to the Galapagos Islands 
panel.setBackgroundImage(galapagosIslands);
f1.pack();
		// 4. Instantiate a Turtle 
Turtle turtle[] = new Turtle[50];

// 5. Add the turtle to the panel 
		
		
		// 6. Put 50 Turtles on the beach
for(int i=0;i<turtle.length;i++){
	turtle[i]= new Turtle();
	panel.addTurtle(turtle[i]);
	x+=7;
	y+=7;
	turtle[i].setX(x);
	turtle[i].setY(y);
}
	}
}

