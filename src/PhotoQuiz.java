/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
		int points = 0;															// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select â€œCopy Image Addressâ€�)
		String kittyS = "http://youne.com/wp-content/uploads/2013/09/grey-kitten.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component kittyC;
		// 3. use the "createImage()" method below to initialize your Component
		kittyC = createImage(kittyS);

		// 4. add the image to the quiz window
		quizWindow.add(kittyC);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String catQuestion = JOptionPane.showInputDialog("Do u like dis kitty \n Answer 'yes' or 'no'");
		// 7. print "CORRECT" if the user gave the right answer
		if (catQuestion.equals("yes")) {
			JOptionPane.showMessageDialog(quizWindow, "YAY", null, 0);
			points++;
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(quizWindow, "I don't like you anynmore... not dat i liked u anyway", null, 0);
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(kittyC);
		// 10. find another image and create it (might take more than one line of code)
		kittyS = "https://i.pinimg.com/736x/8d/3d/57/8d3d5780c61e1c9f1571a12ff5d8a3fe--so-kawaii-kawaii-art.jpg";
		kittyC = createImage(kittyS);
		// 11. add the second image to the quiz window
		quizWindow.add(kittyC);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		catQuestion = JOptionPane.showInputDialog("How bout dis kitty\n Answer 'yes' or 'no'");
		// 14+ check answer, say if correct or incorrect, etc.
		if (catQuestion.equals("yes")) {
			JOptionPane.showMessageDialog(quizWindow, "YAY", null, 0);
			points++;
		}

		else {
			JOptionPane.showMessageDialog(quizWindow, "I don't like you anynmore... not dat i liked u anyway", null, 0);
		}
		
		//14. add scoring to your quiz
		JOptionPane.showMessageDialog(quizWindow, "Your point value is " + points, null, 0);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
