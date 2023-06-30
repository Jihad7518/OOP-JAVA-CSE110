package Lab06;

import java.util.Arrays;

public class Course {
	private String courseId;
	private String courseTitle;
	private double courseCredits;
	private Student[] studentList = new Student[5];
	private int numberOfStudents;
	private Faculty faculty;
	
	public String getCourseId() {
		return courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public double getCourseCredits() {
		return courseCredits;
	}
	public Student[] getStudentList() {
		return studentList;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setCourseCredits(double courseCredits) {
		this.courseCredits = courseCredits;
	}
	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public Course() {
		super();
	}
	
	public Course(String courseId, String courseTitle, double courseCredits, Student[] studentList,
			int numberOfStudents, Faculty faculty) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.courseCredits = courseCredits;
		this.studentList = studentList;
		this.numberOfStudents = numberOfStudents;
		this.faculty = faculty;
	}
	
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseCredits=" + courseCredits;
	}
	
	public void addStudent(Student s) {
		studentList[numberOfStudents] = new Student();
		studentList[numberOfStudents] = s;
		numberOfStudents++;
	}
	
	public void dropStudent(double studentId) {
		
	}
	
	public void addFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void dropFaculty() {
		this.faculty = null;
	}
	
	public void printStudentList() {
		System.out.println(numberOfStudents);
		System.out.println(studentList[numberOfStudents]);
	}
	
	
}
