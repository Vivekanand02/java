package arrays;
import java.util.Scanner;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the numbers of rows: ");
        int rows=sc.nextInt();
        System.out.print("Enter the numbers of columns: ");
        int columns=sc.nextInt();
        int matrix[][]=new int[rows][columns];
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <columns; j++) {
                if(matrix[i][j]==x){
                    System.out.print(i+","+j);
                }
            }
        sc.close();

    }
}
}
/*public class TwoDArrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }




       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}
 */