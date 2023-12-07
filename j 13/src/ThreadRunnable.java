import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadRunnable extends JFrame {

	public ThreadRunnable() 
	{
		this.setTitle("Timer");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel1 = new JLabel();
		timerLabel1.setFont(new Font("Gothic", Font.BOLD, 80));
		JLabel timerLabel2 = new JLabel();
		
		c.add(timerLabel1);
		c.add(timerLabel2);
		
		JButton btn = new JButton("Kill Timer");
		c.add(btn);		
		
		TimerThreadRun t1 = new TimerThreadRun(timerLabel1);
		Thread timer1 = new Thread(t1);
		Thread timer2 = new Thread(new TimerThreadRun(timerLabel2));
		
		this.setSize(300, 170);
		this.setVisible(true);
		
		timer1.start();
		timer2.start();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//timer1.interrupt();
				t1.isAlive = false;
				btn.setEnabled(false);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadRunnable();
	}

}

class TimerThreadRun implements Runnable 
{
	JLabel timerLabel;
	boolean isAlive = true;
	
	public TimerThreadRun(JLabel timerLabel) 
	{
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		
		while(isAlive) 
		{
			timerLabel.setText(n+"초");
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}