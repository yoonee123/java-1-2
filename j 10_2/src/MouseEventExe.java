import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventExe extends JFrame {

	JLabel la = new JLabel();
	
	public MouseEventExe() {
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container C = this.getContentPane();
		C.setLayout(null);
		
		ImageIcon image = new ImageIcon("images/paladog1.png");
		la.setIcon(image);
		la.setLocation(10, 200);
		la.setSize(192, 126);
		C.add(la);
		
		C.addMouseListener(new myMouseListener());
		C.addMouseMotionListener(new MyMouseMotionListener());

		this.setSize(500, 500);
		this.setVisible(true);
	}

	// 마우스 이벤트를 처리해주는 리스너
	class myMouseListener implements MouseListener {
		
		int ix = 10;
		int iy = 200;

		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount()==1) 
			{
				ix = ix + 10;
				la.setLocation(ix, iy);	
			}
		}

		public void mousePressed(MouseEvent e) {
			/*
			 * int x = e.getX(); int y = e.getY(); la.setLocation(x, y);
			 */
			
		}

		public void mouseReleased(MouseEvent e) {
		
		}

		public void mouseEntered(MouseEvent e) {
			/*
			 * Component C = (Component) e.getSource(); C.setBackground(Color.magenta);
			 */
		}

		public void mouseExited(MouseEvent e) {
			/*
			 * Component C = (Component) e.getSource(); C.setBackground(Color.PINK);
			 */
		}

	}

	class MyMouseMotionListener implements MouseMotionListener {

		public void mouseDragged(MouseEvent e) {
			int x = e.getX(); 
			int y = e.getY(); 
			la.setLocation(x, y);
		}

		public void mouseMoved(MouseEvent e) {
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventExe();
	}
} 
