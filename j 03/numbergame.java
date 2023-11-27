package homework;
import java.util.*;

public class numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int a = num / 10;  // a = 3
		int b = num%10;  // b = 6
		
		if (((a==3)||(a==6)||(a==9)) && ((b==3)||(b==6)||(b==9))){
			System.out.println("¹Ú¼öÂ¦Â¦");
		}
		
		else if ((a==3)||(a==6)||(a==9)) {
			System.out.println("¹Ú¼öÂ¦");
		}
		else if ((b==3)||(b==6)||(b==9)) {
			System.out.println("¹Ú¼öÂ¦");
		}else {
			System.out.println(num);
		}
		}
	}


