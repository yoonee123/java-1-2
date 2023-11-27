package zombie;

import java.util.Random;

public class Zombie {
	Random r = new Random();
	String name;
	int pos;
	
	public Zombie(String name, int pos) {
		this.name = name;
		this.pos = pos;
	}
	
	public void move() {
		pos += r.nextInt(2)-1;
		if(pos<1) pos += 1;
		System.out.println(name+"가"+pos+"로 움직였습니다.");
	}
}
