import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


class BmiCalculation{
    public static void main(String[] args) {
        String weight = JOptionPane.showInputDialog(null, "Enter Your Weight in KG ","Input Weight",JOptionPane.QUESTION_MESSAGE);
	String hieght = JOptionPane.showInputDialog(null, "Enter Your hieght in Meter ","Input Hieght",JOptionPane.QUESTION_MESSAGE);
	
	double w = Double.parseDouble(weight);
	double h = Double.parseDouble(hieght);

	double bmi = w/Math.pow(h,2);
	String weight_status;

	if(bmi >= 30.0)
		weight_status = "Obese";
	else if(bmi >= 25)
		weight_status = "Overweight";
	else if(bmi >= 18.5)
		weight_status = "Normal";
	else
		weight_status = "Underweight";

	String message = "BMI : "+ bmi+ "\n Weight Status : " +weight_status;
	JOptionPane.showMessageDialog(null, message, "BMI and Weight Status",JOptionPane.INFORMATION_MESSAGE);
    }
    
}