import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
int n1=Integer.parseInt(JOptionPane.showInputDialog("What is your first number?"));
int n2=Integer.parseInt(JOptionPane.showInputDialog("What is your second number?"));
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What operation do you want to use?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Addition", "Subtraction", "Multiplication", "Division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if(operation==(1)) {
	add(n1,n2);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

		static void add(int number1,int number2) {
			int sum=number1+number2;
			JOptionPane.showMessageDialog(null, number1+" + "+number2+" = "+sum);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
}