/**
 * 
 */
package NumbersDemo;
import javax.swing.JOptionPane;
/**
 * @author NH133778
 *
 */
public class NumbersDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

displayNumberPlusFive ();
displayNumberSquared ();
displayTwiceTheNumber ();
	}

	private static void displayNumberSquared() 
	{
		// TODO Auto-generated method stub
	 int num1;
	 int num2;
	 String userinput;
	 userinput = JOptionPane.showInputDialog(null,"Please enter your number for a number squared");
	 num1 = Integer.parseInt(userinput);
	 
	 num2 = num1 * num1;
	 System.out.println(num1 + " squared = " + num2);
		
	}

	private static void displayNumberPlusFive() 
	{
		// TODO Auto-generated method stub
		int num3;
		int num4;
		String userinput;
		userinput = JOptionPane.showInputDialog(null, "please enter your number plus 5");
		num3 = Integer.parseInt(userinput);
		num4 = num3 + 5;
		System.out.println(userinput + " + 5 = " + num4);
	}

	private static void displayTwiceTheNumber() 
	{
		// TODO Auto-generated method stub
		int num5;
		int num6;
		String userinput;
		userinput = JOptionPane.showInputDialog(null, "Please enter your number + enter whats twice that number");
		num5 = Integer.parseInt(userinput);
		num6 = num5 * 5;
		System.out.println(userinput + " * 5 = " + num6);
	}

}
