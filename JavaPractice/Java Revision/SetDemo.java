import java.util.Set;
import java.util.HashSet;
class SetDemo{
	public static void main(String[] args){
		Set<String> set=new HashSet<>();
		set.add("Dog");
		set.add("Cat");
		set.add("Lion");
		System.out.println(set);
	}
}