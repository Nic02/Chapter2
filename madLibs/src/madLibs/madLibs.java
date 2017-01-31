/**
 * 
 */
package madLibs;
import javax.swing.JOptionPane;
/**
 * @author NH133778
 *
 */
public class madLibs {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// MadLibs
String color, wordEst, bodyPartPlural, animal, noun, pluralNoun, wholeNumber;
int a = 5;
int b;
int c;

color = JOptionPane.showInputDialog(null, "What is your favorite color");

wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in Est");

bodyPartPlural = JOptionPane.showInputDialog(null, "Name a body part.");

wholeNumber = JOptionPane.showInputDialog(null, "Give me a number that is a whole number, no decimals.");
b = Integer.parseInt(wholeNumber);

animal = JOptionPane.showInputDialog(null, "What is your favorite animal");

noun = JOptionPane.showInputDialog(null, "Give me a noun");

pluralNoun = JOptionPane.showInputDialog(null, "Give me a plural noun");

c = a - b;
JOptionPane.showMessageDialog(null, "The " + color + " Dragon is the " + wordEst + 
		" Dragon of all. it has " + c + bodyPartPlural + " and a " + animal + "shaped like a" + noun +
		" it loves to eat " + pluralNoun + " although it will feat on nearly anything.");
	}

}
