import java.util.ArrayList;
import java.util.List;
class ArrayListDemo {
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		list.add("Apple");
		for(String a : list){
		System.out.println(a);
		}
	}
}