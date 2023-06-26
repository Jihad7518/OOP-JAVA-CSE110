package Excercise;

public class IceCream {
	private String icecreamType;
	private String icecreamCompany;
	private double icecreamPrice;
	
	
	public String getInccreamType() {
		return icecreamType;
	}
	public String getIcecreamCompany() {
		return icecreamCompany;
	}
	public double getIcecreamPrice() {
		return icecreamPrice;
	}
	public void setInccreamType(String inccreamType) {
		this.icecreamType = inccreamType;
	}
	public void setIcecreamCompany(String icecreamCompany) {
		this.icecreamCompany = icecreamCompany;
	}
	public void setIcecreamPrice(double icecreamPrice) {
		this.icecreamPrice = icecreamPrice;
	}
	
	public IceCream() {
		
	}
	public IceCream(String inccreamType, String icecreamCompany, double icecreamPrice) {
		super();
		this.icecreamType = inccreamType;
		this.icecreamCompany = icecreamCompany;
		this.icecreamPrice = icecreamPrice;
	}
	
	@Override
	public String toString() {
		String str = new String ("IcecremaType : "+ icecreamType + "\n");
		str += new String ("IceCreameCompany : " + icecreamCompany + "\n");
		str += new String ("IceCreamPrice : " + icecreamPrice + "\n");
		str += new String ("----------------------------------------\n");
		return str;
		//return "IceCream [inccreamType=" + inccreamType + ", icecreamCompany=" + icecreamCompany + ", icecreamPrice="+ icecreamPrice + "]";
	}
	
	public boolean equals(IceCream I) {
		if(this.getIcecreamPrice() == I.getIcecreamPrice()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int compareTo(IceCream I) {
		if(this.getIcecreamPrice() > I.getIcecreamPrice()) {
			return 1;
		}
		else if(this.getIcecreamPrice() == I.getIcecreamPrice()) {
			return 0;
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
