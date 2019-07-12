package swingclasses;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventHandlingDemo1 extends JFrame{
	JButton btn;
	public EventHandlingDemo1() {
		setLayout(new FlowLayout());
		btn = new JButton("Click me.");
//		ActionListener handler = new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, "Label of button " + e.getActionCommand());
//			}
//		};
		ActionListener handler = 
			e -> JOptionPane.showMessageDialog(null, "Label of button " + 
		          e.getActionCommand());
		
		btn.addActionListener(handler);
		this.add(btn);
		this.pack();
	}

	public static void main(String[] args) {
		new EventHandlingDemo1().setVisible(true);
	}
}

