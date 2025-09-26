package hashtable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "Apple");
		map.put(2, "Mango");
		map.put(3, "Banana");
		map.put(4, "Strawberry");
		map.put(5, "Grapes");

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
		System.out.println(map.containsValue("Grapes"));
		

	}

}
