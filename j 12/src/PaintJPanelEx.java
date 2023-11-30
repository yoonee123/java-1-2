import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelEx extends JFrame {
	MyPanel mp = new MyPanel();
	
	public PaintJPanelEx() 
	{
		this.setTitle("Graghics exam");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(mp);
		
		this.setSize(500, 500);
		this.setVisible(true);
	
		mp.setFocusable(true);
		mp.requestFocus();
	}
	
	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/seager.jpg");
		Image img = icon.getImage();
		int x = 0, y = 0;
		
		public MyPanel() 
		{
			this.addKeyListener(new KeyListener() {
				public void keyTyped(KeyEvent e) {

				}
				public void keyPressed(KeyEvent e) {
					int a = e.getKeyCode();
					if(a==KeyEvent.VK_UP)
					{
						y = y - 10;
						if(y<0) y=0;
					}
					else if (a==KeyEvent.VK_DOWN)
					{
						y = y + 10;
						if(y>getHeight()-10) y=getHeight()-10;
					}
					else if (a==KeyEvent.VK_LEFT)
					{
						x = x - 10;
						if(x<0) x=0;
						
					}
					else if (a==KeyEvent.VK_RIGHT)
					{
						x = x + 10;
						if(x>getWidth()-10) x=getWidth()-10;
				
					}
					repaint();
				}
				public void keyReleased(KeyEvent e) {
					
				}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setClip(x, y, 50, 50);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			
			//g.drawImage(img, 20, 20, this);
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
			//g.drawImage(img, 20, 20, 250, 100, 100, 100, 200, 200, this);
			/*
			 * g.setColor(Color.red); g.drawString("좀비에게 잡혔습니다",30,30);
			 * g.drawString("목적지에 도착했습니다",100,100); g.setColor(Color.blue); g.drawLine(20,
			 * 20, 100, 100); g.drawOval(50, 50, 100, 100); g.drawRect(30, 30, 150, 150);
			 * g.drawRoundRect(50, 50, 100, 100, 50, 50); g.drawArc(20, 100, 80, 80, 90,
			 * 270); int x[] = {30,10,30,60}; int y[] = {250,275,300,275};
			 * g.setColor(Color.yellow); g.fillPolygon(x, y, 4); g.fillArc(250, 250, 100,
			 * 100, 30, 300);
			 */
			/*
			 * g.setColor(Color.blue); g.drawRect(10, 10, 50, 50); g.drawRect(50, 50, 50,
			 * 50); g.setColor(Color.magenta); g.drawRect(90, 90, 50, 50);
			 */
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintJPanelEx();
	}

}
