package zombie;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ZombieGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Hero me = new Hero("영웅", 1, 3);
		Zombie zom1 = new Zombie("1번 좀비", 10);
		Zombie zom2 = new Zombie("2번 좀비", 20);
		Zombie zom3 = new Zombie("3번 좀비", 30);
		Zombie zom4 = new Zombie("4번 좀비", 40);
		
		Vector<Zombie> zombies = new Vector<Zombie>();
		zombies.add(zom1);
		zombies.add(zom2);
		zombies.add(zom3);
		zombies.add(zom4);
		
		File f = new File("c:\\temp\\zombie.sav");
		
		byte b[] = new byte[4];			
		
		if(f.exists()==true) 
		{	// 파일의 내용을 읽어서 각 변수에 값을 넣어줌
								
								
			try {
				FileInputStream fin = new FileInputStream(f);
				int n=0, c;
				while((c = fin.read())!= -1) {
					b[n] = (byte)c; 
					n++; 
				} 
				System.out.println("c:\\Temp\\zombie.sav에서 읽은 배열을 출력합니다.");
				for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
				System.out.println();
				fin.close(); }
				catch(IOException e) 
			{
			} 
				
				me.pos = (int)b[0];
				me.hp = (int)b[1];
				zom1.pos = (int)b[2];
				zom2.pos = (int)b[3];			
				System.out.println( "나의 초기 위치는" +(int)b[0]+ "생명은" +(int)b[1]+ "좀비1의 위치는" +(int)b[2]+ "좀비2의 위치는" +(int)b[3]);

		}
		
		for(;me.hp>=0;) {
			System.out.println("좀비를 피해 목적지에 도달하십시오.. 왼쪽 (1), 오른쪽(2), 점프(3), 종료(4)");
			int input = s.nextInt();
			
			//히어로의 입력
			if(input == 1) {
				me.LM();
			}
			
			if(input == 2) {
				me.RM();
			}
			
			if(input == 3) {
				me.Jump();
			}
			if(input == 4) {							
			
				FileOutputStream fout = null;
			
				b[0] = (byte)me.pos;
				b[1] = (byte)me.hp;
				b[2] = (byte)zom1.pos;
				b[3] = (byte)zom2.pos;
				
			try 
			{
				fout = new FileOutputStream(f);
				for(int i = 0; i<b.length; i++)
				{
					fout.write(b[i]);
				}
				fout.close();
			} catch(IOException e) 
			{
				System.out.println("파일에 저장할 수 없습니다. 확인해주십시오");
				e.getStackTrace();
			}
			 	break;
			}
			
			//좀비의 이동
			for(int i=0; i<zombies.size();i++) {
				Zombie p = zombies.get(i);
				p.move();
				
				if(zombies.get(i).pos==me.pos) {
					me.pos = 1;
					
					zom1.pos = 10;
					zom2.pos = 20;
					zom3.pos = 30;
					zom4.pos = 40;
					
					me.hp -= 1;
					System.out.println("죽었습니다.");
					System.out.println("당신의 목숨은 "+me.hp+" 개 남았습니다");
					System.out.println();
				}
			}
			
			
			if(me.pos>=50) {
				System.out.println("축하합니다. 당신은 살아남았습니다.");
				break;
			}

		}
		}
		}
	


