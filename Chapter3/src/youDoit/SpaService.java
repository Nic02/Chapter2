/**
 * 
 */
package youDoit;

/**
 * @author nh133778
 *
 */
public class SpaService 
{
		private String serviceDescription;
		private double price;
/**
	 * @param args
	 */
	public void setServiceDescription(String service)
	{
			// TODO Auto-generated method stub
	serviceDescription = service;
	}
	
	public void setPrice(double pr) 	

	{
	price = pr;
	
	}
	public String getServiceDescription()
	{
		return serviceDescription;
	}
	public double getPrice()
	{
		return price;
	}
}