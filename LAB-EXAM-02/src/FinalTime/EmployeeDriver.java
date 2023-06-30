package FinalTime;

public class EmployeeDriver {
	public static void main(String[] args) {
		   ItExecutive i=new ItExecutive("E-0001","mouni","13-02-1998","O+","XYZ",5000.0,1000);//CREATE OBJECT FOR ITExecutive
		   HrManager h=new HrManager("E-0002","Krish","5-12-565","AB","Hyd",1000.0,500);
		   i.Details();
		   h.Details();
		  
		}

}
