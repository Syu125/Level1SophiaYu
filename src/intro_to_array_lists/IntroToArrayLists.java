package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {

	public static void main(String[] args) {
		IntroToArrayLists ital = new IntroToArrayLists();
	ital.run();
	}
	void run() {
		String list = "";
		String e = "e";
		int count = 0;
		//1. Create an array list of Strings
		ArrayList<String>a = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		
		for(int j = 0; j<5; j++) {
			
		a.add(JOptionPane.showInputDialog("List a type of fruit."));
		}
		//3. Print all the Strings using a standard for-loop
		/*for(int i = 0; i <a.size(); i++) {
			list += a + "\n" ;
			if(i == a.size()-1) {
			JOptionPane.showMessageDialog(null, list);
			}
			list = "";
		}*/
		//4. Print all the Strings using a for-each loop
		/*for(String item: a) {
			list += a + "\n" ;
			JOptionPane.showMessageDialog(null, list);			
			list = "";
		}*/
		//5. Print only the even numbered elements in the list.
		/*for(int i = 0; i <a.size(); i++) {
			count++;
		if(i%2==0) {
			list += a + "\n" ;
			if(i == a.size()-1) {
				JOptionPane.showMessageDialog(null, list);
				}
				list = "";
		}else {
			list="";
		}*/
		//6. Print all the Strings in reverse order.
		/*for(int i = 0; i <a.size(); i++) {
			
			list += a + "\n" ;
			if(i == a.size()-1) {
			JOptionPane.showMessageDialog(null, list);
			}
			list = "";
		}*/
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i = 0; i <a.size(); i++) {
			String keep = a.get(i);
			
				if(keep.contains(e)) {
					list += a + "\n" ;
					
			if(i == a.size()-1) {
				JOptionPane.showMessageDialog(null, list);
			}
		}
		}
	}
	}
	

