package Mid01_Viva;

public class ITExecutive extends Employee {
	private double projectBonus;
    
	    public ITExecutive(){
	        
	    }
	    
	    public ITExecutive(String id, String name, String dateOfBirth, String joiningDate, String bloodGroup, String address, double monthlySalary, double projectBonus){
	        super(id, name, dateOfBirth, joiningDate, bloodGroup, address, monthlySalary);
	        this.projectBonus = projectBonus;
	    }
	    
	    public double getProjectBonus(){
	        return projectBonus;
	    }
	    
	    public void setProjectBonus(double bonus){
	        projectBonus = bonus;
	    }
	    
	    public double getTotalIncome(){
	        return super.getMonthlySalary() + projectBonus;
	    }
	    
	    
	    public void displayeEmployeeInformation(){
	    	System.out.println("ID: " + this.getId() + "\n");
		    System.out.println("Name: " + this.getName() + "\n");
		    System.out.println("Date of Birth: " + this.getDateOfBirth() + "\n"); 
		    System.out.println("Joining Date: " + this.getJoiningDate() + "\n");
		    System.out.println("Blood Group: " + this.getBloodGroup() + "\n"); 
		    System.out.println("Address: " + this.getAddress() + "\n"); 
		    System.out.println("Monthly Salary: " + this.getMonthlySalary());
	        System.out.println("Project Bonus: " + projectBonus + "\n"); 
	        System.out.println("Total Income: " + getTotalIncome());
	    }

}
