//Lab02 Problem02
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Lab02_Problem02_2020360087 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pos = 0, neg = 0, count = 0;
        float sum = 0;

        System.out.println("Enter 10 Integers , ends with 0 : ");
        int n = input.nextInt();
        
        if (n == 0) {
            System.out.println("No Numbers are Entered Except '0' ");
            System.exit(1);
        }
        while(n != 0) {
            count++;
            sum =sum + n;

            if(n > 0){
            pos++;
            }

            else if(n < 0){
                neg++;
            }
            n = input.nextInt();
        }
        float avg = sum / count;

        System.out.println("The number of positives is "+ pos);
        
        System.out.println("The number of negatives is "+ neg);
        
        System.out.println("The total is "+ sum);
        
        System.out.println("The average is "+ avg);
        
    }
}