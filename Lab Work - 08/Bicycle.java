package ClassWork;

class Bicycle implements IVehicle {

	int mileage;
	int numGears;

	Bicycle(int mileage,int numGears){
		this.mileage = mileage;
		this.numGears = numGears;
  
	}

   public void setMileage(int mileage) {
       this.mileage = mileage;
   }
   public void setNumGears(int numGears) {
       this.numGears = numGears;
   }
   public int getMileage() {
           return mileage;
   }
   public int getNumGears() {
       return numGears;
   }
   
   @Override
   public double tuneUpCost() {
       return 0;
   }

   @Override
   public boolean canCarry(int numPassengers) {
       if(2 < numPassengers) {
           return false;
       }
       return true;
   }
   
}