package hello;
import javax.swing.JOptionPane;

public class PubEntry {

	public static void main(String[] args) {
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age :"));

		if(age>=18) {
			JOptionPane.showInputDialog(null,"so your our an adult !");
			JOptionPane.showInputDialog(null,"welcome to the Pub");
		}
		else {
			JOptionPane.showInputDialog(null,"Sorry ! Your Not an Adult");
			JOptionPane.showInputDialog(null,"Move from here please !");
		}
	}

}