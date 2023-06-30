package FinalTime;

public class MarketAnalyst extends Employee {
	double Commision;
	   MarketAnalyst(){}
	   MarketAnalyst(String id,String n,String DOB,String bg,String add,double s,double c){
	       super(id,n,DOB,bg,add,s);
	       this.Commision=c;
	   }
	   public void Details() {
	       double total=Commision+super.salary;//CALCULATE TOTAL INCOME
	       System.out.println("MarketAnalyst "+super.toString()+", Total income: "+total);
	   }
	}
	class PartTimer extends Employee{
	   PartTimer(){}
	   PartTimer(String id,String n,String DOB,String bg,String add,double s){
	       super(id,n,DOB,bg,add,s);
	   }
	   public void Details() {
	       System.out.println("PartTimer "+super.toString());
	   }

}
