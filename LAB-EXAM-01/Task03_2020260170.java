
import java.util.Scanner;

public class Task03_2020260170 {
    public static void main(String[] agrs) {
        int[] number_array = new int[200];
        int number, count = 0;

        System.out.println("Please enter the numbers [0 will terminated]:");
        // take the numbers form the user
        Scanner input = new Scanner(System.in);

        // insert the number in a number_array
        while ((number = input.nextInt()) != 0) {
            number_array[count] = number;
            count += 1;
        }

        int gcd = findGCD(number_array);

        if (gcd == 1) {
            System.out.println("Co-primes");
        } else {
            System.out.println("Not co-primes");
        }
    }

    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int findGCD(int[] arr) {
        int result = 0;
        for (int element: arr) {
            result = gcd(result, element);

            if(result == 1) {
                return 1;
            }
        }

        return result;
    }
}