/**
 * 
 */
package airLineDialog;
import javax.swing.JOptionPane;
/**
 * @author nh133778
 *
 */
public class AirLineDialog {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
int selection;
boolean isYes;
selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
isYes = (selection == JOptionPane.YES_OPTION);
JOptionPane.showMessageDialog(null, "You responded " + isYes);
	}

}
