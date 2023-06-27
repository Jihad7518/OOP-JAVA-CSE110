//Lab02 Problem08
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;

 
public class Lab02_Problem08_2020360087{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
    
        System.out.print(" Enter Any String : ");
        String s = input.nextLine();

        boolean palindrome = true;
    
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i) !=s.charAt(s.length()-i-1)){
                palindrome = false;
            }
        }
            if(palindrome){
                System.out.println("The String '"+s+ "' is a Palindrome");
            }
            else{
                System.out.println("The String '"+s+ "'  is Not a Palindrome");
            }
    }
}