//Lab02 Problem07
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;



public class Lab02_Problem07_2020360087 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any point with two coordinat ");
        System.out.print("Enter x = ");
        int x = input.nextInt();
        
        System.out.print("Enter y = ");
        int y = input.nextInt();
        
        double distance = Math.pow((x * x + y * y), 0.5);
        
        if (distance <= 10) {
            System.out.println("( "+x+","+y+" ) This Point is within the Circle.");
        }
        else{
            System.out.println("("+x+","+y+") This Point is not within the Circle.");
        }
        
        
    }
}
