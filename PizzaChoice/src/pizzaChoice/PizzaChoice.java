/**
 * 
 */
package pizzaChoice;
import java.util.Scanner;
/**
 * @author NH133778
 *
 */
public class PizzaChoice 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String choiceYes; //user is selecting that that have made a choice
        String size;
        String pizzaKind = null;
    
        double mediumCost = 4.00;
        double largeCost = 6.00;
        double smallCost = 2.00;

        Scanner input = new Scanner(System.in);
        
        System.out.print("would you like a pizza? Yes or No>>>>>>");
        choiceYes = input.nextLine();
        //if you want pizza or not
        if("Yes".equals(choiceYes) || "yes".equals(choiceYes) || "Y".equals(choiceYes))
        {
          System.out.print("You said " + choiceYes + " to have a pizza.");
          System.out.print("Please choose a size, small, medium, or large>>>>");
          size = input.nextLine();//user determines size of pizza
          if("small".equals(size) || "medium".equals(size) || "large".equals(size))
          
          {
        	  System.out.print("You said " + size + " Pizza size.");
        	  System.out.print("What kind of pizza do you want? Pepperoni, Sausage, and or Cheese?>>>>");
        	  pizzaKind = input.nextLine();
        	  if("Pepperoni".equals(pizzaKind) || "Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind))
        	  {
        	      System.out.print("You said " + pizzaKind + " that sounds delicious");
        	      System.out.print("Your order consist of " + size + " pizza, with the toppings of " + pizzaKind);
        	      if("small".equals(size))
        	      {
        	    	  System.out.println("The cost of your pizza is $" + smallCost);
        	      }
        	         
        	      if("mediumCost".equals(size))//the next size
        	      {
        	    	  System.out.println("The cost of your pizza is $" + mediumCost);
        	      }
        	      //The next if statement        
        	      if("largeCost".equals(size))
        	      {
        	    	  System.out.println("The cost of your pizza is $" + largeCost);
        	      }
        	    	  
        	  }
        	 
          }
          }//first if
     }//main
}//pc