package arrays;
import java.util.Scanner;
public class traversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a={{sc.nextInt()}};
        sc.close();
        for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(a[i][j]);
                }
        }
    }
}
