/**
 * 
 */
package testing;

import java.util.Scanner;
/**
 * @author NH133778
 *
 */
public class Testing3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Creating Scanner class inputs
String strNum1;
		int num1;
		int num2;
		int num3;
		int num4;
		int answer;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your first number >>>>");
		num1 = inputDevice.nextInt();
		inputDevice.nextLine();
		
		
		System.out.print("Please enter your first number >>>>");
		num2 = inputDevice.nextInt();
		inputDevice.nextLine();
		
		
		System.out.print("Please enter your first number >>>>");
		num3 = inputDevice.nextInt();
		inputDevice.nextLine();
		
	
		System.out.print("Please enter your first number >>>>");
		num4 = inputDevice.nextInt();
		
		answer = num1 + num2 + num3 + num4;
		
		System.out.print("The total of all four numbers is =" + answer); 
		

	}

}
