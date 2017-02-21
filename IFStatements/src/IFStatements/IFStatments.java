/**
 * 
 */
package IFStatements;
import java.util.Scanner;
/**
 * @author NH133778
 *
 */
public class IFStatments 
{

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int age; //
		input = new Scanner(System.in);
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt();
		if(age <=18)
		{
		    System.out.println("user is less than 18.");
		}
		if (age >= 19 && age <= 31)
		{
			System.out.println("Your kinda old");
		}
		
		if (age >=50 && age <=60)
			
		{	
	       System.out.println("You're pretty old");
		}
	    if(age >=66 && age <=100)
	    {
	    System.out.println("Being old come with great reposiblities");
	}
	
}


	
}