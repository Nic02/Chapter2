/**
 * 
 */
package chapter5Debugs;
import java.util.Scanner;
/**
 * @author nh133778
 *
 */
public class Chapter5Debugs3 {

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int item;
	      String output;
	      final int LOW = 111;
	      final int HIGH = 999;
	      final int CUTOFF = 500;
	      input = new Scanner(System.in);
	      System.out.println("Please enter item number");
	      item = input.nextInt();
	      if(item < LOW)
	         output = "Item number too low";
	      else
	        if(item > HIGH)
	          output = "Item number too high";
	        else
	          if(item < CUTOFF)
	             output = "Valid - in Automotive Department";
	          else
	             output = "Valid - Item in Housewares Department";
	       System.out.println(output);
	}

}
