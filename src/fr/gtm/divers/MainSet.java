package fr.gtm.divers;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Set<Point> points = new HashSet <Point>();
			
			points.add(new Point(1,1));
			points.add(new Point(1,2));
			points.add(new Point(1,2));
			

			for (Point p : points) {
				System.out.println(p);
			}
	}

}
