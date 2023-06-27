//Lab02 Problem04
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;
 
 
public class Lab02_Problem04_2020360087{
 
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = input.nextInt();
    
        System.out.println("Enter "+n+" Student's Score : ");
        int[] score = new int[n];
        int bestScore = 0;
        char grade;
 
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
            if (score[i] > bestScore) {
                bestScore = score[i];
            }    
        }
 
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= bestScore - 10){
                grade = 'A';
            }
            else if (score[i] >= bestScore - 20){
                grade = 'B';
            }
            else if (score[i] >= bestScore - 30){
                grade = 'C';
            }
            else if (score[i] >= bestScore - 40){
                grade = 'D';
            }
            else{
                grade = 'F';
            }
    
        System.out.println("Student " + i +" Score is " + score[i] +" and Grade is " + grade);
    	}
 
    }
 
}