import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventExe extends JFrame {
	
	JLabel la[];
	public KeyEventExe() {
		
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container C = this.getContentPane();
		C.setLayout(new FlowLayout());
		la = new JLabel[3];
		la[0] = new JLabel("getKeyCode() ");
		la[1] = new JLabel("getKeyChar() ");
		la[2] = new JLabel("getKeyText() ");
		
		for(int i = 0; i<la.length; i++)
		{
			la[i].setOpaque(true);
			la[i].setBackground(Color.yellow);
			C.add(la[i]);
		}
		
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
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			String Keytext = e.getKeyText(keyCode);
			
			la[0].setText(Integer.toString(keyCode));
			la[1].setText(Character.toString(keyChar));
			la[2].setText(Keytext);
		}
		public void keyReleased(KeyEvent e) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExe();
	}

}
