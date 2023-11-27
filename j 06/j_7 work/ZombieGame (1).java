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
		
		Hero me = new Hero("����", 1, 3);
		Zombie zom1 = new Zombie("1�� ����", 10);
		Zombie zom2 = new Zombie("2�� ����", 20);
		Zombie zom3 = new Zombie("3�� ����", 30);
		Zombie zom4 = new Zombie("4�� ����", 40);
		
		Vector<Zombie> zombies = new Vector<Zombie>();
		zombies.add(zom1);
		zombies.add(zom2);
		zombies.add(zom3);
		zombies.add(zom4);
		
		File f = new File("c:\\temp\\zombie.sav");
		
		byte b[] = new byte[4];			
		
		if(f.exists()==true) 
		{	// ������ ������ �о �� ������ ���� �־���
								
								
			try {
				FileInputStream fin = new FileInputStream(f);
				int n=0, c;
				while((c = fin.read())!= -1) {
					b[n] = (byte)c; 
					n++; 
				} 
				System.out.println("c:\\Temp\\zombie.sav���� ���� �迭�� ����մϴ�.");
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
				System.out.println( "���� �ʱ� ��ġ��" +(int)b[0]+ "������" +(int)b[1]+ "����1�� ��ġ��" +(int)b[2]+ "����2�� ��ġ��" +(int)b[3]);

		}
		
		for(;me.hp>=0;) {
			System.out.println("���� ���� �������� �����Ͻʽÿ�.. ���� (1), ������(2), ����(3), ����(4)");
			int input = s.nextInt();
			
			//������� �Է�
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
				System.out.println("���Ͽ� ������ �� �����ϴ�. Ȯ�����ֽʽÿ�");
				e.getStackTrace();
			}
			 	break;
			}
			
			//������ �̵�
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
					System.out.println("�׾����ϴ�.");
					System.out.println("����� ����� "+me.hp+" �� ���ҽ��ϴ�");
					System.out.println();
				}
			}
			
			
			if(me.pos>=50) {
				System.out.println("�����մϴ�. ����� ��Ƴ��ҽ��ϴ�.");
				break;
			}

		}
		}
		}
	


