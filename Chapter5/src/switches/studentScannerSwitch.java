/**
 * 
 */
package switches;
import javax.swing.JOptionPane;
/**
 * @author NH133778
 *
 */
public class studentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int studentNumber;

      String studentString;
      
      //Scanner input = new Scanner(System.in);
      
      //System.out.print("Please scan the student ID >>>>> ");
      //user = input.nextInt();
      studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID >>>>>", "Enter User ID #",
    JOptionPane.QUESTION_MESSAGE, null,null,"");
      studentNumber = Integer.parseInt(studentString);
      
      if (studentNumber >= 100000 || studentNumber <= 4000000)
        { 
         switch(studentNumber)
                 {
         //collect everyones book district scanner number or the students id
         case 274896:
        	 JOptionPane.showMessageDialog(null, "Andrew Mckenzie Java Book, he is in the 10th grade. ");
        	 break;
         case 122552:
        	 JOptionPane.showMessageDialog(null, "Computer located in room 161 John Brosius");
        	 break;
         case 133128083:
        	 JOptionPane.showMessageDialog(null, "thats a random disk on Mr. brosius desk");
             break;
         case 273885:
        	  JOptionPane.showMessageDialog(null, "Student Charles Carlsrom");
        	  break;
        	                                                         
         case 316282:
        	 JOptionPane.showMessageDialog(null, "Student Ress Alzahrani");
        	 break;
        	                                                         
         case 374884:
        	 JOptionPane.showMessageDialog(null, "Student Tatyana Vaughn");
        	 break;
        	                                                         
         case 133778:
        	 JOptionPane.showMessageDialog(null, "Student Nicolas Hasson");
        	 break;
         case 131457:
        	 JOptionPane.showMessageDialog(null, "Student Kassie Remley");
        	 break;
        	                                                        
         case 137412:
        	 JOptionPane.showMessageDialog(null, "Student Sebastian Frick");
             break;
        	                                                          
         case 131147:
        	 JOptionPane.showMessageDialog(null, "Student Zack Dorris");
        	 break;
        	                                                      
          
         default:
        	  JOptionPane.showMessageDialog(null, "Theat individual Does not exist");
              
                 }
       }
      else
      {
    	  JOptionPane.showMessageDialog(null,"That number is way to high!");
      }
	}
      }
