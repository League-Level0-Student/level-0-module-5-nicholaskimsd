package algorithms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skill_Practice {

	public static void main(String[] args) {
		String hi= JOptionPane.showInputDialog("how many dimes do you have");
		
	int lol = Integer.parseInt(hi);
	System.out.println(lol*.10);
String foop = JOptionPane.showInputDialog("how tall are you?");
int joe = Integer.parseInt(foop);
if(joe<36) {
	JOptionPane.showMessageDialog(null, "eat your weaties!");
}
else {
	JOptionPane.showMessageDialog(null, "I like trains");
}
	//practice 2
for(int i =0; i <30; i++) {
	if(i%3==0) {
		System.out.println(i);
	}
}
// practice 3
Random randy = new Random();
int r = randy.nextInt(20)-0 ;
System.out.println(r);
System.out.println("-");
Random ranndy = new Random();
int t = ranndy.nextInt(10)-0 ;
	System.out.println(t);
	System.out.println("------");
	System.out.println(r-t);
//practice 4
	String bob = JOptionPane.showInputDialog("WHere do you live, what city");
	JOptionPane.showMessageDialog(null, "Ps plz enter with all caps");
	if(bob.equals("SAN DIEGO")) {
		JOptionPane.showMessageDialog(null, "you live in Americas finest city");
	}
	else {
		JOptionPane.showMessageDialog(null, "Screw you why dont you live in San Diego!!!!!!");
	}
	String cars = JOptionPane.showInputDialog("how many cars do you have?");
	int ruff = Integer.parseInt(cars);
		if(ruff<0) {
			JOptionPane.showMessageDialog(null, "I bet you use public transportation");
		}
		else if(ruff<2) {
			JOptionPane.showMessageDialog(null, "I bet you have a Toyota bulldozer");
		}
		else if(ruff>1) {
			JOptionPane.showMessageDialog(null, "I bet you have "+ruff*4+ " wheels or tires");
			
		}
		//practice 5
		String caillou = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, caillou+" is a great school!");
	
	}
		
	}

