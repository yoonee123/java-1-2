package zombie;

import java.util.Random;

public class Hero {
	Random r = new Random();
	String name;
	int pos;
	int hp;
	
	public Hero(String name, int pos, int hp) {
		this.name = name;
		this.pos = pos;
		this.hp = hp;
	}
	
	
	public void RM() {
		pos += 1;
		System.out.println(name+"�� ���������� �̵��մϴ�.");
		System.out.println("���� "+name+"�� ��ġ�� "+pos+"�Դϴ�.");
	}
	
	
	public void LM() {
		pos -= 1;
			if(pos<=1) {
				System.out.println("������ ���ʽÿ�.");
				pos += 1;
				return;
				}
		else {
			System.out.println(name+"�� �������� �̵��մϴ�.");
			System.out.println("���� "+name+"�� ��ġ�� "+pos+"�Դϴ�.");
		}
	}
	
	
	public void Jump() {
		int jump = r.nextInt(2)+1;
		pos += jump;
		System.out.println(name+"�� "+jump+"��ŭ �����Ͽ����ϴ�.");
		System.out.println("���� "+name+"�� ��ġ�� "+pos+"�Դϴ�.");
	}

}
