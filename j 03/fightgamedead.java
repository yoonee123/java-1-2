package homework;

import java.util.*;

public class fightgamedead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int mh = 100, eh = 200;
		
		for( ; ; ) {
		
		System.out.println("�����Ϸ��� 1�� ��������");
		int input = s.nextInt();
		
		int mdamage = r.nextInt(11)+15;
		int edamage = r.nextInt(11)+5;
		
		if(input == 1) {
			mh = mh - edamage;
			eh = eh - mdamage;
			System.out.println("�����߽��ϴ�. ���� hp�� "+mh+", ���� hp�� "+eh+"�Դϴ�.");
		}
			
		if(mh > 0 && eh <= 0) {
			System.out.println("���� �׾����ϴ�. ����� �¸��Դϴ�.");
			break;
		}
		if(mh <= 0 && eh > 0) {
			System.out.println("����� �׾����ϴ�. ���� �¸��Դϴ�.");
			break;
		}
		if(mh <= 0 && eh <= 0) {
			System.out.println("�Ѵ� �׾����ϴ�. ���º��Դϴ�.");
			break;
		}
		if(mh > 0 && eh > 0) {
			System.out.println("�Ѵ� ���� �ʾҽ��ϴ�.");
		
		}
		else if(input > 1) {System.out.println("�߸��Է��߽��ϴ�!");
			break;

		}
		
		}

	}
}
