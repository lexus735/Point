package fr.gtm.divers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainPoint {
	public static void main(String[] args) {
		List<Point> points = new ArrayList<Point>();
		
		points.add(new Point(1,1));
		points.add(new Point(1,2));
		points.add(new Point(1,2));
	

		for (Point p : points) {
			System.out.println(p);
		}
		System.out.println("=============================================");
		for (int i=0; i<points.size(); i++) {
			Point p = points.get(i);
			System.out.println(p);
		}
		System.out.println("===========================================");
		Iterator<Point>it = points.iterator();
		while(it.hasNext()) {
			Point p = it.next();
			System.out.println(p);
		
		}
	}
	
}



