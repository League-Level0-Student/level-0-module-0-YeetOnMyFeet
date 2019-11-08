package _00_welcome;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bb8 = new Robot();
	bb8.setSpeed(25);
	bb8.setPenColor(250, 20, 100);
	bb8.setPenWidth(500);
	bb8.sparkle();
	bb8.penDown();
	for (int i = 0; i < args.length; i++) {
		bb8.move(100);
		bb8.turn(90);
	
		
	}
		
		
	}
}
