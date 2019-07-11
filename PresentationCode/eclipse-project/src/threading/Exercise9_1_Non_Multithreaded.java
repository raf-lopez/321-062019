package threading;

import javax.swing.JOptionPane;

public class Exercise9_1_Non_Multithreaded {

	public static void main(String[] args) {
		while (true) {
			String input = JOptionPane.showInputDialog("Send Mail To:");
			if (input == null) break; // cancelled
			try {
				// pause 5 seconds
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Message sent to " + input);
		}
	}

}
