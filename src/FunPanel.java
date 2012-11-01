package GUIEx_1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class FunPanel extends JPanel {
	
	JRadioButton rbtn1;
	JRadioButton rbtn2;
	JRadioButton rbtn3;
	
	ButtonGroup group;
	
	JCheckBox box1;
	JCheckBox box2;
	JCheckBox box3;

	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	
	JLabel lbl;
	
	JPanel firstJP;
	JPanel secondJP;
	JPanel jp1;
	JPanel jp2;
	JPanel txtPanel;
	
	CommentPanel cp;
	public FunPanel() {
		setLayout(new BorderLayout());
		
		cp = new CommentPanel("Feedback:");
		
		firstJP = new JPanel();
		secondJP = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		firstJP.setLayout(new GridLayout());
		secondJP.setBorder(new TitledBorder(new EtchedBorder(),"Movies:"));
		jp1.setBorder(new TitledBorder(new EtchedBorder(),"What Do You Do?"));
		jp2.setBorder(new TitledBorder(new EtchedBorder(),"Select beverages:"));
		
		rbtn1 = new JRadioButton("Studying");
		rbtn2 = new JRadioButton("Working");
		rbtn3 = new JRadioButton("NONE");
		group = new ButtonGroup();
		
		jp1.add(rbtn1);
		jp1.add(rbtn2);
		jp1.add(rbtn3);
		
		group.add(rbtn1);
		group.add(rbtn2);
		group.add(rbtn3);
		
		box1 = new JCheckBox("Tea");
		box2 = new JCheckBox("Soda");
		box3 = new JCheckBox("Coffee");
		
		box1.addActionListener(new BoxListener());
		box2.addActionListener(new BoxListener());
		box3.addActionListener(new BoxListener());
		
		jp2.add(box1);
		jp2.add(box2);
		jp2.add(box3);
		
		firstJP.add(jp1);
		firstJP.add(jp2);
		
		add(firstJP, BorderLayout.NORTH);
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		lbl = new JLabel("What are the top three movies that you like?");
		
		secondJP.add(lbl);
		secondJP.add(tf1);
		secondJP.add(tf2);
		secondJP.add(tf3);
		
		add(secondJP, BorderLayout.CENTER);
		
		txtPanel = new JPanel();
		txtPanel.add(cp, BorderLayout.CENTER);
		add(cp, BorderLayout.SOUTH);
	}
	
	private class BoxListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (box1.isSelected()) {
				if (box2.isSelected() || box3.isSelected()){
					cp.setTxt("Don't Mix!!");
				}
				else {
					cp.setTxt("Tea is the best for all times");
				}
			}
			if (box2.isSelected()) {
				if (box1.isSelected() || box3.isSelected()){
					cp.setTxt("Don't Mix!!");
				}
				else {
					cp.setTxt("Soda!! Well, don't drink too much");
				}
			}
			if (box3.isSelected()){
				if (box2.isSelected() || box1.isSelected()){
					cp.setTxt("Don't Mix!!");
				}
				else {
					cp.setTxt("Avoid drinking coffee at night...");
				}
			}
		add(cp, BorderLayout.SOUTH);
		}
	
	}

}
