package swingclasses;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class MySwingFrame extends JFrame{
	JButton btn = new JButton("Click me.");
	JRadioButton rbApple = new JRadioButton("Apple");
	JRadioButton rbGrapes = new JRadioButton("Grapes");
	JRadioButton rbMelon = new JRadioButton("Melon");
	ButtonGroup btnGroup = new ButtonGroup();
	JMenuBar mb = new JMenuBar();
	JMenu menuFile = new JMenu("File");
	JMenuItem miNew = new JMenuItem("New...");
	JMenuItem miQuit = new JMenuItem("Quit");

	public MySwingFrame() {
		this.setLayout(new BorderLayout());
		this.add(btn);
		
		this.add(rbApple);
		this.add(rbGrapes);
		this.add(rbMelon);

		btnGroup.add(rbApple);
		btnGroup.add(rbGrapes);
		btnGroup.add(rbMelon);
		
		menuFile.add(miNew);
		menuFile.addSeparator();
		menuFile.add(miQuit);

		mb.add(menuFile);
		this.add(mb, BorderLayout.PAGE_START);
	}

	public static void main(String[] args) {
		MySwingFrame frame = new MySwingFrame();
		frame.setTitle("My Frame");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
