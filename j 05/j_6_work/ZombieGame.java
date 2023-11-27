package zombie;

import java.util.*;

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
		
		
		for(;me.hp>=0;) {
			System.out.println("���� ���� �������� �����Ͻʽÿ�.. ���� (1), ������(2), ����(3)");
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
