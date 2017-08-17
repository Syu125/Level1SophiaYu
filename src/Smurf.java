/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;
	private String hatColor;
	private String gender;

	Smurf(String name) {
		this.name = name;
	}
		public String getName() {
		return "My name is " + name + ".";
		}
	
	public void hi(){
		System.out.println("This is " + name + ".");
	}
	
	public void eat() {
		System.out.println(name + " is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	void setHatColor(String hatColor){
		this.hatColor = hatColor;
		}
		public String getHatColor() {
		// 3. Fill in this method
			return name + " wears a " + hatColor + " hat.";	
			}
	public void hat(){
		System.out.println(name + " wears a " + hatColor + " hat.");
	}
	
	/* Smurfette is the only female Smurf. */
	void setSmurfGender(String gender){
		this.gender = gender;
	}
	public String isGirlOrBoy() {
		// 4. Fill in this method
		return name + " is a " + gender;
	}
	public void smurfGender(){
		System.out.println(name + " is a " + gender+ ".");
	}
}



