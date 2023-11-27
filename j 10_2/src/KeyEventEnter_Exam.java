import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventEnter_Exam extends JFrame {
	Random r = new Random();
	JLabel la[];
	JLabel lb = new JLabel("");
	Container C;
	public KeyEventEnter_Exam() {
		
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		C = this.getContentPane();
		C.setLayout(new FlowLayout());
		la = new JLabel[3];
		la[0] = new JLabel(" 0 ");
		la[1] = new JLabel(" 0 ");
		la[2] = new JLabel(" 0 ");
		
		for(int i = 0; i<la.length; i++)
		{
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setOpaque(true);
			la[i].setBackground(Color.MAGENTA);
			la[i].setForeground(Color.YELLOW);
			la[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
			C.add(la[i]);
		}
		
		lb.setSize(50, 20);
		lb.setLocation(300, 40000);
		C.add(lb);
		
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
			if (keyCode == KeyEvent.VK_ENTER)
			{
				int a = r.nextInt(4)+1;
				int b = r.nextInt(4)+1;
				int c = r.nextInt(4)+1;
				
				la[0].setText(Integer.toString(a));
				la[1].setText(Integer.toString(b));
				la[2].setText(Integer.toString(c));
				
				if (a == b && b == c)
				{
					lb.setText("축하합니다");
				}
				else
				{
					lb.setText("아쉬워요");
				}
			}	
		}
		public void keyReleased(KeyEvent e) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEnter_Exam();
	}

}
