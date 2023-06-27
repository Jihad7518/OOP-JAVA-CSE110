import javax.swing.*;

import java.io.*;
import java.lang.*;
import java.util.*;


public class TempDemo{
    public static void main(String[] args) {
        double[] temparature = {22, 34, 21, 32, 25, 26, 37, 28, 15, 16};
	double sum = 0;
	for(int i=0; i<temparature.length; i++){
		sum = sum + temparature[i];
	}
	double avg = sum / temparature.length;
	for(int i=0; i<temparature.length; i++){
		if(temparature[i] < avg){
			System.out.println("Below Average days : "+i);
		}
	}
    }
    
}