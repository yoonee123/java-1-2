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
		
		System.out.println("공격하려면 1을 누르세요");
		
		int input = s.nextInt();
		
		
		if(input == 1) {
			mh = mh - edamage;
			eh = eh - mdamage;
			System.out.println("공격했습니다. 나의 hp는 "+mh+", 적의 hp는 "+eh+"입니다.");
		}
		
		if(mh > 0 && eh <= 0) {
			System.out.println("적이 죽었습니다. 당신의 승리입니다.");
		}
		if(mh <= 0 && eh > 0) {
			System.out.println("당신이 죽었습니다. 적의 승리입니다.");
		}
		if(mh <= 0 && eh <= 0) {
			System.out.println("둘다 죽었습니다. 무승부입니다.");
		}
		if(mh > 0 && eh > 0) {
			System.out.println("둘다 죽지 않았습니다. 무승부입니다.");
		}
		
		else if(input > 1) {System.out.println("잘못입력했습니다!");
		}
		
	}

}
