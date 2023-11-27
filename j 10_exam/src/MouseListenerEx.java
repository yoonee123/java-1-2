import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	JLabel imageLabel = new JLabel(); 
	
	

	public MouseListenerEx() {
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		ImageIcon image = new ImageIcon("images/hero01.png");
		imageLabel.setIcon(image);
	
		c.setLayout(null);
		imageLabel.setSize(50, 20);
		imageLabel.setLocation(30, 30);
		c.add(imageLabel);

		setSize(250, 250);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			imageLabel.setLocation(x, y);
		}

		public void mouseReleased(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			imageLabel.setLocation(x, y);
		}
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			imageLabel.setLocation(x, y);
		}
		public void mouseEntered(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			imageLabel.setLocation(x, y);
		}
		public void mouseExited(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			imageLabel.setLocation(x, y);
		}
	}

	public static void main(String [] args) {
		new MouseListenerEx();
	}
} 
