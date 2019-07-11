package threading2;

import javax.swing.JOptionPane;

public class Exercise9_2_TEMPLATE {
	public static void main(String[] args) {
		while(true) {
			String input = JOptionPane.showInputDialog("Send Mail To:");
			if (input == null) break; // user has cancelled
			// (5) Create mail sender thread here
			// (6) Set thread object attribute 'recipient' to user input from above
			// (7) Start thread
		}
	}
}

// (1) create mail sender class
class MailSenderThread extends Thread {
	// (2) create recipient attribute
	
	public void run() {
		// (3) pause 5 seconds
		// (4) display message sent dialog, also displaying recipient
	}
}
