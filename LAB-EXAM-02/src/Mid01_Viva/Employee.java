package Mid01_Viva;

public class Employee {
	 private String id;
	 private String name;
	 private String dateOfBirth;
	 private String joiningDate;
	 private String bloodGroup;
	 private String address;
	 private double monthlySalary;

	 public Employee(){
	        
	 }

	 public Employee(String id, String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, double monthlySalary){
	     this.id = id;
	     this.name = name;
	     this.dateOfBirth = dateOfBirth;
	     this.joiningDate = joiningDate;
	     this.bloodGroup = bloodGroup;
	     this.address = address;
	     this.monthlySalary = monthlySalary;
	 }
	    
	 public String getId(){
	     return id;
	 }
	    
	 public void setId(String id){
	     this.id = id;
	 }
	    
	 public String getName(){
	     return name;
	 }
	    
	 public void setName(String name){
	     this.name = name;
	 }
	    
	 public String getDateOfBirth(){
	     return dateOfBirth;
	 }
	    
	 public void setDateOfBirth(String dateOfBirth){
	     this.dateOfBirth = dateOfBirth;
	 }
	    
	 public String getJoiningDate(){
	     return joiningDate;
	 }
	    
	 public void setJoiningDate(String joiningDate){
	     this.joiningDate = joiningDate;
	 }
	    
	 public String getBloodGroup(){
	     return bloodGroup;
	 }
	    
	 public void setBloodGroup(String bloodGroup){
	     this.bloodGroup = bloodGroup;
	 }
	    
	 public String getAddress(){
	     return address;
	 }
	    
	 public void setAddress(String address){
	     this.address = address;
	 }
	    
	 public double getMonthlySalary(){
	     return monthlySalary;
	 }
	    
	 public void setMonthlySalary(double salary){
	     monthlySalary = salary;
	 }
	    
	 public void displayEmployeeInformation(){
	    System.out.println("ID: " + this.id + "\n");
	    System.out.println("Name: " + this.name + "\n");
	    System.out.println("Date of Birth: " + this.dateOfBirth + "\n"); 
	    System.out.println("Joining Date: " + this.joiningDate + "\n");
	    System.out.println("Blood Group: " + this.bloodGroup + "\n"); 
	    System.out.println("Address: " + this.address + "\n"); 
	    System.out.println("Monthly Salary: " + this.monthlySalary);
	
	 }

}
