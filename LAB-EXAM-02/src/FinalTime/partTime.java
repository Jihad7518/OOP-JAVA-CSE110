package FinalTime;

public class partTime extends Employee {
	partTime(){}
	   partTime(String id,String n,String DOB,String bg,String add,double s){
	       super(id,n,DOB,bg,add,s);
	   }
	   public void Details() {
	       System.out.println("PartTimer "+super.toString());
	   }

}
