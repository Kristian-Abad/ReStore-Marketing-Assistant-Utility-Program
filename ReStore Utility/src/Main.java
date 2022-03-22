import TextGeneration.Generator;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Syntax: getText(String invNum, String itmName, String salePrice, String WW, String HH, String DD)
		
		String invNumber = JOptionPane.showInputDialog("Enter inventory number");
		String itemName = JOptionPane.showInputDialog("Enter item name");
		String price = JOptionPane.showInputDialog("Enter price (enter as\"$__\")");
		String width = JOptionPane.showInputDialog("Enter width (just the numbers)");
		String height = JOptionPane.showInputDialog("Enter height (just the numbers)");
		String depth = JOptionPane.showInputDialog("Enter depth (just the numbers)");

		
		
		Generator gen = new Generator();
		String result = gen.getText(invNumber, itemName, price, width, height, depth);
		
		
		JTextArea text = new JTextArea(result);
		JOptionPane.showMessageDialog(null, text,"ReStore Marketing Assistant Utility", JOptionPane.PLAIN_MESSAGE);
	}

}
