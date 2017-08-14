import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
public class House {
	static Robot houseDrawer=new Robot();
	
	public static void main(String[] args) {
		houseDrawer.setWindowColor(Color.black);
		
		houseDrawer.moveTo(10, 500);
	
		drawHouse("small");
		drawHouse("medium");
		drawHouse("small");
		drawHouse("large");
		drawHouse("medium");
		drawHouse("medium");
		drawHouse("large");
		drawHouse("small");
		drawHouse("medium");
		drawHouse("large");
	}
	static void drawHouse(String x) {
		int i=0;
		if(x.equals("small")) {
				i=60;
				houseDrawer.setPenColor(Color.red);
			}
			if(x.equals("medium")) {
				i=120;
				houseDrawer.setPenColor(Color.orange);
			}
			if(x.equals("large")) {
				i=250;
				houseDrawer.setPenColor(Color.blue);
			}
			houseDrawer.setSpeed(26);
			houseDrawer.penDown();
			houseDrawer.move(i);;
			houseDrawer.turn(45);
			houseDrawer.move(20);
			houseDrawer.turn(90);
			houseDrawer.move(20);
			houseDrawer.turn(45);
			houseDrawer.move(i);
			houseDrawer.setPenColor(Color.GREEN);
			houseDrawer.turn(-90);
			houseDrawer.move(30);
			houseDrawer.turn(-90);
		 }
	
}
