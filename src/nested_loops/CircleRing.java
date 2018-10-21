package nested_loops;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
Robot hi = new Robot();
hi.miniaturize();

       //  2. Set your robot’s position to x=150 and y=200
hi.setX(150);
hi.setY(200);
        // 3. Put the robot's pen down
hi.penDown();
        // 4. Set the robot’s speed to 10
hi.setSpeed(2147483647);
        // 5. Do everything below here 360 times (use i as the counter)
for(int i= 0; i<360;i++) {

	        // 6. Move the robot 3 pixels
hi.move(3);
       //  7. Turn the robot 1 degree
hi.turn(1);

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)..
if(i%20 == 0) {
		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)
	for(int j= 0; j<360;j++) {
		hi.setRandomPenColor();
				// 10. Move the robot 1 pixel
hi.move(1);
				// 11. Turn the robot 1 degree
hi.turn(1);
}
}
}
}
}
