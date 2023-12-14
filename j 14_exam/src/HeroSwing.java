import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class HeroSwing {
	Random r = new Random();
	
	final int MOVE_STEP = 5;
	final int MAX_X = 482;
	final int MAX_Y = 300;
	
	int x, y; //주인공 좌표
	int dir = 1; //주인공 방향 (1이면 오른쪽 방향, 2면 왼쪽 방향)
	boolean toggle;
	int imgwidth = 21; //이미지 크기
	int imgheight = 26;
	int count = 0;
	boolean jump;
	int jumpCount = 1;
	
	ImageIcon imgIcon[] = new ImageIcon[6];
	Image img[] = new Image[6];
	
	public HeroSwing(int x, int y) {
		this.x = x;
		this.y = y;
		for(int i=0; i<6; i++)
		{
			imgIcon[i] = new ImageIcon("images/hero0" +(i+1)+".png");
			img[i] = imgIcon[i].getImage();
		}
	}
	
	public void moveLeft() 
	{
		x = x - MOVE_STEP;
		if(x < 0) x = 0;
	}
	public void moveRight()
	{
		x = x + MOVE_STEP;
		if(x > MAX_X - imgwidth) x = MAX_X - imgwidth;
	}
	
	public boolean heroMove() 
	{
		count++;
		
		if(jump==true) //점프하는 기능
		{
			if(jumpCount <= 5) //올라가는 상태
			{
				y -= 10;
			}
			else if(jumpCount <= 10) //내려오는 상태
			{
				y += 10;
			}
			if(jumpCount==10) //착지 상태
			{
				jump = false;
				jumpCount = 1;
			}
			else 
				jumpCount++;
		}
		
		if(x >= MAX_X-imgwidth)
			return true;
		else
			return false;
	}
	public boolean crush(ZombieSwing z)
	{
		if(((z.x < x)&&(x < z.x + z.imgwidth))&&((z.y < y)&&(y < z.y + z.imgheight)))
			return true;
		if(((z.x < x+imgwidth)&&(x+imgwidth < z.x + z.imgwidth))&&((z.y < y)&&(y < z.y + z.imgheight)))
			return true;
		if(((z.x < x)&&(x < z.x + z.imgwidth))&&((z.y < y+imgheight)&&(y+imgheight < z.y + z.imgwidth)))
			return true;
		if(((z.x < x+imgwidth)&&(x+imgwidth < z.x + z.imgwidth))&&((z.y < y+imgheight)&&(y+imgheight < z.y + z.imgwidth)))
			return true;
		
		return false;
	}
	
	public void paint(Graphics g) {
		if(dir==1) 
		{
			if(jump==true)
			{
				g.drawImage(img[2], x, y, null);
			}
			else
				g.drawImage(img[count%2], x, y, null);
		}
		else if(dir==2)
		{
			if(jump==true)
			{
				g.drawImage(img[5], x, y, null);
			}
			else
				g.drawImage(img[count%2+3], x, y, null);
		}
			
	}


}
