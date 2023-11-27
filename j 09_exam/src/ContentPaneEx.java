import java.awt.*;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame{

	public ContentPaneEx() {
		this.setTitle("JFrame Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		//c.setLayout(new BorderLayout());
		//c.setLayout(new FlowLayout());
		JPanel n = new JPanel();
		n.setBackground(Color.LIGHT_GRAY);
		
		
		JLabel la = new JLabel("Hello");
		la.setLocation(90, 10);
		la.setSize(100, 20);
		
		JLabel lb = new JLabel("Java");
		lb.setLocation(10, 150);
		lb.setSize(100, 20);
		
		JLabel lc = new JLabel("Love");
		lc.setLocation(180, 130);
		lc.setSize(100, 20);
		
		JButton btn1 = new JButton("Open");
		JButton btn2 = new JButton("Read");
		JButton btn3 = new JButton("Close");
		
		n.add(btn1);
		n.add(btn2);
		n.add(btn3);
		
		JPanel s = new JPanel();
		s.setLayout(null);
		
		s.add(la);
		s.add(lb);
		s.add(lc);
		
		c.add(s, BorderLayout.CENTER);
		c.add(n, BorderLayout.NORTH); // Panel
		
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
