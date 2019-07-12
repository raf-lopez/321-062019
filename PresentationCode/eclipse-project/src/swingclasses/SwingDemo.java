package swingclasses;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingDemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Window");
		frame.setSize(400,200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
