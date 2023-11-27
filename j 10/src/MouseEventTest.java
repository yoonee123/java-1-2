import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest extends JFrame {

	JLabel la = new JLabel("Hello");
	
	public MouseEventTest() {
		this.setTitle("마우스 리스너 1 ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);
		
		la.setSize(50, 20);
		la.setLocation(30, 30);
		c.add(la);
		
		c.addMouseListener(new MouseListener() 
		{

			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			public void mouseReleased(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		c.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x, y);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventTest();
	}

}
