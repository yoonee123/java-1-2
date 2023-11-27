import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent_Exam extends JFrame {
	
	int ix;
	int iy;

	JLabel la = new JLabel();
	
	public MouseEvent_Exam() {
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container C = this.getContentPane();
		C.setLayout(null);
		
		ImageIcon image = new ImageIcon("images/paladog1.png");
		la.setIcon(image);
		la.setLocation(ix, iy);
		la.setSize(192, 126);
		C.add(la);
		
		C.addMouseListener(new myMouseListener());
		C.addMouseMotionListener(new myMouseListener());

		this.setSize(500, 500);
		this.setVisible(true);
	}

	// 마우스 이벤트를 처리해주는 리스너
	class myMouseListener implements MouseListener, MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			ix = e.getX(); 
			iy = e.getY(); 
			la.setLocation(ix, iy);
		}

		public void mouseMoved(MouseEvent e) {
			
		}
		

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEvent_Exam();
	}
} 
