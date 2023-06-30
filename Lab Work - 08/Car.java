package ClassWork;

interface IVehicle {
	public double tuneUpCost();
	public boolean canCarry(int numPassengers);

}

class Car implements IVehicle {
	int mileage;
	int year;
	int numDoors;

public Car(int mileage, int year, int numDoors) {
       this.mileage = mileage;
       this.year = year;
       this.numDoors = numDoors;
   }

   public void setMileage(int mileage) {
       this.mileage = mileage;
   }
   public void setYear(int year) {
       this.year = year;
   }
   public void setNumDoors(int numDoors) {
       this.numDoors = numDoors;
   }
   public int getNumDoors() {
       return numDoors;
   }
   public int getYear() {
       return year;
   }
   public int getMileage() {
       return mileage;
   }

   boolean builtBefore(int otherYear) {

	   	return this.year < otherYear;

   }

   @Override
   public double tuneUpCost() {
       return 0;
   }

   @Override
   public boolean canCarry(int numPassengers) {
       if(5 < numPassengers) {
           return false;
       }
       return true;
   }

}
