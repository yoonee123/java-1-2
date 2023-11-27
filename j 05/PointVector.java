package exer;

import java.util.*;

public class PointVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
	
		Point p2 = new Point(100, 200);
		
		v.add(new Point(10,20));
		v.add(p2); //v.add(new Point(100,200));
		v.add(new Point(-10,-200));
		
		v.remove(1);
		
		for(int i = 0; i > v.size(); i++) {
			Point p1 = v.get(i);
			System.out.println(p1.toString());
		}
	}

}
