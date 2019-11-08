package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot BB8 = new Robot();

        // 3. Put the robot's pen down
BB8.penDown();

        // 6. Make the robot move as fast as possible
BB8.setSpeed(100);

int distance = (200);

for (int i = 0; i < 4; i++) {
	BB8.move(distance);
	BB8.turn(90);
	
}
        // 5. Do everything below here 4 times
BB8.turn(-90);

for (int i = 0; i < 4; i++) {
	BB8.move(distance);
	BB8.turn(90);


}
BB8.turn(-90);
        //         2. Move your robot 200 pixels
for (int i = 0; i < 4; i++) {
	BB8.move(distance);
	BB8.turn(90);
}
BB8.turn(-90);
//         2. Move your robot 200 pixels
for (int i = 0; i < 4; i++) {
BB8.move(distance);
BB8.turn(90);
}

BB8.move(distance);

BB8.turn(90);
//         2. Move your robot 200 pixels
for (int i = 0; i < 4; i++) {
BB8.move(distance);
BB8.turn(90);
}
BB8.turn(180);
for (int i = 0; i < 4; i++) {
BB8.move(distance);
BB8.turn(90);
}
BB8.turn(-180);
for (int i = 0; i < 4; i++) {
BB8.move(distance);
BB8.turn(90);
}
        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
