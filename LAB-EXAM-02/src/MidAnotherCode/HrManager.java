package MidAnotherCode;

class HrManager extends Employee {
	
	public String KPI;
	
	 public HrManager (String n, String a, String j, String i , String b, String h, int o, String p){
         super( n,a, j,  i ,  b,  h,  o );
		 this.KPI = p;
       
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
        System.out.println(KPI);
        
    }
}