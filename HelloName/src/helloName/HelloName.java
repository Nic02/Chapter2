/**
 * 
 */
package helloName;
import javax.swing.JOptionPane;
/**
 * @author nh133778
 *
 */
public class HelloName {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String result;
	result = JOptionPane.showInputDialog(null, "what is your name?");
	
	JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
	}
	

}
