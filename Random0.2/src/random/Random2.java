/**
 * 
 */
package random;
import javax.swing.JOptionPane;
/**
 * @author NH133778
 *
 */
public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int guess;
		int result;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		final int LOW = 1;
		final int HIGH = 10;
		String msg;
		result = LOW + (int) (Math.random() * HIGH);
		int userGuess;
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		if(userGuess == result)
			msg = "\n Your Guess was RIGHT!";
		else
			if(userGuess < result)
				msg = "\n Your Guess was too low";
			else
				msg = "\nYour Guess was too low";
		JOptionPane.showMessageDialog(null,"The number is " + result + msg);

		int userGuess1;
		int userGuess2;
		int userGuess3;
		//int userGuess3;
		userGuess1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess my number between " + LOW + " and " + HIGH));
		userGuess2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess number between " + LOW + " and " + HIGH));
		userGuess3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Try to guess number between " + LOW + " and " + HIGH));
		if(userGuess1 == result1 && userGuess2 == result2 && userGuess3 == result3)
	       {
	    }
	}
}
