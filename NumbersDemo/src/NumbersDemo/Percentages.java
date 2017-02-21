/**
 * 
 */
package NumbersDemo;

import javax.swing.JOptionPane;

/**
 * @author nh133778
 *
 */
public class Percentages {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
computePercent();
	}

	private static void computePercent() 
	{
		// TODO Auto-generated method stub
	double num1;
	double num2;
	String userinput;
	userinput = JOptionPane.showInputDialog(null,"percentages");
	num1 = Integer.parseInt(userinput);
	num2 = num1 / 10;
	System.out.println(userinput +"/ 10 = " + num2+"%");
	}

}
