package algorithms;

import javax.swing.JOptionPane;

public class Prime_or_not {

	
	public static void main(String[] args) {
	String numbers = JOptionPane.showInputDialog("type a number and i well tell you if it's Prime or not.");
	int lol = (Integer.parseInt(numbers));
	for (int i = 2; i <= 20; i++) {
		System.out.println(i);
	if(lol%i==0) {
		JOptionPane.showMessageDialog(null, "this is a composite number");
		break;
		}
	
	}
	}
}
