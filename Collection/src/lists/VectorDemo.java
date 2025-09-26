package lists;

import java.util.Vector;

public class VectorDemo {
	 public static void main(String[] args) {
	        // ---------- Create Vectors (no generics) ----------
	        Vector vector = new Vector();
	        vector.add("Dog");       // String
	        vector.add(500);         // Integer
	        vector.add(99.99);       // Double
	        vector.add('Z');         // Character
	        System.out.println("Initial Vector: " + vector);

	        Vector otherVector = new Vector();
	        otherVector.add("Cat");
	        otherVector.add(500);    // Integer (duplicate)
	        otherVector.add(true);   // Boolean
	        System.out.println("Another Vector: " + otherVector);

	        System.out.println("\n---- addAll() ----");
	        // addAll() → add all elements of otherVector into vector
	        vector.addAll(otherVector);
	        System.out.println("After addAll(otherVector): " + vector);

	        System.out.println("\n---- remove(Object) ----");
	        // remove(Object) → remove one element by value
	        vector.remove(true); // removes first occurrence of 500
	        System.out.println("After removing '500': " + vector);

	        System.out.println("\n---- removeAll() ----");
	        // removeAll() → remove all matching elements from otherVector
	        vector.removeAll(otherVector); // removes Cat, 500, true
	        System.out.println("After removeAll(otherVector): " + vector);

	        System.out.println("\n---- retainAll() ----");
	        // retainAll() → keep only elements also present in another Vector
	        Vector checkVector = new Vector();
	        checkVector.add("Dog");
	        checkVector.add(99.99);
	        vector.retainAll(checkVector);
	        System.out.println("After retainAll(checkVector): " + vector);

	        System.out.println("\n---- isEmpty() ----");
	        // isEmpty() → check if Vector is empty
	        System.out.println("Is vector empty? " + vector.isEmpty());

	        System.out.println("\n---- size() ----");
	        // size() → number of elements
	        System.out.println("Size of vector: " + vector.size());

	        System.out.println("\n---- contains() ----");
	        // contains() → check if a specific element exists
	        System.out.println("Does vector contain 'Dog'? " + vector.contains("Dog"));

	        System.out.println("\n---- containsAll() ----");
	        // containsAll() → check if vector contains all elements of checkVector
	        System.out.println("Does vector contain all elements of checkVector? "
	                           + vector.containsAll(checkVector));

	        System.out.println("\n---- toArray() ----");
	        // toArray() → convert Vector to array
	        Object[] array = vector.toArray();
	        System.out.print("vector converted to array: ");
	        for (Object obj : array) {
	            System.out.print(obj + " ");
	        }
	        System.out.println();
}
}
