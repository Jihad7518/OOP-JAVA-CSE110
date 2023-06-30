package application;
	
import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/* @author
* @mdjihad75
* 
*/
public class SaveData_2021_3_60_087 extends Application {

        
        public void start(Stage stage) {

                // Scene building
                stage.setTitle("Students GPA Calculation");
                GridPane pane = new GridPane();
                pane.setAlignment(Pos.TOP_LEFT);
                pane.setHgap(20);
                pane.setVgap(10);
                pane.setPadding(new Insets(25, 25, 25, 25));
                Scene scene = new Scene(pane, 360, 420);

                // Elements for student roll number
                Label rollNo = new Label("Student Roll No.");
                //rollNo.setStyle("-fx-background-color: green; -fx-text-fill: white;");
                pane.add(rollNo, 0, 1);
                TextField rollNoField = new TextField();
                pane.add(rollNoField, 1, 1);

                // Elements for student name
                Label name = new Label("Student Name");
                pane.add(name, 0, 2);
                TextField nameField = new TextField();
                pane.add(nameField, 1, 2);

                // Elements for marks in Bengali
                Label marksBengali = new Label("Marks in Bengali");
                pane.add(marksBengali, 0, 3);
                TextField marksBengaliField = new TextField();
                pane.add(marksBengaliField, 1, 3);

                // Elements for marks in English
                Label marksEnglish = new Label("Marks in English");
                pane.add(marksEnglish, 0, 4);
                TextField marksEnglishField = new TextField();
                pane.add(marksEnglishField, 1, 4);

                // Elements for marks in Mathematics
                Label marksMaths = new Label("Marks in Mathematics");
                pane.add(marksMaths, 0, 5);
                TextField marksMathsField = new TextField();
                pane.add(marksMathsField, 1, 5);

                // Elements for calculate button
                Button calculateButton = new Button("Calculate GPA");
                calculateButton.setMaxWidth(Double.MAX_VALUE);
                calculateButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");
                pane.add(calculateButton, 1, 6);

                // Elements for grade point average
                Label gpa = new Label("Grade Point Average");
                pane.add(gpa, 0, 8);
                TextField gpaField = new TextField();
                pane.add(gpaField, 1, 8);

                // Elements for save button
                Button saveButton = new Button("Save Data");
                saveButton.setMaxWidth(Double.MAX_VALUE);
                saveButton.setStyle("-fx-background-color: green; -fx-text-fill: white;");
                pane.add(saveButton, 1, 9);

                // Elements for refresh button
                Button refreshButton = new Button("Refresh Data");
                refreshButton.setMaxWidth(Double.MAX_VALUE);
                //refreshButton.setDefaultButton(true);
                pane.add(refreshButton, 0, 10);

                // Elements for close button
                Button closeButton = new Button("Close File");
                closeButton.setMaxWidth(Double.MAX_VALUE);
                //closeButton.setDefaultButton(true);
                pane.add(closeButton, 1, 10);

                
                calculateButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                try {
                                        double result = calculateGPA(Integer.parseInt(marksBengaliField.getText()))
                                                        + calculateGPA(Integer.parseInt(marksEnglishField.getText()))
                                                        + calculateGPA(Integer.parseInt(marksMathsField.getText()));
                                        gpaField.setText(String.valueOf(result / 3).substring(0, 3));
                                } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                }
                        }
                });

               
                saveButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                try {
                                        BufferedWriter writer = new BufferedWriter(
                                                        new FileWriter("C:\\Users\\Hp\\Downloads\\File_2020_3_60_087.txt", true));
                                        writer.append(rollNoField.getText() + "," + nameField.getText() + "," + gpaField.getText());
                                        writer.append("\n");
                                        writer.close();
                                } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                }
                        }
                });

                
                refreshButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                rollNoField.setText("");
                                nameField.setText("");
                                marksBengaliField.setText("");
                                marksEnglishField.setText("");
                                marksMathsField.setText("");
                                gpaField.setText("");
                        }
                });

                
                closeButton.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                                System.exit(0);
                        }
                });

                stage.setScene(scene);
                stage.show();
        }

        
        private double calculateGPA(int marks) {
                if (marks >= 90)
                        return 5;
                else if (marks >= 80)
                        return 4;
                else if (marks >= 70)
                        return 3;
                else if (marks >= 60)
                        return 2;
                else if (marks >= 50)
                        return 1;
                else
                        return 0;
        }

        
        public static void main(String[] args) {
                launch(args);
        }
}
