package loop;

public class AllPatterns {
 static void SquareHollow(int n){
    for (int i = 1; i <=n; i++) {
        for(int j=1;j<=5;j++){
            if (i==1||i==n||j==1||j==5) {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println();
    }
 }
 static void NumberTriangular(int n){
    for (int i = 1; i <=n; i++) {
        for(int j=1;j<=n-i;j++){
           System.out.print(" ");
        }for(int j=1;j<=i;j++){
            System.out.print("* ");
        }System.out.println();
    }
 } 
 static void NumberIncreasingPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
            System.out.print(j);
         }System.out.println();
        }
 }
 static void NumberIncreasingRevPyramid(int n){
    for (int i = 1; i <=n; i++) {
        for (int j =1; j <=n-i+1; j++) {
            System.out.print(j);
        }System.out.println();
    }
 }
 static void NumberChangingPyramid(int n){
    int num=1;
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j<=i; j++) {
            System.out.print(num+" ");
            num++;
        }System.out.println();
    }
 }
 static void ZeroOneTriangle(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
           if ((i+j)%2==0) {
            System.out.print("1 ");
           }else{
            System.out.print("0 ");
           }

        }System.out.println();
    }
 }
 static void PalindromeTriangular(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
         }
         for (int j = i; j >=1; j--) {
            System.out.print(j);
         }
         for (int j = 2; j <=i; j++) {
            System.out.print(j);
         }System.out.println();
         
        }
    }
static void Rhombus(int n){
        for (int i =  1; i <=n; i++) {
            for (int j = n; j >=n+1-i; j--) {
                System.out.print(" ");
           }
           for (int j = 1; j <=n; j++) {
            System.out.print("* ");
           }
            System.out.println();
    }
}
static void Diamond(int n){
    for (int i = 2; i <=n; i++) {
        for (int j = n; j <=n+i-2; j++) {
            System.out.print(" ");
        }
        for (int j = i; j <=n; j++) {
            System.out.print("* ");
        }System.out.println();
    }
}    
static void Butterfly(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }System.out.println();
            
        }
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }System.out.println();
            
        }
}
static void SquareFill(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1 ; j <=n; j++) {
            System.out.print("*");
        }System.out.println();
    }
}
static void RightHalfPyramid(int n){
    for (int i =1 ; i <=n; i++) {
        for (int j =1 ; j <=i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
}
static void ReverseRightHalfPyramid(int n){
    for (int i =n ; i>=1; i--) {
        for (int j =1 ; j <=i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
}
static void LeftHalfPyramid(int n){
    for (int i =1 ; i<=n; i++) {
        for (int j =1 ; j <=n-i; j++) {
            System.out.print(" ");
        }for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }System.out.println();
    }
}
static void reverseLeftHalfPyramid(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i-1; j++) {
           System.out.print(" ");
        }for (int j = n; j>=i; j--) {
            System.out.print("*");
        }System.out.println();
    }
}
static void kPattern(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = n; j>=i; j--) {
           System.out.print("* ");
       
        }System.out.println();
    }
    for (int i = 2; i <=n; i++) {
        for (int j = 1; j<=i; j++) {
           System.out.print("* ");
        
        }System.out.println();
    }
}
static void triangleStar(int n){
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=n-i; j++) {
                System.out.print(" ");
            }for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }System.out.println();
        }
}
static void reverseNumbertriangle(int n){
    int i,j;
    for (i = 1; i <= n; i++) {
 
        // inner loop to print spaces.
        for (j = 1; j < i; j++) {
            System.out.print(" ");
        }

        // inner loop to print value of j.
        for (j = i; j <= n; j++) {
            System.out.print(j + " ");
        }

        // printing new line for each row
        System.out.println();
    }
}
static void mirrorImageTriangle(int n){
    for (int i = 1; i<=n; i++) {
        for (int j = 1; j<i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j<=n; j++) {
            System.out.print(j+" ");
        }System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for (int j = 1; j <i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j<=n; j++) {
            System.out.print(j+" ");
        }System.out.println();
    }
}
static void hollowTriangle(int n) {
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=n-i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= (2 * i - 1); j++) {
            // printing stars.
            if (j == 1 || i == n || j == (2 * i - 1)) {
                System.out.print("*");
            }
            // printing spaces.
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
        }
    }
    static void hollowReverseTriangle(int n) {
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                
                if (j == 1 || i == n || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
        }
    static void hollowDiamond(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2 * i - 1); j++) {
                
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
            for (int i = n-1; i >=1; i--) {
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    
                    if (j == 1|| j == (2 * i - 1)) {
                        System.out.print("*");
                    }
                    
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                }
    }
    static void hollowHourglass(int n){
        for (int i = n; i>1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2 * i - 1); j++) {
                
                if (i==n ||j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
            for (int i = 1; i<=n; i++) {
                for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    
                    if (i==n||j == 1|| j == (2 * i - 1)) {
                        System.out.print("*");
                    }
                    
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                }
    }
static void pascalsTriangle(int n){
    for (int i = 1; i<=n; i++) {
        for (int j =1; j <=n-i; j++) {
            System.out.print(" ");
        }
        int x = 1;
        for (int k = 1; k <= i; k++) {

            
            System.out.print(x + " ");
            x = x * (i - k) / k;
        }
        System.out.println();
    }
}
static void rightPascalsTriangle(int n){
    for (int i = 1; i <=n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("* ");
        }
           
           System.out.println();
        
    } for (int i = n; i>=1; i--) {
        for (int j = 1; j <i; j++) {
            System.out.print("* ");
        }System.out.println();
    }
}

public static void main(String[] args) {
       int n=4;
   //  SquareHollow(n);
//        NumberTriangular(n);
   //    NumberIncreasingPyramid(n);
//       NumberIncreasingRevPyramid(n);
//       NumberChangingPyramid(n);
//      ZeroOneTriangle(n);
//     PalindromeTriangular(n);
//     Rhombus(n);
//     Diamond(n);
//    Butterfly(n);
//     SquareFill(n);
//     RightHalfPyramid(n);
//    ReverseRightHalfPyramid(n);
 // LeftHalfPyramid(n);
  //  reverseLeftHalfPyramid(n);
//    kPattern(n);
//     triangleStar(n);
//     reverseNumbertriangle(n);
//    mirrorImageTriangle(n);
 //hollowTriangle(n);
//   hollowReverseTriangle(n);
// hollowDiamond(n);
// hollowHourglass(n);
// pascalsTriangle(n);
rightPascalsTriangle(n);
}
}

