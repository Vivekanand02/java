package Furniture;

public class Main {
 public static void main(String[] args) {
	    Furniture furniture= new Chair();
		furniture.brand();
		
		Chair chair=(Chair) furniture;
		chair.brand();
		
		furniture=new Table();
		furniture.brand();
		
		Table table=(Table) furniture;
		table.brand();
}
}
