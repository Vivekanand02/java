package arrays;
import java.util.Scanner;
public class ArrayProblems {
    public static void main(String[] args) {
        int[] a={4,6,2,8,9,7,3,1,0,9};
        String[] b={"RAM","SHYAM","GHANSHYAM","MOHAN","SUDAMA","RAM","SUDAMA"};
        String[] c={"RAM","KRISHNA","GHANSHYAM","KANHA","SUDAMA"};
        int[] d={5,3,6,4,8,55,61};
        int[] first={4,5,3,2,1};
        int[] second={9,5,3,5,2};

      //  sortNumeric(a);
      // sumOfArray(a);
     // averageValue(a);
     //specificValue(a);
     //index(a);
    //  remove(a);
   // copyAnArray(a);
  // insertSpecific(a) ;
       // maxNMin(a);
      // reverse(a);
      //duplicateValue(a);
      //duplicateString(b);
      //duplicateArrayElements(b,c);
     // duplicateArrayIntElements(a,d);
    // removeDuplicatevalue(a);
   // secondLargestNumber(a);
   //secondSmallestNumber(a);
  // addTwoMatrices(first,second);
  //missingElement(a);
  evenArray(first);
}
    public static void sortNumeric(int[] a){
         int temp;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if (a[j]>a[j+1]) {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    }
            }
              }
              for (int b : a) {
            System.out.print(b+" ");
       }
     }
     public static void sumOfArray(int[] a){
        int sum=0;
            for (int i = 0; i < a.length; i++) {
              sum+=a[i];
     }
     System.out.println(sum);
    }
    public static void averageValue(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum/2);
        
    }
    public static void specificValue(int[] a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Specific value: ");
        int x=sc.nextInt();
        sc.close();
        for (int i = 0; i < a.length; i++) {
            if (x==a[i]) {
                System.out.print("found");
                break;
            }
            else{
                System.out.print("Not Found");
                break;
            }
            }
            }
            public static void index(int[] a){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the digit: ");
                int x=sc.nextInt();
                sc.close();
                for (int i = 0; i < a.length; i++) {
                    if(x==a[i]){
                        System.out.print(i);
                        break;
                    }
                }
            }
            public static void remove(int[] a){
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter the element: ");
               int x=sc.nextInt();
               sc.close();
               for (int i = 0; i < a.length; i++) {
                int temp;
                    if(x==a[i]){
                           temp=a[i];
                           a[i]=0;
                           break; 
                    }
               }
                for (int i : a) {
                    System.out.print(i+" ");                    
                }
            }
            public static void copyAnArray(int[] a){
                int[] b=new int[8];
                for (int i = 0; i < b.length; i++) {
                    b[i]=a[i];
                    System.out.print(b[i]+" ");
                   
                    System.out.println(a[i]+" ");
                    
                    
                }
                
            }
            public static void insertSpecific(int[] a){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the element: ");
                int x=sc.nextInt();
                System.out.print("Enter the position: ");
                int y=sc.nextInt();
                sc.close();
                a[y]=x;
                for (int i : a) {
                    System.out.print(i+" ");
                }
            }
            public static void maxNMin(int[] a){
               sortNumeric(a);
               System.out.println();
               System.out.println("The maXm digit is : "+ a[a.length-1]);
               System.out.print("The miNm digit is : "+ a[0]);
                }
                public static void reverse(int[] a){
                        int[] b=new int[8];

                        for (int i = 0; i < b.length; i++) {
                         
                            b[i]=a[a.length-i-1];
                          
                            System.out.print(b[i]+" ");
                        }
                       
                }
                public static void duplicateValue(int[] a){
                  int i;
                    for (i = 0; i < a.length-1; i++) {
                      for (int j = i+1; j < a.length; j++) {
                         if(a[i]==a[j])
                            System.out.println("found: "+i);
                         }
                         }
                    }
                        public static void duplicateString(String[] b){
                            int i;
                            for(i=0;i<b.length-1;i++){
                                for (int j = i+1; j < b.length;j++) {
                                    if(b[i].equals(b[j]))
                                    System.out.println("found: "+b[i]);
                                    
                                }
                            }
                        }
                        public static void duplicateArrayElements(String[] b,String[] c){
                            int i;
                            for ( i = 0; i < b.length-1; i++) {
                                for (int j = 0; j < c.length; j++) {
                                    if(b[i].equals(c[j]))
                                    System.out.println("Found: "+j);
                                }
                            }

                        }
                        public static void  duplicateArrayIntElements(int[] a,int[] d){
                            int i;
                            for(i=0;i<a.length-1;i++){
                                for (int j = 0; j < d.length-1; j++) {
                                    if(a[i]==d[j])
                                    System.out.println(a[i]);
                                    
                                }
                            }
                        }
                        public static void removeDuplicatevalue(int[] a){
                          int i;
                          for(i=0;i<a.length-1;i++){
                            for (int j = i+1; j < a.length; j++) {
                                int temp=0;
                                if(a[i]==a[j]){
                                temp=a[i];
                                a[i]=0;
                               
                            }
                        }
                    }for (int x : a) {
                        System.err.print(x+" ");
                    }
                }
                public static void secondLargestNumber(int[] a){
                    sortNumeric(a);
                    System.out.println();
                    System.out.print("second largest number is: "+(a.length-2));
                }
                public static void secondSmallestNumber(int[] a){
                    sortNumeric(a);
                    System.out.println();
                    System.out.print("second smallest number is: "+a[1]);
                }
                public static void addTwoMatrices(int[] first,int[] second){
                    int i;
                    int[] sum=new int[first.length];
                    for (i = 0; i < first.length; i++) {
                       sum[i] = first[i]+second[i];
                              
                    }
                   for (int j : sum) {
                        System.out.print(j+" ");
                   }
                }
                public static void missingElement(int[] a){
                        for (int i = 0; i < a.length; i++) {
                            if(a[i]==0)
                            System.out.print(i+" ");
                        }
                }
                public static void evenArray(int[] first){
                    for (int i = 0; i < first.length; i++) {
                        if(first[i]%2==0)
                        System.err.println("Even: "+first[i]);
                    }
                }
                }
        

