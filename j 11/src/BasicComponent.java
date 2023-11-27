import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class BasicComponent extends JFrame {
	
	public BasicComponent() 
	{
		this.setTitle("BasicSwingProgram");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BasicComponent();
	}

}
