package homework;

import java.util.*;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("����� �̸��� �Է��Ͻÿ�.");
		String name = s.next();
		
		System.out.println("����� ���̸� �Է��Ͻÿ�.");
		int age = s.nextInt();
		
		System.out.println("����� ��������� �Է��Ͻÿ�.");
		long birth = s.nextLong();
		
		System.out.println("����� Ű�� �Է��Ͻÿ�.");
		double height = s.nextDouble();
		
		System.out.println("�Է��Ͻ� �̸��� "+name+"�̰�, "+"�Է��Ͻ� ���̴� "+age+"���̰�, "+"�Է��Ͻ� ��������� "
		+birth+"�̰�, "+"�Է��Ͻ� Ű�� " +height+ "�Դϴ�.");
		
	}

}
