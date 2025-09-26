package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] floors=new int[2][3];
        floors[0][0]=101;
        floors[0][1]=102;
        floors[0][2]=103;
        floors[1][0]=201;
        floors[1][1]=202;
        floors[1][2]=203;
        for (int i = 0; i < floors.length; i++) {
            for (int j = 0; j < floors[i].length; j++) {
                System.out.print(floors[i][j]+" ");
            }
            System.out.println();
        }


    }
}
