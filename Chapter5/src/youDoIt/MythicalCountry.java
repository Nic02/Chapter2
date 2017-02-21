/**
 * 
 */
package youDoIt;
import java.util.Scanner;
/**
 * @author NH133778
 *
 */
public class MythicalCountry {

	private static final double OT_RATE = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
double rate;
double hoursWorked;
double regularPay;
double overtimePay;
final int FULL_WEEK = 32;
final double OT_RSTE = 2;
final double GovernmentGetHalf = .5;
double afterTax;
Scanner keyboard = new Scanner(System.in);
System.out.print("How many hours did you work this week?");
hoursWorked = keyboard.nextDouble();
System.out.print("what is your regular pay rate? ");
rate = keyboard.nextDouble();
if(hoursWorked > FULL_WEEK)
{
regularPay = FULL_WEEK * rate;
overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
}
else
{
	regularPay = hoursWorked * rate;
	overtimePay = 0.0;
}
System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay);
 }
}