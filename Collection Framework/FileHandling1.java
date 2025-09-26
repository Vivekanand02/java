import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

class FileHandling1{
	public static void main(String[] args){
		String fPath="v:/DemoFiles/demo.txt";
	try{
		File f=new File(fPath);
	FileWriter fw=new FileWriter(fPath);
	fw.write("Hello java, this is me");
	fw.close();
	Scanner sc=new Scanner(f);
	if(sc.hasNextLine()){
		String data=sc.nextLine();
		System.out.print(data);
		
	}
	else System.out.print("Error!!!");
	}
	
	catch(IOException e){
		System.out.print(e);
	}	
	
}
}