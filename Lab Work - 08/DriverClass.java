package ClassWork;

public class DriverClass {
	//Demonstrating the functionality of interface
	   public static void main(String[] args) {
		   
	       IVehicle c1 = new Car(23,2022,6);
	       IVehicle b1 = new Bicycle(0,4);
	       
	       System.out.println(c1.canCarry(6));
	       
	       Car c2 = new Car(13,2018,4);
	       
	       System.out.println(c2.builtBefore(2018));
	   }
}
