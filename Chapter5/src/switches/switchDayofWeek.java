/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author NH133778
 *
 */
public class switchDayofWeek 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String day;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day during the week for your schedule? >>>> ");
        day = input.nextLine();
        switch(day)
      {
        case "Monday":
	         System.out.print("Reserve room for Friday meeting");
	         break;
        case "Tuesday":
        case "tuesday":
	         System.out.print("Meeting with the Principal your fired. ");
	         break;
        case "Wednesday":
             System.out.print("We get to leave early today");
        case "Friday":
             System.out.print("Its Friday there is about to be a party");
	   default:
		     System.out.print("That day does not exist to the known realm. ");
      }
    }
	
}