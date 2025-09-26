package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		// ---------- Create TreeSets (Strings only) ----------
		Set set = new TreeSet();
		set.add("Zebra");
		set.add("Lion");
		set.add("Elephant");
		set.add("Tiger");
		set.add("Lion"); 
		System.out.println("Initial TreeSet (sorted): " + set);

		Set otherSet = new TreeSet();
		otherSet.add("Monkey");
		otherSet.add("Tiger");
		otherSet.add("Giraffe");
		System.out.println("Another TreeSet: " + otherSet);

		System.out.println("\n---- addAll() ----");
		// addAll() → add all elements of otherSet into set
		set.addAll(otherSet);
		System.out.println("After addAll(otherSet): " + set);

		System.out.println("\n---- remove(Object) ----");
		// remove(Object) → remove one element by value
		set.remove("Lion");
		System.out.println("After removing 'Lion': " + set);

		System.out.println("\n---- removeAll() ----");
		// removeAll() → remove all matching elements from otherSet
		set.removeAll(otherSet); 
		System.out.println("After removeAll(otherSet): " + set);

		System.out.println("\n---- retainAll() ----");
		// retainAll() → keep only elements also present in another TreeSet
		Set checkSet = new TreeSet();
		checkSet.add("Elephant");
		checkSet.add("Zebra");
		set.retainAll(checkSet);
		System.out.println("After retainAll(checkSet): " + set);

		System.out.println("\n---- isEmpty() ----");
		// isEmpty() → check if TreeSet is empty
		System.out.println("Is set empty? " + set.isEmpty());

		System.out.println("\n---- size() ----");
		// size() → number of elements
		System.out.println("Size of set: " + set.size());

		System.out.println("\n---- contains() ----");
		// contains() → check if a specific element exists
		System.out.println("Does set contain 'Zebra'? " + set.contains("Zebra"));

		System.out.println("\n---- containsAll() ----");
		// containsAll() → check if set contains all elements of checkSet
		System.out.println("Does set contain all elements of checkSet? " + set.containsAll(checkSet));

		System.out.println("\n---- toArray() ----");
		// toArray() → convert TreeSet to array
		Object[] array = set.toArray();
		System.out.print("set converted to array: ");
		for (Object obj : array) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
