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
		System.out.println(name+"이 오른쪽으로 이동합니다.");
		System.out.println("현재 "+name+"의 위치는 "+pos+"입니다.");
	}
	
	
	public void LM() {
		pos -= 1;
			if(pos<=1) {
				System.out.println("앞으로 가십시오.");
				pos += 1;
				return;
				}
		else {
			System.out.println(name+"이 왼쪽으로 이동합니다.");
			System.out.println("현재 "+name+"의 위치는 "+pos+"입니다.");
		}
	}
	
	
	public void Jump() {
		int jump = r.nextInt(2)+1;
		pos += jump;
		System.out.println(name+"이 "+jump+"만큼 점프하였습니다.");
		System.out.println("현재 "+name+"의 위치는 "+pos+"입니다.");
	}

}
