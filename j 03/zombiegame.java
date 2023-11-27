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
		
		System.out.println("왼쪽(1), 오른쪽(2), 점프(3)"); 
		int input = s.nextInt();
		
		
			
		if (input == 1) {
			pos = pos - 1;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("왼쪽으로 움직였습니다. 현재위치는 "+ pos +"입니다.");
			System.out.println("왼쪽으로 움직였습니다. 좀비1의 위치는 "+ zom1 +", 좀비2의 위치는 "+ zom2 +"입니다.");
		}
		else if(input == 2) {
			pos = pos + 2;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("오른쪽으로 움직였습니다. 현재위치는 "+ pos +"입니다.");
			System.out.println("오른쪽으로 움직였습니다. 좀비1의 위치는 "+ zom1 +", 좀비2의 위치는 "+ zom2 +"입니다.");
		}
		else if(input == 3) {
			pos = pos + r.nextInt(3)+1;
			zom1 = zom1 + r.nextInt(3)-1; //-1,0,1	
			zom2 = zom2 + r.nextInt(3)-1; //-1,0,1
			System.out.println("점프했습니다. 현재위치는 "+ pos +"입니다.");
			System.out.println("점프했습니다. 좀비1의 위치는 "+ zom1 +", 좀비2의 위치는 "+ zom2 +"입니다.");
		}
		
		else {
			System.out.println("잘못입력했습니다!");
		}
		
		if((pos == zom1) || (pos == zom2)){
			System.out.println("좀비와 만났습니다! 죽었습니다.");		
			break;}
	
		if(pos >= 20) {
			System.out.println("축하드립니다. 좀비를 피했습니다!.");
			break;
		}
		
		
		
		
			
		}
		
	}
}



