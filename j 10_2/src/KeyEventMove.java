import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventMove extends JFrame {
	
	JLabel la = new JLabel("상하좌우 이동하기");
	int ix = 10, iy = 10;
	Container C;
	public KeyEventMove() {
		
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		C = this.getContentPane();
		C.setLayout(null);
		la.setSize(100,20);
		la.setLocation(ix, iy);
		C.add(la);
		
		C.addKeyListener(new MyKeyListener());
		
		this.setSize(500, 500);
		this.setVisible(true);
		
		C.setFocusable(true);
		C.requestFocus();
	}

	class MyKeyListener implements KeyListener {

		public void keyTyped(KeyEvent e) {
			
		}

		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			
			if (keycode == KeyEvent.VK_UP)
			{
				iy = iy - 10;
				la.setLocation(ix, iy);
			}
			else if (keycode == KeyEvent.VK_DOWN)
			{
				iy = iy + 10;
				la.setLocation(ix, iy);
			}
			else if (keycode == KeyEvent.VK_LEFT)
			{
				ix = ix - 10;
				la.setLocation(ix, iy);
			}
			else if (keycode == KeyEvent.VK_RIGHT)
			{
				ix = ix + 10;
				la.setLocation(ix, iy);
			}
			else if (keycode == KeyEvent.VK_F1)
			{
				C.setBackground(Color.green);
			}
			else if (e.getKeyChar()=='%')
			{
				C.setBackground(Color.yellow);
			}
		}
		public void keyReleased(KeyEvent e) {
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventMove();
	}

}
