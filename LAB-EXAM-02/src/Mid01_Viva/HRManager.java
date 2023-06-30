package Mid01_Viva;

public class HRManager extends Employee {
	private double KPI;
	    
	    public HRManager(){
	        
	    }
	    
	    public HRManager(String id, String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, double monthlySalary, double KPI){
	        super(id, name, dateOfBirth, joiningDate, bloodGroup, address, monthlySalary);
	        this.KPI = KPI;
	    }
	    
	    public double getKPI(){
	        return KPI;
	    }
	    
	    public void setKPI(double kpi){
	        KPI = kpi;
	    }
	    
	    public double getTotalIncome(){
	        return super.getMonthlySalary() + KPI;
	    }
	    
	    
	    public void displayeEmployeeInformation(){
	    	System.out.println("ID: " + this.getId() + "\n");
		    System.out.println("Name: " + this.getName() + "\n");
		    System.out.println("Date of Birth: " + this.getDateOfBirth() + "\n"); 
		    System.out.println("Joining Date: " + this.getJoiningDate() + "\n");
		    System.out.println("Blood Group: " + this.getBloodGroup() + "\n"); 
		    System.out.println("Address: " + this.getAddress() + "\n"); 
		    System.out.println("Monthly Salary: " + this.getMonthlySalary());
	        System.out.println("KPI: " + KPI + "\n"); 
	        System.out.println("Total Income: " + getTotalIncome());
	    }

}
