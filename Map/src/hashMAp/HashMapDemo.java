package hashMAp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "Royal Enfield");
		map.put(2, "Jawa");
		map.put(3, "Harley Davidson");
		map.put(4, "Kawasaki");
		map.put(5, "Yamaha");
		map.put(6,"Vivekanand");
//		System.out.println(map);

		Collection collection = map.values();
		

		for (Object a : collection) {
			System.out.println(a);
		}
//		collection.remove("Jawa");
//		System.out.println(collection);
//
//		map.remove(1);
//		System.out.println(map);
//		System.out.println(collection.contains("Jawa"));
//		System.out.println(map.keySet());
//		System.out.println(map.values());
//		Set set=map.entrySet();
//		System.out.println(set);
//		for(Object x:set) {
//			System.out.println(x);
//		}
	}
}