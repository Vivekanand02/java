package loop;
import java.util.Scanner;
public class pr8 {
    public static void main(String[] args) {
        
        Scanner console=new Scanner(System.in);
        int number,          
            countPositive = 0, 
            countNegative = 0,
            countZero = 0;

        char choice;
	
        do
        {
            System.out.print("Enter the number ");
            number = console.nextInt();
        
            if(number > 0)
            {
                System.out.println("Positive numbers: " + countPositive++);
                
                
            }
            else if(number < 0)
            {
                  System.out.println("Negative numbers: " + countNegative++);
                
              
            }
            else
            {
                System.out.println("Zero numbers: " + countZero++);
                
                
            }console.close();
        
            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        
        
        
        }
    

    }

