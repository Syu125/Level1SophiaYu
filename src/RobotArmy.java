public class RobotArmy {
	public static void main(String[] asd){
		//1. create a new human
Human person=new Human("Bob");
Human person2=new Human("Lob");
Human person3=new Human("Sob");
Human person4=new Human("Cob");
Human person5=new Human("Mob");
Human personAlive=new Human("Skip");
Human personAlive2=new Human("Clip");
Human personAlive3=new Human("Flip");
Human personAlive4=new Human("Slip");
Human personAlive5=new Human("Blip");
		//2. create a new Robot army of good and evil robots.
Robot badRobot=new Robot("Clank",true);
Robot badRobot2=new Robot("Sank",true);
Robot badRobot3=new Robot("Flank",true);
Robot badRobot4=new Robot("Dank",true);
Robot badRobot5=new Robot("Lank",true);
Robot goodRobot=new Robot("Linc", false);
Robot goodRobot2=new Robot("Flink", false);
Robot goodRobot3=new Robot("Mink", false);
Robot goodRobot4=new Robot("Bink", false);
Robot goodRobot5=new Robot("Sink", false);
		//3. command your robot army to destroy a human
badRobot.destroy(person);
badRobot2.destroy(person2);
badRobot3.destroy(person3);
badRobot4.destroy(person4);
badRobot5.destroy(person5);
goodRobot.destroy(personAlive);
goodRobot2.destroy(personAlive2);
goodRobot3.destroy(personAlive3);
goodRobot4.destroy(personAlive4);
goodRobot5.destroy(personAlive5);
	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}
	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	
	public Robot(String name, boolean isEvil){
		this.name = name;
		this.isEvil = isEvil;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
}

