/**
 * 
 */
package methodConstruction;

/**
 * @author nh133778
 *
 */
public class ComputeCommission {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
char vType = 'S';
int value = 23000;
double commrate = 0.08;
computeCommission(value, commrate, vType);
computeCommission (40000, 0.10, 'L');
	}

	public static void computeCommission(int value, double rate, char vehicle) 
	{
		// TODO Auto-generated method stub
	double Commission;
	Commission = value * rate;
	System.out.println("\nThe " + vehicle + " type vehicle is worth $" + value);
	System.out.println("With " + (rate * 100) + "% Commission rate, the Commission is $" + Commission);
	}

}
