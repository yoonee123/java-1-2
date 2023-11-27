package exer;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = new int[10];
		String name[] = new String[10];
		Zombie zoms[]= new Zombie[10];
		Zombie zom1 = new Zombie[10];
		int map[]= { 10, 20, 30, 40, 50 };
		
		
		Zombie zom1 = new Zombie("Á»ºñ1", 7); 
		array[0] = 10;
		array[3] = 30;	
		int sum = 0;
		
		for(int i=0; i < array.length ; i++ ) {
			sum = sum + array[i];
			
			System.out.println(array[i] + " ");
		}
		
		}
	
}
