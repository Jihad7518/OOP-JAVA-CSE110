//Lab02 Problem05
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Lab02_Problem05_2020360087 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[] arrays = new int[100];
        int n;
        int count = 0;
        System.out.println("Enter the integers between 1 and 100, ends with 0 : ");
        
        do{
            n = input.nextInt();
            arrays[count] = n;
            count = count + 1;
        }
        while (n != 0);

        countOccurence(arrays);
    }

    public static void countOccurence(int[] list) {
        
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    count = count + 1;
            }
            if (count != 0){
                System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
            }
        } 
    }
}