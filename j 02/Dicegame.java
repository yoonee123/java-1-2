package homework;

import java.util.*;

public class Dicegame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		Random r2 = new Random();
		
		int num1 = r1.nextInt(6)+1;
		int num2 = r2.nextInt(6)+1;
		int sum1 = num1 + num2;
		
		int num3 = r1.nextInt(6)+1;
		int num4 = r2.nextInt(6)+1;
		int sum2 = sum1 + num3 + num4;
		
		int num5 = r1.nextInt(6)+1;
		int num6 = r2.nextInt(6)+1;
		int sum3 = sum2 + num5 + num6;
		
		System.out.println("���������� �̵��� ��ġ�� " +sum1+ " �Դϴ�.");
		System.out.println("�� ���� ���� ��ġ�� " +sum3+ " �Դϴ�.");
		
	}

}
