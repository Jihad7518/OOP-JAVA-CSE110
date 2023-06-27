//Lab02 Problem06
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


class Lab02_Problem06_2020360087{
    public static void main(String[] args) {
        String r = JOptionPane.showInputDialog(null, "Enter the exchange rate from USD to BDT : ","Input exchange rate ",JOptionPane.QUESTION_MESSAGE);
        String ch = JOptionPane.showInputDialog(null, "Enter '0' to convert USD to TK or Enter '1' to convert TK to USD : ","Input choice ",JOptionPane.QUESTION_MESSAGE);
	
	double rate = Double.parseDouble(r);
	int choice = Integer.parseInt(ch);
        
        String Exchange_Amount;

        if (choice == 0 ) {
            String dollar = JOptionPane.showInputDialog(null, "Enter the USD amount : ","Input USD ",JOptionPane.QUESTION_MESSAGE);
            double dollaramount = Double.parseDouble(dollar);
            
            double tkamount = dollaramount * rate ;
            Exchange_Amount =+dollaramount+" $ = " +tkamount +" BDT";
        }
        else if (choice == 1 ) {
            String tk = JOptionPane.showInputDialog(null, "Enter the BDT amount : ","Input BDT ",JOptionPane.QUESTION_MESSAGE);
            double tkamount = Double.parseDouble(tk);
            
            double dollaramount = tkamount / rate ;
            Exchange_Amount =+tkamount+" BDT = " +dollaramount +" USD";
        }
        else{
            Exchange_Amount = "Error 404!! Invalid Choice ";
        }

	String str = "Coverting Amount : "+Exchange_Amount;
	JOptionPane.showMessageDialog(null, str, "Currency Convertion ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}