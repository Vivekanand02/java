package fan;

public class Main {
	public static void main(String[] args) {
	Fan fan=new Bajaj();
	fan.price();
	
	Bajaj bajaj=(Bajaj) fan;
	bajaj.price();
	
	fan=new Orient();
	fan.price();
	
	Orient orient=(Orient) fan;
	orient.price();
}
}
