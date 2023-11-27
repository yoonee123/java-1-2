package homework;

import java.util.*;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 이름을 입력하시오.");
		String name = s.next();
		
		System.out.println("당신의 나이를 입력하시오.");
		int age = s.nextInt();
		
		System.out.println("당신의 생년월일을 입력하시오.");
		long birth = s.nextLong();
		
		System.out.println("당신의 키를 입력하시오.");
		double height = s.nextDouble();
		
		System.out.println("입력하신 이름은 "+name+"이고, "+"입력하신 나이는 "+age+"세이고, "+"입력하신 생년월일은 "
		+birth+"이고, "+"입력하신 키는 " +height+ "입니다.");
		
	}

}
