package FinalTime;

public class ItExecutive extends Employee {
	double bonus;
	   ItExecutive(){}
	   ItExecutive(String id,String n,String DOB,String bg,String add,double s,double b){
	       super(id,n,DOB,bg,add,s);//CALL THE SUPER CLASS DETIALS
	       this.bonus=b;
	   }
	   public void Details() {
	       double total=bonus+super.salary;//CALCULATE TOTAL INCOME
	       System.out.println("ITExecutive "+super.toString()+", Total income: "+total);
	   }

}
