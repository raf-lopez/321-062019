package swingclasses;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class EventHandlingDemo2 extends JFrame {


	JButton btn = new JButton("Ready.");  // source
	JTextArea ta = new JTextArea("", 7, 20);
	
	public EventHandlingDemo2() {
		setLayout(new BorderLayout());
		add(ta, BorderLayout.NORTH);
		add(btn, BorderLayout.CENTER);
		
		btn.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ta.setText("You clicked on the button!");
			}
		} );
		this.pack();
	}

	public static void main(String[] args) {
		new EventHandlingDemo2().setVisible(true);
	}

}
