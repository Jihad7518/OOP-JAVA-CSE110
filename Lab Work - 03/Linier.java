import java.util.Scanner;

public class Linier {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("press y/Y to continue");
        char choice=scanner.next().charAt(0);
       do {
           switch (choice) {
               case 'y':
               case 'Y':
                   enterEquation();
                   break;
               default:
                   System.out.println("enter a valid choice");
           }
           System.out.println("press y/Y to continue");
           choice = scanner.next().charAt(0);
       }while(choice == 'y' || choice=='Y');

    }

    public static void enterEquation(){
        double[][]a=new double[2][2];
        double[]b=new double[2];
        System.out.println("enter value of a00");
        a[0][0]=scanner.nextDouble();
        System.out.println("enter value of a01");
        a[0][1]=scanner.nextDouble();
        System.out.println("enter value of b0");
        b[0]=scanner.nextDouble();
        System.out.println("enter value of a10");
        a[1][0]=scanner.nextDouble();
        System.out.println("enter value of a11");
        a[1][1]=scanner.nextDouble();
        System.out.println("enter value of b1");
        b[1]=scanner.nextDouble();

        double[]ans = linearEquationSolver(a,b);

        if(ans==null){
            System.out.println("The equation has no solution");
        }else{
            System.out.println("x = "+ans[0]);
            System.out.println("y = "+ans[1]);
        }

    }

    public static double[] linearEquationSolver(double[][] a, double[] b) {
        double den = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        if (den == 0) {
            return null;
        }

        double x = (b[0] * a[1][1] - b[1] * a[0][1]) / den;
        double y = (b[1] * a[0][0] - b[0] * a[1][0]) / den;

        return new double[]{x, y};
    }
}
