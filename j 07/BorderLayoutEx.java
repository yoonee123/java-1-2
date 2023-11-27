package GUI;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutEx extends JFrame {
	
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();

		c.setLayout(new BorderLayout(30, 20));
		JPanel p1 = new JPanel();
		p1.add(new JButton("버튼 1"));
		p1.add(new JButton("버튼 2"));
		
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(p1, BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);

		setSize(300, 200); // 프레임 크기 300×200 설정
		setVisible(true); // 프레임을 화면에 출력
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
