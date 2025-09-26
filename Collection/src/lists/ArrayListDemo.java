package lists;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	

	 ArrayList list = new ArrayList();
     list.add("Apple");     // String
     list.add(10);          // Integer
     list.add(20.5);        // Double
     System.out.println("Initial ArrayList: " + list);

     ArrayList otherList = new ArrayList();
     otherList.add("Mango");
     otherList.add(10);     
     otherList.add(true);   
     System.out.println("Another ArrayList: " + otherList);

     System.out.println("\n---- addAll() ----");
     // addAll() → add all elements of otherList into list
     list.addAll(otherList);
     System.out.println("After addAll(otherList): " + list);

     System.out.println("\n---- remove(Object) ----");
     // remove() → remove one element by value
     list.remove(20.5); // 
     System.out.println("After removing '10': " + list);

     System.out.println("\n---- removeAll() ----");
     // removeAll() → remove all matching elements from otherList
     list.removeAll(otherList); 
     System.out.println("After removeAll(otherList): " + list);

     System.out.println("\n---- retainAll() ----");
     // retainAll() → keep only elements also present in another ArrayList
     ArrayList checkList = new ArrayList();
     checkList.add("Apple");
     checkList.add(20.5);
     list.retainAll(checkList);
     System.out.println("After retainAll(checkList): " + list);

     System.out.println("\n---- isEmpty() ----");
     // isEmpty() → check if ArrayList is empty
     System.out.println("Is list empty? " + list.isEmpty());

     System.out.println("\n---- size() ----");
     // size() → number of elements
     System.out.println("Size of list: " + list.size());

     System.out.println("\n---- contains() ----");
     // contains() → check if a specific element exists
     System.out.println("Does list contain 'Apple'? " + list.contains("Apple"));

     System.out.println("\n---- containsAll() ----");
     // containsAll() → check if list contains all elements of checkList
     System.out.println("Does list contain all elements of checkList? "
                        + list.containsAll(checkList));

     System.out.println("\n---- toArray() ----");
     // toArray() → convert ArrayList to array
     Object[] array = list.toArray();
     System.out.print("list converted to array: ");
     for (Object obj : array) {
         System.out.print(obj + " ");
     }
     System.out.println();
		
	}
}
