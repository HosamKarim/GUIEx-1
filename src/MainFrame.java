package GUIEx_1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {
	JMenuBar bar;
	JMenu menu;
	JMenuItem item;
	
	public MainFrame(String title) {
		setTitle(title);
		setSize(550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bar = new JMenuBar();
		menu = new JMenu("File");
		item = new JMenuItem("Example");
		
		item.addActionListener(new itemListener());
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
	}
	
	static WhoPanel wp;
	static FunPanel fp;
	
	private class itemListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			wp.cp.setTxt("Hosam Alabdulkarim");
			fp.rbtn1.setSelected(true);
			fp.box1.setSelected(true);
			fp.box3.setSelected(true);
			fp.tf1.setText("21");
			fp.tf2.setText("Avatar");
			fp.tf3.setText("The Note");
		}
		
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame("Who Are You?");
		wp = new WhoPanel();
		fp = new FunPanel();
		
		
		mf.setLayout(new BorderLayout());
		mf.add(wp, BorderLayout.SOUTH);
		mf.add(fp);
		mf.setVisible(true);
	}

}
