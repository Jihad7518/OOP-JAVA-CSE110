package MidAnotherCode;

public class PartTimer extends Employee {
	public PartTimer(String n, String a, String j, String i , String b, String h, int o){
        super ( n,a, j,  i ,  b,  h,  o);
		
      
   }
	
	public int CalculateYearlySalary(){
			int total = (MonthlySalary * 12);
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
       
       
   }

}