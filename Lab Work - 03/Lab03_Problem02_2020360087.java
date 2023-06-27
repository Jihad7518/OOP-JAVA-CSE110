import java.util.Random;

public class Lab03_Problem02_2020360087 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] numbers = new int[4][4];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(2);
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        int largestRow = 0, largestColumn = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][0]+numbers[i][1]+numbers[i][2]+numbers[i][3] > numbers[largestRow][0]+numbers[largestRow][1]+numbers[largestRow][2]+numbers[largestRow][3]) {
                largestRow = i;
            }
            if (numbers[0][i]+numbers[1][i]+numbers[2][i]+numbers[3][i] > numbers[0][largestColumn]+numbers[1][largestColumn]+numbers[2][largestColumn]+numbers[3][largestColumn]) {
                largestColumn = i;
            }
        }
        System.out.println("The largest row index: " + largestRow);
        System.out.println("The largest column index: " + largestColumn + ".");
    }
}