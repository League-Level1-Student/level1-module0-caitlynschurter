import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot X = new Robot();
	static Random rand = new Random();
	public static void main(String[] args) {
		
		X.moveTo(20, 575);
		X.miniaturize();
		X.setSpeed(50);
		X.setAngle(0);
		X.setPenWidth(5);
		X.penDown();
		X.setWindowColor(Color.BLACK);
		for (int i = 0; i < 9; i++) {
			String size = "";
			int sizeInt = rand.nextInt(3);
			if (sizeInt == 0) {
				size = "small";
			}

			else if (sizeInt == 1) {
				size = "medium";
			}

			else {
				size = "large";
			}
			drawHouse(size, new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
		}
	}

	public static void drawHouse(String height, Color color) {
		int heightInt = 0;
		if (height.equals("medium")) {
			heightInt = 120;
		}

		else if (height.equals("small")) {
			heightInt = 60;
		}

		else {
			heightInt = 250;
		}
		X.setPenColor(color);
		X.move(heightInt);
		
		//call woof
		drawWoof(rand.nextInt(2));
		
		X.move(heightInt);
		X.turn(270);
		X.setPenColor(94, 214, 43);
		X.move(50);
		X.turn(270);
	}
	public static void drawWoof(int woof) {
		if (woof == 0) {
			//flat woof
			X.turn(90);
			X.move(50);
			X.turn(90);
		}
		
		else {
			//pointed woof
			X.turn(45);
			X.move(25);
			X.turn(90);
			X.move(25);
			X.turn(45);
		}
		
	}
}
