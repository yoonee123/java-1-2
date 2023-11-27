import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayoutTest extends JFrame {
	
	public NullLayoutTest() {
		this.setTitle("�� ���̾ƿ� ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JLabel la = new JLabel("�� ���̾ƿ�");
		la.setLocation(100, 100);
		la.setSize(100, 20);
		
		c.add(la);
		
		this.setSize(300,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NullLayoutTest();
	}

}
