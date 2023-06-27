import java.util.Scanner;

public class LocateLargest {

    public static int[] locateLargest(double[][] a) {
        int[] arr = {0, 0};
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j] > a[arr[0]][arr[1]]) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = in.nextInt();
        int columns = in.nextInt();
        System.out.println("Enter the array:");
        double[][] a = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = in.nextDouble();
            }
        }
        int[] location = locateLargest(a);
        System.out.println("The location of the largest element is at (" + location[0] + ", " + location[1] + ")");
    }
}