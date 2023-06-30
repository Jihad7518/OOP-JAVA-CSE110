import java.util.Scanner;

public class Task02_2020260170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] p = new double[10];

        for (int i = 0; i < 10; i++) {
            p[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (p[i] < 500) {
                double dp = (p[i] / 100) * 10;
                p[i] -= dp;

            } else if (p[i] < 2000) {
                double dp = (p[i] / 100) * 12.5;
                p[i] -= dp;

            } else {
                double dp = (p[i] / 100) * 15;
                p[i] -= dp;
            }
        }

        int expensive = expensive_product(p);
        int cheap = cheap_product(p);

        for (int i = 0; i < 10; i++) {
            System.out.println("Product " + i + ": " + p[i]);
        }

        System.out.println("Expensive product no: " + expensive + ", Price: " + p[expensive]);
        System.out.println("Cheap product no: " + cheap + ", Price: " + p[cheap]);
    }

    public static int expensive_product(double[] prices) {
        double max = -1;
        int max_idx = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                max_idx = i;
            }
        }

        return max_idx;
    }

    public static int cheap_product(double[] prices) {
        double minimum = Double.MAX_VALUE;
        int min_idx = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minimum) {
                minimum = prices[i];
                min_idx = i;
            }
        }

        return min_idx;
    }
}