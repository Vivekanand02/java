package lists;
import java.util.LinkedList;
public class LinkedListDemo {
	    public static void main(String[] args) {
	        // ---------- Create LinkedLists (no generics) ----------
	        LinkedList list = new LinkedList();
	        list.add("Car");        // String
	        list.add(100);          // Integer
	        list.add(45.67);        // Double
	        list.add('A');          // Character
	        System.out.println("Initial LinkedList: " + list);

	        LinkedList otherList = new LinkedList();
	        otherList.add("Bike");
	        otherList.add(100);     // Integer (duplicate)
	        otherList.add(false);   // Boolean
	        System.out.println("Another LinkedList: " + otherList);

	        System.out.println("\n---- addAll() ----");
	        // addAll() → add all elements of otherList into list
	        list.addAll(otherList);
	        System.out.println("After addAll(otherList): " + list);

	        System.out.println("\n---- remove(Object) ----");
	        // remove(Object) → remove one element by value
	        list.remove("Car"); // removes first occurrence of 100
	        System.out.println("After removing '100': " + list);

	        System.out.println("\n---- removeAll() ----");
	        // removeAll() → remove all matching elements from otherList
	        list.removeAll(otherList); // removes Bike, 100, false
	        System.out.println("After removeAll(otherList): " + list);

	        System.out.println("\n---- retainAll() ----");
	        // retainAll() → keep only elements also present in another LinkedList
	        LinkedList checkList = new LinkedList();
	        checkList.add("Car");
	        checkList.add(45.67);
	        list.retainAll(checkList);
	        System.out.println("After retainAll(checkList): " + list);

	        System.out.println("\n---- isEmpty() ----");
	        // isEmpty() → check if LinkedList is empty
	        System.out.println("Is list empty? " + list.isEmpty());

	        System.out.println("\n---- size() ----");
	        // size() → number of elements
	        System.out.println("Size of list: " + list.size());

	        System.out.println("\n---- contains() ----");
	        // contains() → check if a specific element exists
	        System.out.println("Does list contain 'Car'? " + list.contains("Car"));

	        System.out.println("\n---- containsAll() ----");
	        // containsAll() → check if list contains all elements of checkList
	        System.out.println("Does list contain all elements of checkList? "
	                           + list.containsAll(checkList));

	        System.out.println("\n---- toArray() ----");
	        // toArray() → convert LinkedList to array
	        Object[] array = list.toArray();
	        System.out.print("list converted to array: ");
	        for (Object obj : array) {
	            System.out.print(obj + " ");
	        }
	        System.out.println();
	    }
	

}
