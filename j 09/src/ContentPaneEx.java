import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame{

	public ContentPaneEx() {
		this.setTitle("JFrame Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setBackground(Color.orange);
		//c.setLayout(new BorderLayout());
		//c.setLayout(new FlowLayout());
		JPanel n = new JPanel();
		
		JButton btn1 = new JButton("���ϱ�");
		JButton btn2 = new JButton("����");
		JButton btn3 = new JButton("���ϱ�");
		JButton btn4 = new JButton("������");
		
		n.add(btn1);
		n.add(btn2);
		n.add(btn3);
		n.add(btn4);
		
		c.add(n, BorderLayout.NORTH); // Panel
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
