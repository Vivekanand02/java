import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		ArrayList<String> list2=new ArrayList<>();
		
		
		
		list.add("red");
		list.add("grey");
		list.add("black");
		list.add("white");
		list.add("brown");
		list2.add("orange");
		list2.add("cream");
		list2.add("pink");
		list2.add("brown");
		list2.add("brown");
		
		list.trimToSize();
		System.out.print(list);
		
			
			}
	}