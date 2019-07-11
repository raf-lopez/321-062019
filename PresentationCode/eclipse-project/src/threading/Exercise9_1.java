package threading;

import javax.swing.JOptionPane;

public class Exercise9_1 {
	public static void main(String[] args) {
		while(true) {
			String recipient = JOptionPane.showInputDialog("Send Mail To:");
			MailSenderThread t = new MailSenderThread();
			t.recipient = recipient;
			t.start();
		}
	}
}

class MailSenderThread extends Thread {
	String recipient;
	
	public void run() {
		// pause 5 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "Message sent to " + recipient);
	}
}
