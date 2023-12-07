import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimerEx extends JFrame {

	public ThreadTimerEx() 
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
		
		TimerThread timer1 = new TimerThread(timerLabel1);
		TimerThread timer2 = new TimerThread(timerLabel2);
		
		this.setSize(300, 170);
		this.setVisible(true);
		
		timer1.start();
		timer2.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();
	}

}

class TimerThread extends Thread 
{
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) 
	{
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		
		while(true) 
		{
			timerLabel.setText(n+"초");
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}