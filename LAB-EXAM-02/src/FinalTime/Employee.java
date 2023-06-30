package FinalTime;

public class Employee {
	String id;
	   String name;
	   String dateOfBirth;
	   String bloodGroup;
	   String adress;
	   double salary;
	  
	   Employee(){}
	   Employee(String id,String n,String DOB,String bg,String add,double s){
	       this.id=id;
	       this.name=n;
	       this.dateOfBirth=DOB;
	       this.bloodGroup=bg;
	       this.adress=add;
	       this.salary=s;
	   }

	   public void displayEmployeeInformation() {
	       System.out.println("Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", bloodGroup=" + bloodGroup
	               + ", adress=" + adress + ", salary=" + salary + "]");
	   }

}
