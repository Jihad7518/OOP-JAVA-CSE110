package Lab05;

public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed;
	private boolean fanOn;
	private double radius;
	private String color;
	
	public int getSpeed() {
		return speed;
	}
	public boolean isFanOn() {
		return fanOn;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setFanOn(boolean fanOn) {
		this.fanOn = fanOn;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public Fan() {
		speed = SLOW;
		fanOn = false;
		radius = 5;
		color = "blue";
	}
	
	@Override
	public String toString() {
		if(fanOn) {
			return "Fan On : "
					+ fanOn + ", radius : " + radius + ", color : " 
					+ color +", Speed : " + speed;
		}
		else {
			return "Fan On : "
					+false + ", Radius : " + this.radius + ", Color : " 
					+ this.getColor();
		}
	}
	
	
}
