import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MySecondSwingGUI {
public static void main(String[] args) {
	
	JFrame jf = new JFrame();
	
	jf.setVisible(true);
	
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel jp = new JPanel();
	
	jf.add(jp);
	
	JLabel jl = new JLabel();
	
	jl.setText("meh");
	
	jf.add(jl);
	
	jf.pack();
	
	jl.setIcon(loadImage());
	
	jf.pack();
}

public static ImageIcon loadImage() {
	try {
		return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("grey-kitten.jpg")));
	} catch (IOException e) {

		return null;
	}
}
}
