/**
 * 
 */
package random;

import javax.swing.JOptionPane;

/**
 * @author nh133778
 *
 */
public class Random {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int guess;
int result;
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
	}
	

}
