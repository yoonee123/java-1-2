import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintJPanelExam extends JFrame {
	MyPanel mp = new MyPanel();
	int dir = 0;
	
	public PaintJPanelExam() 
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
		ImageIcon hero_r = new ImageIcon("images/hero01.png");
		ImageIcon hero_l = new ImageIcon("images/hero04.png");
		ImageIcon enemy1 = new ImageIcon("images/enemy1.png");
		ImageIcon enemy2 = new ImageIcon("images/enemy2.png");
		Image img_r = hero_r.getImage();
		Image img_l = hero_l.getImage();
		Image img_e1 = enemy1.getImage();
		Image img_e2 = enemy2.getImage();
		int x = 0, y = 320;
		int i = 200, j = 330;
		int k = 360, p = 330;
		
		public MyPanel() 
		{
			this.setBackground(Color.black);
			this.addKeyListener(new KeyListener() {
				public void keyTyped(KeyEvent e) {

				}
				public void keyPressed(KeyEvent e) {
					int a = e.getKeyCode();
					if(a==KeyEvent.VK_UP)
					{
						
					}
					else if (a==KeyEvent.VK_DOWN)
					{
						
					}
					else if (a==KeyEvent.VK_LEFT)
					{
						x = x - 10;
						if(x<0) x=0;
						dir = 1;
					}
					else if (a==KeyEvent.VK_RIGHT)
					{
						x = x + 10;
						if(x>getWidth()-10) x=getWidth()-10;
						dir = 0;
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
			g.setColor(Color.orange);
			g.fillRect(0, 350, getWidth(), 200);
			g.drawImage(img_e1, i, j, this);
			g.drawImage(img_e2, k, p, this);
			if(dir==0)
			{
				g.drawImage(img_r, x, y, this);
			}
			if(dir==1)
			{
				g.drawImage(img_l, x, y, this);
			}
			
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintJPanelExam();
	}

}
