import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZombieSwingGame extends JFrame {
	MyPanel mp = new MyPanel();
	boolean isRunning = true;
	boolean heroDead1, heroDead2;
	boolean gameover;
	
	public ZombieSwingGame() 
	{
		this.setTitle("Graghics exam");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(mp);
		
		this.setSize(500, 400);
		this.setVisible(true);
	
		mp.setFocusable(true);
		mp.requestFocus();
	}
	
	class MyPanel extends JPanel implements Runnable {
		ZombieSwing zombie1 = new ZombieSwing(150, 205);
		ZombieSwing zombie2 = new ZombieSwing(300, 205);
		HeroSwing hero = new HeroSwing(0, 197);
		
		ImageIcon enemy1 = new ImageIcon("images/enemy1.png");
		ImageIcon enemy2 = new ImageIcon("images/enemy2.png");
	
		Image img_e1 = enemy1.getImage();
		Image img_e2 = enemy2.getImage();
		int dir = 0;
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
					if((heroDead1==false)&&(heroDead2==false)&&(gameover==false)) // 변수가 false일 때만 실행
					{
						int a = e.getKeyCode();
						if(a==KeyEvent.VK_UP)
						{
							hero.jump = true;
						}
						else if (a==KeyEvent.VK_LEFT)
						{
							hero.moveLeft();
							hero.dir = 2;
						}
						else if (a==KeyEvent.VK_RIGHT)
						{
							hero.moveRight();
							hero.dir = 1;
						}
						heroDead1 = hero.crush(zombie1); //충돌체크 여부
						heroDead2 = hero.crush(zombie2);
						
						repaint();
					}
				}
				public void keyReleased(KeyEvent e) {
					
				}
			});
			
			new Thread(this).start();
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.orange);
			g.fillRect(0, 225, getWidth(), 200);
			/*
			 * g.drawImage(img_e1, i, j, this); g.drawImage(img_e2, k, p, this);
			 */
			/*
			 * if(dir==0) { g.drawImage(img_r, x, y, this); } if(dir==1) {
			 * g.drawImage(img_l, x, y, this); }
			 */
			zombie1.paint(g);
			zombie2.paint(g);
			hero.paint(g);
			
			//주인공이 움직여서 좀비와 부딪힌 경우
			if(heroDead1||heroDead2)
			{
				g.setColor(Color.red);
				g.drawString("좀비에게 잡혔습니다.", 100, 100);
				isRunning = false; //스레드가 안돌게 게임 멈추기
			}
			
			//게임을 클리어 하는 경우
			if(gameover == true)
			{
				g.setColor(Color.red);
				g.drawString("목적지에 도착했습니다. 게임을 종료합니다.", 100, 100);
				isRunning = false; //스레드가 안돌게 게임 멈추기
			}
		}

		public void run() {
			while (isRunning)
			{
				gameover = hero.heroMove();
				if(gameover == true)
				{
					repaint();
				}
				
				hero.heroMove();
				zombie1.randomMove();
				zombie2.randomMove();
				
				heroDead1 = zombie1.crush(hero);
				heroDead2 = zombie2.crush(hero);
				
				repaint();
				
				try {
					Thread.sleep(300); //이것만 써서 불러오기
				} catch (InterruptedException e) {
					
					System.out.println(e);
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ZombieSwingGame();
	}

}
