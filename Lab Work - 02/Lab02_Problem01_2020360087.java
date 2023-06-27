//Lab02 Problem01
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


class Lab02_Problem01_2020360087{
    public static void main(String[] args) {
    String a1 = JOptionPane.showInputDialog(null, "Enter a : ","Input a ",JOptionPane.QUESTION_MESSAGE);
	String b1 = JOptionPane.showInputDialog(null, "Enter b : ","Input b ",JOptionPane.QUESTION_MESSAGE);
	String c1 = JOptionPane.showInputDialog(null, "Enter c : ","Input c ",JOptionPane.QUESTION_MESSAGE);
	
	double a = Double.parseDouble(a1);
	double b = Double.parseDouble(b1);
	double c = Double.parseDouble(c1);

    double discriminant = Math.pow(b, 2) - 4 * a * c;
	String root_status;
        
    if(discriminant > 0.0){
        double root1 = (- b + Math.pow(discriminant, 0.5))/(2.0 * a);
        double root2 = (- b - Math.pow(discriminant, 0.5))/(2.0 * a);
            
        root_status = "It has two roots which are : "+root1 + " and "+root2;
    }
    else if(discriminant == 0){
        double root = -b / (2.0 * a);
        root_status = "It has one Root which is : "+root;
    }
    else{
        root_status = "The equation has no real roots";
    }

	String result = "Discriminant = : "+ discriminant + "\n Root Status of the equation : " +root_status;
	JOptionPane.showMessageDialog(null, result, "Root ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}