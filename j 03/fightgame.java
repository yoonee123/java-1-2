package homework;
import java.util.*;

public class fightgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		int mh = 10, eh = 20;
		
		int mdamage = r.nextInt(11)+15;
		int edamage = r.nextInt(11)+5;
		
		System.out.println("�����Ϸ��� 1�� ��������");
		
		int input = s.nextInt();
		
		
		if(input == 1) {
			mh = mh - edamage;
			eh = eh - mdamage;
			System.out.println("�����߽��ϴ�. ���� hp�� "+mh+", ���� hp�� "+eh+"�Դϴ�.");
		}
		
		if(mh > 0 && eh <= 0) {
			System.out.println("���� �׾����ϴ�. ����� �¸��Դϴ�.");
		}
		if(mh <= 0 && eh > 0) {
			System.out.println("����� �׾����ϴ�. ���� �¸��Դϴ�.");
		}
		if(mh <= 0 && eh <= 0) {
			System.out.println("�Ѵ� �׾����ϴ�. ���º��Դϴ�.");
		}
		if(mh > 0 && eh > 0) {
			System.out.println("�Ѵ� ���� �ʾҽ��ϴ�. ���º��Դϴ�.");
		}
		
		else if(input > 1) {System.out.println("�߸��Է��߽��ϴ�!");
		}
		
	}

}
