package GUIEx_1;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class WhoPanel extends JPanel {
	
	CommentPanel cp;
	
	public WhoPanel() {
		setLayout(new BorderLayout());
		
		cp = new CommentPanel("Name:");
		add(cp, BorderLayout.SOUTH);
	}
}
