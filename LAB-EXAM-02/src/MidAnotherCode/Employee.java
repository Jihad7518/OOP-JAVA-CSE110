package MidAnotherCode;

public class Employee {
	public String Id;
    public String Name;
    public String DateOfBirth;
    public String JoiningDate;
    public String BloodGroup;
    public String Address;
    public int    MonthlySalary;



       public void Printthedetails (){
       System.out.println(Id);
       System.out.println(Name);
       System.out.println(DateOfBirth);
       System.out.println(JoiningDate);
		System.out.println(BloodGroup);
		System.out.println(Address);
		System.out.println(MonthlySalary);
   }
	
	    public Employee (String n, String a, String j, String i , String b, String h, int o){
       
	    	this.Id = n;
		    this.Name= a;
		    this.DateOfBirth = j;
		    this.JoiningDate = i;
		    this.BloodGroup = b;
		    this.Address = h;
		    this.MonthlySalary = o;
   }

}
