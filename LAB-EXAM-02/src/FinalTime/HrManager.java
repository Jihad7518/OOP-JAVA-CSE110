package FinalTime;

public class HrManager extends Employee {
	double KPI;
	   HrManager(){}
	   HrManager(String id,String n,String DOB,String bg,String add,double s,double KPI){
	       super(id,n,DOB,bg,add,s);
	       this.KPI=KPI;
	   }
	   public void displayeEmployeeInformation() {
	       double total=KPI+super.salary;
	       System.out.println("HRManager Employee [id=\" + id + ", name= " + name + ", dateOfBirth= " + dateOfBirth +"
	       		, bloodGroup= " + bloodGroup +" \n  , adress= " +adress +",salary= "
	       				+ salary +"Total income: "+total);
	   }

}
