package ClassWork;

import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner in=new Scanner(System.in);



    	Student obj1=new Student();


    	obj1.setstudentId(in.nextInt());     //stu class
    	obj1.setstudentName(in.nextLine());
    	obj1.setstudentCGPA(in.nextDouble());
    	System.out.print("Student info added");


    	Course obj2 = new Course();       //course class
    	obj2.setcourseId(in.nextLine());
    	obj2.setcourseTitle(in.nextLine());
    	obj2.setCredit(in.nextDouble());
    	System.out.print("course info added");


    	Faculty obj3 = new Faculty();       //faculty class
    	obj3.setfacultyId(in.nextInt());
    	obj3.setfacultyName(in.nextLine());
    	obj3.setfacultyPosition(in.nextLine());
    	System.out.print("faculty info added");


    	System.out.print("1=Add,2=delete,3=update");
    	int n=in.nextInt();
    	if(n==1){
    		addStudent(); 
    	}
    	if(n==2){
    		obj2.dropFaculty();
    	}


    }

    private static void addStudent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Student {
	int studentId;
	String studentName;
	double studentCGPA;

	public Student(){

	}
	public Student(int studentId,String studentName,double studentCGPA){
		this.studentId=studentId;  
		this.studentName=studentName;
		this.studentCGPA=studentCGPA;
	}


	public void setstudentId(int studentId){
		this.studentId=studentId;
	}
	public int getStudent(){
		return studentId;
	}


	public void setstudentName(String studentName){
		this.studentName=studentName;
	}
	public String getstudentName(){
		return studentName;
	}


	public void setstudentCGPA(double studentCGPA){
		this.studentCGPA=studentCGPA;
	}
	public double getstudentCGPA(){
		return studentCGPA;
	}


	public String toString(){
		return getStudent()+getstudentName()+getstudentCGPA();
	}
}


class Faculty {
    int facultyId;
    String facultyName;
    String facultyPosition;

    public Faculty(){

    }    
    public Faculty(int facultyId,String facultyName,String facultyPosition){

    } 

    public void setfacultyId(int facultyId){
    	this.facultyId=facultyId;
    }
    public int getfacultyId(){
    	return facultyId;
    }

    public void setfacultyName(String facultyName){
    	this.facultyName=facultyName;
    }
    public String getfacultyName(){
    	return facultyName;
    }

    public void setfacultyPosition(String facultyPosition){
    	this.facultyPosition=facultyPosition;
    }
    public String getfacultyPosition(){
    	return facultyPosition;
    }

    public String toString(){
        return "Faculty Id:"+getfacultyId()+"\nName:"+getfacultyName()+"\nPosition:"+getfacultyPosition();
    }  
}

class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList= new Student[5];
    private int numberOfStudents;
    private Faculty faculty;

    public Course(){

    }    
    public Course(String courseId,String courseTitle,double credit){
    	this.courseId = courseId;
    	this.courseTitle = courseTitle;
    	this.credit =credit ;
    }    

    public void setcourseId(String courseId){
    	this.courseId=courseId;
    }
    public String getcourseId(){
    	return courseId;
    }

    public void setcourseTitle(String courseTitle){
    	this.courseTitle=courseTitle;
    }
    public String getcourseTitle(){
    	return courseTitle;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }
    public double getCredit(){
        return credit;
    }


    public Faculty getFaculty(){
        return faculty;
    }

    public int getnumberOfStudents(){ 
        return numberOfStudents;
    }

//arraylist return.

    public String toString(){
        return "Course Id:"+getcourseId()+"\nTitle:"+getcourseTitle()+"\nCredit:"+getCredit();
    }

    public void addStudent(Student std){ //adding std
        studentList[numberOfStudents]=new Student();
        studentList[numberOfStudents]=std;
        numberOfStudents++;
    }

    public void dropStudent(double studentId){

    }

    public void addFaculty(Faculty faculty){
    	this.faculty=faculty;
    }
    public void dropFaculty(){
    	this.faculty=null;
    }

    public void printStudentList(){
    	System.out.print(numberOfStudents);
    	System.out.print(studentList[numberOfStudents]); 
    }
}





