package homework;
import java.util.*;

public class zombiegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int pos = 0;
		int zom1 = 7;
		int zom2 = 15;
			
		for( ; ; ) {
		
		System.out.println("����(1), ������(2), ����(3)"); 
		int input = s.nextInt();
		
		
			
		if (input == 1) {
			pos = pos - 1;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("�������� ���������ϴ�. ������ġ�� "+ pos +"�Դϴ�.");
			System.out.println("�������� ���������ϴ�. ����1�� ��ġ�� "+ zom1 +", ����2�� ��ġ�� "+ zom2 +"�Դϴ�.");
		}
		else if(input == 2) {
			pos = pos + 2;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("���������� ���������ϴ�. ������ġ�� "+ pos +"�Դϴ�.");
			System.out.println("���������� ���������ϴ�. ����1�� ��ġ�� "+ zom1 +", ����2�� ��ġ�� "+ zom2 +"�Դϴ�.");
		}
		else if(input == 3) {
			pos = pos + r.nextInt(3)+1;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("�����߽��ϴ�. ������ġ�� "+ pos +"�Դϴ�.");
			System.out.println("�����߽��ϴ�. ����1�� ��ġ�� "+ zom1 +", ����2�� ��ġ�� "+ zom2 +"�Դϴ�.");
		}
		
		else {
			System.out.println("�߸��Է��߽��ϴ�!");
		}
		
		if((pos == zom1) || (pos == zom2)){
			System.out.println("����� �������ϴ�! �׾����ϴ�.");		
			break;}
	
		if(pos >= 20) {
			System.out.println("���ϵ帳�ϴ�. ���� ���߽��ϴ�!.");
			break;
		}
		
		
		
		
			
		}
		
	}
}



