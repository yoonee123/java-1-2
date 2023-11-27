package GUI;

import java.awt.*;
import javax.swing.*;

public class ContantPaneEx extends JFrame {
	
	public ContantPaneEx()
	{
		this.setTitle("ÄÁÅÄÆ® ÆÒ°ú ÇÁ·¹ÀÓ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("OK");
		c.add(b1);
		c.add(new JButton("cancel"));
		c.add(new JButton("Ignore"));
		
		this.setSize(300, 150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContantPaneEx co = new ContantPaneEx();
	}

}
