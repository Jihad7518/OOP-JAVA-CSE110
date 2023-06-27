package Lab05;

public class Lab05_Problem02_2020360087_Main {
	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.setSpeed(Fan.FAST);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setFanOn(true);
		
		Fan f2 = new Fan();
		f2.setSpeed(Fan.MEDIUM);
		f2.setRadius(5);
		f2.setColor("Blue");
		f2.setFanOn(false);
		
		System.out.println("--------------Fan Details--------------------");
		System.out.println(f1.toString());
		
		System.out.println("---------------------------------------------");
		
		System.out.println("------------Default Fan Details--------------");
		System.out.println(f2.toString());
		
	}
}
