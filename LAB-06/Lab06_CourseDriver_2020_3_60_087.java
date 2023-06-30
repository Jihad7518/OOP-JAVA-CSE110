package Lab06;

import java.swing.*;
import java.util.ArrayList;
import java.util.*;

public class Lab06_CourseDriver_2020_3_60_087 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);

        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Update");
        System.out.println("4.exit");
        System.out.print("Please enter a number: ");

        boolean x = true;
        while (x) {
            int n = input.nextInt();
            switch{
                case 1:
                    System.out.println("Add a student");

                    char std = input.next().charAt(0);
                    switch (std) {
                        case 'a':
                            Student oj1 = new Student(174, "Mim", 3.20);
                            student1.add(oj1);
                            System.out.println("student added");
                            break;
                    }
                    break;


                case 2:
                    System.out.println("Delete a student");
                    char adj = input.next().charAt(0);
                    switch (adj) {
                        case 'a':
                            int y = input.nextInt();
                            for (int i = 0; i < student1.size(); i++) {
                                if (student1.get(i).getStudentId() == y) {
                                    student1.remove(i);
                                }
                            }
                            System.out.println("student deleted");
                            break;
                    }
                    break;
                case 3:
                    System.out.println(student1.toString());
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
            if (n == 4) {
                x = false;
                break;
            }
        }
    }
		
		

}
