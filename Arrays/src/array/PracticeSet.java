package arrays;
class Practice {
    public static void sum1() {
        float[] elements = {20.5f, 66.3f, 45.8f, 99.9f};
        float sum = 0.0f;
        for (int i = 0; i < elements.length - 1; i++) {
            sum = elements[i] + elements[i + 1];
        }
        System.out.print(sum);
    }

    public static void present() {
        int[] a = {35, 65, 95, 48, 76};
        int b = 95;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.print("Found");
                break;


            }
        }
    }

    public static void sum2() {
        float[] elements = {20.5f, 66.3f, 45.8f, 99.9f};
        float sum = 0.0f;
        for (int i = 0; i < elements.length - 1; i++) {
            sum = elements[i] + elements[i + 1];
        }
        System.out.print(sum / elements.length);
    }

    public static void sumOfArray() {
        int[][] a = {{2, 6, 4}, {9, 6, 1}};
        int[][] b = {{4, 9, 1}, {4, 5, 6}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseOfArray() {
        int[] a = {4, 6, 52, 3, 18, 9};
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }

    public static void max() {
        int[] a = {10, 45, 26, 78, 94};
        int max = 0;
        for (int e : a) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);
    }

    public static void min() {
        int[] a = {52, 63, 4, 2, 95};
        int min = Integer.MAX_VALUE;
        for (int e : a) {
            if (e < min) {
                min = e;
            }
        }
        System.out.print(min);
    }

    public static void sort() {
        int[] a = {9, 6, 1, 4, 3, 7};
        boolean isSorted = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1])
                isSorted = false;
        }
        System.out.println(isSorted);
    }
}


    public class PracticeSet {
        public static void main(String[] args) {
            //creating an array with floating point numbers and calculating their sum.
            //Practice.sum1();
            //creating an array and checking the given element is present in the array or not.
            //Practice.present();
            //average sum
            Practice.sort();
        }
    }



