package fr.gtm.divers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Point> map = new HashMap <String, Point>();
		
		for(int i=0 ; i<5 ; i++) {
			String key = "point"+i;
			Point value = new Point(i,i);
			map.put(key,value);
		}
		Point p4 = map.get("point4");
		System.out.println(p4);
		
		//itération sur les clés
		for(String key: map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
		
		//itération sur les valeurs
		for (Point p : map.values()) {
			System.out.println(p);
		}
		
		//itération sur entry (couple clé/valeur)
		for (Entry <String, Point> entry : map.entrySet()) {
			String k = entry.getKey();
			Point v = entry.getValue();
			System.out.println(k + "=" + v);
		}
		
	}

}
