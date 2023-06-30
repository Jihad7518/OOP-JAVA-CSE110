package Lab04;

public class Icecream {
	private String icecreamCompany;
	private String icecreamType;
	private double icecreamprice;
	
	public String getIcecreamCompany() {
		return icecreamCompany;
	}
	public String getIcecreamType() {
		return icecreamType;
	}
	public double getIcecreamprice() {
		return icecreamprice;
	}
	public void setIcecreamCompany(String icecreamCompany) {
		this.icecreamCompany = icecreamCompany;
	}
	public void setIcecreamType(String icecreamType) {
		this.icecreamType = icecreamType;
	}
	public void setIcecreamprice(double icecreamprice) {
		this.icecreamprice = icecreamprice;
	}
	
	public Icecream() {
		
	}
	
	public Icecream(String icecreamCompany, String icecreamType, double icecreamprice) {
		super();
		this.icecreamCompany = icecreamCompany;
		this.icecreamType = icecreamType;
		this.icecreamprice = icecreamprice;
	}
	
	@Override
	public String toString() {
		return "Icecream [icecreamCompany=" + icecreamCompany + ", icecreamType=" + icecreamType + ", icecreamprice="
				+ icecreamprice + "]";
	}
	
	

	    

}
