package MidAnotherCode;

public class MarketAnalyst extends Employee {
public int  Commission;
	
	public MarketAnalyst(String n, String a, String j, String i , String b, String h, int o,int p){
         super( n,a, j,  i ,  b,  h,  o);
		 this.Commission = p;
       
    }
	
	public int CalculateYearlySalary(){
			int total = (MonthlySalary * 12) + Commission;
			return total;
			
	}
	
	
	
	
	public void Printthedetails (){
		
		System.out.println(Id);
        System.out.println(Name);
        System.out.println(DateOfBirth);
        System.out.println(JoiningDate);
		System.out.println(BloodGroup);
		System.out.println(Address);
		System.out.println(MonthlySalary);
        System.out.println(Commission);
        
    }

}
