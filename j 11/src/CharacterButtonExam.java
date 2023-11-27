import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CharacterButtonExam extends JFrame {
	ImageIcon names[] = { new ImageIcon("Images/left.png"), new ImageIcon("Images/right.png") };
	JLabel imgLabel = new JLabel();
	ImageIcon image[] = { new ImageIcon("Images/image0.jpg"), new ImageIcon("Images/image1.jpg"),
			new ImageIcon("Images/image2.jpg"), new ImageIcon("Images/image3.jpg") };

	int num = 0;

	public CharacterButtonExam() {
		this.setTitle("BasicSwingProgram");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		JPanel p = new JPanel();
		p.setBackground(Color.gray);

		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

		imgLabel.setIcon(image[0]);

		c.add(p, BorderLayout.SOUTH);
		c.add(imgLabel, BorderLayout.CENTER);

		JButton b1 = new JButton();
		JButton b2 = new JButton();

		b1.addActionListener(new MyActionListener());
		b2.addActionListener(new MyActionListener2());

		p.add(b1);
		p.add(b2);

		b1.setIcon(names[0]);
		b2.setIcon(names[1]);

		this.setSize(500, 500);
		this.setVisible(true);
	}

	class MyActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			num = num - 1;
			if (num == -1)
				num = 3;
			{
				imgLabel.setIcon(image[num]);
			}

		}
	}

	class MyActionListener2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			num = num + 1;
			if (num == 4)
				num = 0;
			{
				imgLabel.setIcon(image[num]);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CharacterButtonExam();
	}

}