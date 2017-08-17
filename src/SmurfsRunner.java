
public class SmurfsRunner {
	public static void main(String[] args) {
		Smurf smurf=new Smurf("Handy Smurf");
		smurf.getName();
		smurf.hi();
		smurf.eat();
		smurf.setHatColor("white");
		smurf.hat();
		smurf.setSmurfGender("boy");
		smurf.smurfGender();
			System.out.println();
		
		Smurf smurf2=new Smurf("Papa Smurf");
		smurf2.getName();
		smurf2.hi();
		smurf2.eat();
		smurf2.setHatColor("red");
		smurf2.hat();
		smurf2.setSmurfGender("boy");
		smurf2.smurfGender();
			System.out.println();
		
		Smurf smurf3=new Smurf("Smurfette");
		smurf3.getName();
		smurf3.hi();
		smurf3.eat();
		smurf3.setHatColor("white");
		smurf3.hat();
		smurf3.setSmurfGender("girl");
		smurf3.smurfGender();
	}
}
