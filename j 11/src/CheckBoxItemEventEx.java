import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {

	JCheckBox fruits[] = new JCheckBox[3];
	String names[] = { "사과", "배", "체리" };
	JLabel sumLabel = new JLabel();
	int sum = 0;

	public CheckBoxItemEventEx() {
		this.setTitle("BasicSwingProgram");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 200원, 체리 20000원"));

		for (int i = 0; i < fruits.length; i++) 
		{
			fruits[i] = new JCheckBox(names[i]);
			c.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
			// 이벤트 리스너 연결
		}
		c.add(sumLabel);

		this.setSize(300, 300);
		this.setVisible(true);
	}

	// 이벤트 리스너
	class MyItemListener implements ItemListener 
	{
		
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED)
			{
				if(e.getItem()==fruits[0])
					sum = sum + 100;
				else if(e.getItem()==fruits[1])
					sum = sum + 500;
				else
					sum = sum + 20000;
			}
			else 
			{
				if(e.getItem()==fruits[0])
					sum = sum - 100;
				else if(e.getItem()==fruits[1])
					sum = sum - 500;
				else
					sum = sum - 20000;
			}
			sumLabel.setText("현재 " + sum + "원입니다.");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
