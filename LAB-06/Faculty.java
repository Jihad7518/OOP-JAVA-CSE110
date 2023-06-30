package Lab06;

public class Faculty {
	private int facultyId;
	private String facultyName;
	private String facultyPosition;
	
	public int getFacultyId() {
		return facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public String getFacultyPosition() {
		return facultyPosition;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public void setFacultyPosition(String facultyPosition) {
		this.facultyPosition = facultyPosition;
	}
	
	public Faculty() {
		super();
	}
	
	public Faculty(int facultyId, String facultyName, String facultyPosition) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyPosition = facultyPosition;
	}
	
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyPosition="
				+ facultyPosition + "]";
	}
	
	
	
}
