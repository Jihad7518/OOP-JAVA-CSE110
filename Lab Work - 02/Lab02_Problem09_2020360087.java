//Lab02 Problem09
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;

 
public class Lab02_Problem09_2020360087 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[10];
        int n;
        int j;
        int i = 0 ;
        int k = 0;
        
        System.out.println("Enter ten numbers:");
 
        while (k < 10) {
            n = input.nextInt();
            k++;
 
        for (j = 0; j <= i; j++) {
            if (n == numbers[j]) {
                break;
            }
        }
 
        if (j - i == 1) {
            numbers[i] = n;
            i++;
        }
 
        }
 
        System.out.println("The number of distinct number is " + i);
        System.out.print("The distinct numbers are:");
 
        for (int r = 0; r < i; r++) {
            System.out.print(numbers[r] + " ");
        }
 
    }
}