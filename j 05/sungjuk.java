package exer;

import java.util.*;

public class sungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("�л����� �Է��ϼ���.");
		int num = s.nextInt();
		
		int korean[] = new int[num];
		int english[] = new int[num];
		int math[] = new int[num];
		
		double avg[] = new double[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("���� ���� ���� ������ �Է��ϼ���.");
			korean[i] = s.nextInt();
			english[i] = s.nextInt();
			math[i] = s.nextInt();
			
			avg[i] = korean[i] + english[i] + math[i]/3.0;
		}
		
		for (int i = 0; i < num; i++) {
			System.out.println(avg[i]);
		}
	}

}
