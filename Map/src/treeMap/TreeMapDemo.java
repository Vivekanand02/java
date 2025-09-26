package treeMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map map= new TreeMap();
		map.put(1, "Vivekanand");
		map.put(2, "Aditya");
		map.put(3, "Spandan");
		map.put(4, "Anupam");
		map.put(5, "Sumit");
		System.out.println(map);
		Collection collection;
		
		collection = map.values();
		System.out.println("map converted into collection");
		for (Object x : collection) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println("These are the map keys");
		collection = map.keySet();
		System.out.println(collection);

		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("Vivekanand"));
	}
	}

}
