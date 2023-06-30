package Lab06;

public class Student {
	private int studentId;
	private String studentName;
	private double StudentCGPA;
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getStudentCGPA() {
		return StudentCGPA;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentCGPA(double studentCGPA) {
		this.StudentCGPA = studentCGPA;
	}
	
	public Student() {
		super();
	}
	
	public Student(int studentId, String studentName, double studentCGPA) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		StudentCGPA = studentCGPA;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", StudentCGPA=" + StudentCGPA
				+ "]";
	}
	

	
	
	
	
	
}
