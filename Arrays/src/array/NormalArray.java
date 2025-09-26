package arrays;

import java.util.Scanner;

public class NormalArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={6,12,43,65,75,98,61,29,30,27,22};
        System.out.print("Enter your desired number: ");
        int num=input.nextInt();
        input.close();
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                System.out.println("Found");
                System.out.println(index);
            }
             index++;
        }


    }
}
