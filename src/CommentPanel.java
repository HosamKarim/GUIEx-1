package GUIEx_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CommentPanel extends JPanel {
	JLabel label;
	JTextArea txt;
	
	public CommentPanel(String newlabel) {
		Font font = new Font("Verdana", Font.ITALIC, 18);
		
		label = new JLabel(newlabel);
		txt = new JTextArea("",1,500);
		txt.setFont(font);
		txt.setForeground(Color.RED);
		
		setLayout(new BorderLayout());
		
		add(label,BorderLayout.NORTH);
		add(txt, BorderLayout.SOUTH);
	}
	
	public void setTxt(String s) {
		txt.setText(s);
	}
	
	
}
