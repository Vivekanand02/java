import java.util.Scanner;
import java.io.File;
import java.io.IOException;

class FileHandling{
	public static void main(String[] args){
		String filePath="v:/me/me.txt";
		File file=new File(filePath);
		try{
			if(file.createNewFile())
			System.out.println("File created..."+file.getName());
			else
				System.out.println("File already exists!!!");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}