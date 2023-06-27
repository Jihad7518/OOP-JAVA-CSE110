//Lab01 Problem 10
//Student ID : 2020-3-60-087
//Student Name : Md. Jihad

import java.util.*;

public class Lab01_Problem10_2020360087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, r, temp;
        System.out.print("Enter the Integer : ");
        n = input.nextInt();
        temp = n;
        
        while(temp != 0){
            r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println("The Sum of this Digit : "+sum);
    }
    
}