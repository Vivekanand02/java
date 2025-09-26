package car;

public class Main {

	public static void main(String[] args) {
		Car car=new Mustang();
		car.name();
		
		Mustang mustang=(Mustang) car;
		mustang.name();
		
		car=new Audi();
		car.name();
		
		Audi audi=(Audi) car;
		audi.name();
	}

}
