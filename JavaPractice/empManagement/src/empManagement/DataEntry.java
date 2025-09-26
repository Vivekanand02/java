package empManagement;
import java.util.Scanner;
public class DataEntry extends Options {

	public static void main(String[] args) {
		connectivity();
		Options option=new Options();
		Scanner scanner=new Scanner(System.in);
		Boolean exit=true;
		while(exit) {
			option.options();
		System.out.print("Enter your choice : ");
		Integer choice=scanner.nextInt();
		
			switch(choice)
			{
			case 1: option.add();
			break;

			case 2: option.update();
			break;
			
			case 3: option.delete();
			break;
			
			case 4: option.show();
			break;
			
			case 5: option.showAll();
			break;
			case 6: exit=false;
			}
			}
		System.out.println("--->Program terminated...");
		}
	}
