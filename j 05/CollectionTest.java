package exer;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
	
		v.add(Integer.valueOf(10));
		v.add(20);
		v.add(-100);
		
		int n = v.size();
		int c = v.capacity();
		
		v.add(2, 100);
		int sum = 0;
		
		for(int i = 0; i<v.size(); i++) {
			int a = v.get(1);
			sum = sum + a;
		}
		
		int aa = v.get(1);
		
		v.remove(1);
		int l = v.lastElement();
		v.removeAllElements();
	}

}
