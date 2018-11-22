package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot hi = new Robot();
		//2. Set the speed to 100
hi.setSpeed(217134);
hi.sparkle();
hi.miniaturize();
hi.penDown();
hi.setX(900);
hi.setY(500);

		int colorChoice=JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if(colorChoice==0) {
			hi.setPenColor(255,0,0);
		}
		else if(colorChoice==1) {
			hi.setPenColor(0,255,0);
		}
		else if(colorChoice==2) {
			hi.setPenColor(0,0,255);
		}
		//4. Ask the use how many polygons they want to be drawn.
	
		int foop=JOptionPane.showOptionDialog(null, "How many Polygons do you want to draw?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"1","5", "10"}, 0);
		
		//5. Use the robot to draw the number of polygons the user requested.
		if(foop==2) {
			for(int i = 0; i <10; i++) {
				drawPolygon(hi);
			}
		}
		else if(foop==1) {
			for(int i = 0; i <5; i++) {
				drawPolygon(hi);
			}
		}
		else if(foop==0) {
			drawPolygon(hi);
		}

		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}



private static void drawPolygon(Robot hi) {
	
hi.turn(-30);
	hi.move(100);
	hi.turn(60);
	hi.move(100);
	hi.turn(60);
	hi.move(100);
	hi.turn(60);
	hi.move(100);
	hi.turn(60);
hi.move(100);
hi.turn(60);
hi.move(100);
hi.turn(10);

}
}


