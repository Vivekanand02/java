package hashMAp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GenericMap {
	public static void main(String[] args) {
		
		
		  Map<Integer,String> map=new HashMap();
		  map.put(1,"Vivekanand");
		  map.put(2,"Vivi");
		  map.put(3,"Vivek");
		  Collection c=map.values();
		  for(Object x: c) {
			  System.out.println(x);
		  }
}
}
