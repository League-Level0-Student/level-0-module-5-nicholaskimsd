package nested_loops;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Joid {

public static void main(String[] args) {
	Robot hi = new Robot();
	hi.setSpeed(200);
	hi.miniaturize();
	hi.sparkle();
	hi.setX(500);
	hi.setY(500);
hi.penDown();
	int colorChoice=JOptionPane.showOptionDialog(null, "What color do you want", "Pen color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
if(colorChoice==0) {
	hi.setPenColor(255, 0, 0);
	
}
if(colorChoice==1) {
	hi.setPenColor(0, 255, 0);
	
}
if(colorChoice==2) {
	hi.setPenColor(0, 0, 255);
	
}
JOptionPane.showMessageDialog(null, "COOOOOOOOLLLLL BENZ");
JOptionPane.showMessageDialog(null, "So now we will decide what shape you want");
int shapeChoice=JOptionPane.showOptionDialog(null, "What shape do you want", "Shape", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"circle","square", "triangle"}, 0);
if(shapeChoice==0) {
	drawCircle(hi);
}
if(shapeChoice==1) {
drawSquare(hi);
}
if(shapeChoice==2) {
	drawTriangle(hi);
}

}
private static void drawCircle(Robot hi) {
	for(int i = 0; i<360;i++) {
		hi.turn(1);
		hi.move(1);
	}
	
}
private static void drawSquare(Robot hi) {
	hi.move(90);
	hi.turn(90);
	hi.move(90);
	hi.turn(90);
	hi.move(90);
	hi.turn(90);
	hi.move(90);
	hi.turn(90);
}
private static void drawTriangle(Robot hi) {
	hi.turn(20);
	hi.move(100);
	hi.turn(140);
	hi.move(120);
	hi.turn(130);
	hi.move(100);
	
}
	


	
}


