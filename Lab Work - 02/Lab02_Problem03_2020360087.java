//Lab02 Problem03
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


class Lab02_Problem03_2020360087{
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(null, "Enter First Number : ","Input n1 ",JOptionPane.QUESTION_MESSAGE);
	String b = JOptionPane.showInputDialog(null, "Enter Second Number : ","Input n2 ",JOptionPane.QUESTION_MESSAGE);
	
	int n1 = Integer.parseInt(a);
	int n2 = Integer.parseInt(b);

        int gcd = 1;

        for (int i = 1; i <= n1 && i<= n2; i++) {
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }

	String str = "GCD of "+n1 + " and "+n2 +" : "+gcd;
	JOptionPane.showMessageDialog(null, str, "GCD ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}