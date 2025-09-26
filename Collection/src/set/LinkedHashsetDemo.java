package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetDemo {
	 public static void main(String[] args) {
	        // ---------- Create LinkedHashSets (no generics) ----------
	        Set set = new LinkedHashSet();
	        set.add("Laptop");     
	        set.add(200);          
	        set.add(75.5);         
	        set.add('B');          
	        set.add("Laptop");     
	        System.out.println("Initial LinkedHashSet: " + set);

	        Set otherSet = new LinkedHashSet();
	        otherSet.add("Phone");
	        otherSet.add(200);     
	        otherSet.add(true);    
	        System.out.println("Another LinkedHashSet: " + otherSet);

	        System.out.println("\n---- addAll() ----");
	        // addAll() → add all elements of otherSet into set
	        set.addAll(otherSet);
	        System.out.println("After addAll(otherSet): " + set);

	        System.out.println("\n---- remove(Object) ----");
	        // remove(Object) → remove one element by value
	        set.remove(200); 
	        System.out.println("After removing '200': " + set);

	        System.out.println("\n---- removeAll() ----");
	        // removeAll() → remove all matching elements from otherSet
	        set.removeAll(otherSet); 
	        System.out.println("After removeAll(otherSet): " + set);

	        System.out.println("\n---- retainAll() ----");
	        // retainAll() → keep only elements also present in another LinkedHashSet
	        Set checkSet = new LinkedHashSet();
	        checkSet.add("Laptop");
	        checkSet.add(75.5);
	        set.retainAll(checkSet);
	        System.out.println("After retainAll(checkSet): " + set);

	        System.out.println("\n---- isEmpty() ----");
	        // isEmpty() → check if LinkedHashSet is empty
	        System.out.println("Is set empty? " + set.isEmpty());

	        System.out.println("\n---- size() ----");
	        // size() → number of elements
	        System.out.println("Size of set: " + set.size());

	        System.out.println("\n---- contains() ----");
	        // contains() → check if a specific element exists
	        System.out.println("Does set contain 'Laptop'? " + set.contains("Laptop"));

	        System.out.println("\n---- containsAll() ----");
	        // containsAll() → check if set contains all elements of checkSet
	        System.out.println("Does set contain all elements of checkSet? "
	                           + set.containsAll(checkSet));

	        System.out.println("\n---- toArray() ----");
	        // toArray() → convert LinkedHashSet to array
	        Object[] array = set.toArray();
	        System.out.print("set converted to array: ");
	        for (Object obj : array) {
	            System.out.print(obj + " ");
	        }
	        System.out.println();
}
}
