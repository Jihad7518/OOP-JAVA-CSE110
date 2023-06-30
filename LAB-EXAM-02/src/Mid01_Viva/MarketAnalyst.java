package Mid01_Viva;

public class MarketAnalyst extends Employee {
	 private double commission;
	    
	    public MarketAnalyst(){
	        
	    }
	    
	    public MarketAnalyst(String id, String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, double monthlySalary, double commission){
	        super(id, name, dateOfBirth, joiningDate, bloodGroup, address, monthlySalary);
	        this.commission = commission;
	    }
	    
	    public double getCommission(){
	        return commission;
	    }
	    
	    public void setCommission(double commission){
	        this.commission = commission;
	    }
	    
	    public double getTotalIncome(){
	        return super.getMonthlySalary() + commission;
	    }
	    
	    
	    public void displayEmployeeInformation(){
	    	System.out.println("ID: " + this.getId() + "\n");
		    System.out.println("Name: " + this.getName() + "\n");
		    System.out.println("Date of Birth: " + this.getDateOfBirth() + "\n"); 
		    System.out.println("Joining Date: " + this.getJoiningDate() + "\n");
		    System.out.println("Blood Group: " + this.getBloodGroup() + "\n"); 
		    System.out.println("Address: " + this.getAddress() + "\n"); 
		    System.out.println("Monthly Salary: " + this.getMonthlySalary()); 
	        System.out.println("Commission: " + commission + "\n"); 
	        System.out.println("Total Income: " + getTotalIncome());
	    }

}
