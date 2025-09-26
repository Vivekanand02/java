import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Comparator;

class ListDemo {
    public static void main(String[] args) {
        // Creating Lists
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding Elements
        arrayList.add(10);
        linkedList.add(20);
        System.out.println("--------------------------------");
        
        arrayList.add(1, 15);
        List<Integer> newList = Arrays.asList(30, 40, 50);
        arrayList.addAll(newList);
        System.out.println("--------------------------------");

        // Accessing Elements
        int firstElement = arrayList.get(0);
        System.out.println("First Element: " + firstElement);
        System.out.println("--------------------------------");

        // Updating an Element
        arrayList.set(1, 25);
        System.out.println("Updated List: " + arrayList);
        System.out.println("--------------------------------");

        // Removing Elements
        arrayList.remove(0);
        arrayList.remove(Integer.valueOf(25));
        arrayList.removeAll(newList);
        System.out.println("After Removal: " + arrayList);
        System.out.println("--------------------------------");

        // Checking if an Element Exists
        boolean contains = arrayList.contains(10);
        System.out.println("Contains 10? " + contains);
        System.out.println("--------------------------------");

        // Finding the Index of an Element
        int index = arrayList.indexOf(10);
        int lastIndex = arrayList.lastIndexOf(10);
        System.out.println("First Index of 10: " + index);
        System.out.println("Last Index of 10: " + lastIndex);
        System.out.println("--------------------------------");

        // Iterating Over a List
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        Iterator<Integer> listIterator = arrayList.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        arrayList.forEach(System.out::println);
        System.out.println("--------------------------------");

        // Sorting a List
        Collections.sort(arrayList);
        System.out.println("Sorted List: " + arrayList);
        
        arrayList.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + arrayList);
        System.out.println("--------------------------------");

        // Converting List to Array
        Integer[] array = arrayList.toArray(new Integer[0]);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("--------------------------------");

        // Clearing a List
        arrayList.clear();
        System.out.println("List After Clear: " + arrayList);
        System.out.println("--------------------------------");

        // Checking if List is Empty
        boolean isEmpty = arrayList.isEmpty();
        System.out.println("Is List Empty? " + isEmpty);
        System.out.println("--------------------------------");

        // Getting Size of the List
        int size = arrayList.size();
        System.out.println("Size of List: " + size);
        System.out.println("--------------------------------");

        // Cloning a List
        ArrayList<Integer> cloneList = (ArrayList<Integer>) arrayList.clone();
        System.out.println("Cloned List: " + cloneList);
        System.out.println("--------------------------------");

        // Retaining Only Specific Elements
        arrayList.addAll(Arrays.asList(10, 20, 30, 40, 50));
        
	}
}