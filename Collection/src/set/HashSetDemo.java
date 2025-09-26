package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
        // ---------- Create Sets (no generics) ----------
        Set set = new HashSet();
        set.add("Red");        // String
        set.add(100);          // Integer
        set.add(50.5);         // Double
        set.add('A');          // Character
        set.add("Red");        // duplicate, will be ignored
        System.out.println("Initial Set: " + set);

        Set otherSet = new HashSet();
        otherSet.add("Blue");
        otherSet.add(100);     // duplicate value
        otherSet.add(false);   // Boolean
        System.out.println("Another Set: " + otherSet);

        System.out.println("\n---- addAll() ----");
        // addAll() → add all elements of otherSet into set
        set.addAll(otherSet);
        System.out.println("After addAll(otherSet): " + set);

        System.out.println("\n---- remove(Object) ----");
        // remove(Object) → remove one element by value
        set.remove(100); // removes 100
        System.out.println("After removing '100': " + set);

        System.out.println("\n---- removeAll() ----");
        // removeAll() → remove all matching elements from otherSet
        set.removeAll(otherSet); 
        System.out.println("After removeAll(otherSet): " + set);

        System.out.println("\n---- retainAll() ----");
        // retainAll() → keep only elements also present in another Set
        Set checkSet = new HashSet();
        checkSet.add("Red");
        checkSet.add(50.5);
        set.retainAll(checkSet);
        System.out.println("After retainAll(checkSet): " + set);

        System.out.println("\n---- isEmpty() ----");
        // isEmpty() → check if Set is empty
        System.out.println("Is set empty? " + set.isEmpty());

        System.out.println("\n---- size() ----");
        // size() → number of elements
        System.out.println("Size of set: " + set.size());

        System.out.println("\n---- contains() ----");
        // contains() → check if a specific element exists
        System.out.println("Does set contain 'Red'? " + set.contains("Red"));

        System.out.println("\n---- containsAll() ----");
        // containsAll() → check if set contains all elements of checkSet
        System.out.println("Does set contain all elements of checkSet? "
                           + set.containsAll(checkSet));

        System.out.println("\n---- toArray() ----");
        // toArray() → convert Set to array
        Object[] array = set.toArray();
        System.out.print("set converted to array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();
}
}
