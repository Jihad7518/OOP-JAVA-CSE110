
package quiz;
import java.util.ArrayList;

 class  Patient {
   
   private String id, name;
   Patient(){
       
   }
    Patient(String id, String name){
        this.id=id;
        this.name=name;
    }
    public double Bill(){
        return 0;
        
    }

    @Override
    public String toString() {
        return "Patient{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
class OutdoorPatient extends Patient{
    private int visitingFee;
    
  OutdoorPatient(String id, String name, int visitingFee){
      super(id, name);
      this.visitingFee=visitingFee;
  }

    public int getVisitingFee() {
        return visitingFee;
    }

    public void setVisitingFee(int visitingFee) {
        this.visitingFee = visitingFee;
    }
    public double Bill(){
        return visitingFee;
    }

    @Override
    public String toString() {
        return "OutdoorPatient[" + super.toString() + ", Visiting fee=" + visitingFee + "]";
    }
}
    
    class IndoorPaient extends Patient{
        
        private double bedFee, medicineFee, labtestFee;
        
        IndoorPaient(String id, String name, double bedFee, double medicineFee, double labtestFee){
            super(id, name);
            this.bedFee=bedFee;
            this.labtestFee=labtestFee;
            this.medicineFee=medicineFee;
        }

        public double getBedFee() {
            return bedFee;
        }

        public void setBedFee(double bedFee) {
            this.bedFee = bedFee;
        }

        public double getMedicineFee() {
            return medicineFee;
        }

        public void setMedicineFee(double medicineFee) {
            this.medicineFee = medicineFee;
        }

        public double getLabtestFee() {
            return labtestFee;
        }

        public void setLabtestFee(double labtestFee) {
            this.labtestFee = labtestFee;
        }
        public double Bill(){
            return bedFee+medicineFee+labtestFee;
        }

        @Override
        public String toString() {
            return "IndoorPaient{ "+super.toString()+" " + "bedFee=" + bedFee + ", medicineFee=" + medicineFee + ", labtestFee=" + labtestFee + '}';
        }
        
    }

    
    class main{
        public static void main(String[] args) {
           Patient patient = new Patient(); 
            ArrayList< Patient>list=new ArrayList< Patient>();
            Patient ob1 = new IndoorPaient("2020-094","abid",1000, 800, 4000 ); 
             Patient ob2 = new IndoorPaient("2020-095","rafid",2000, 900, 3000 ); 
           
           
            Patient ob3 = new OutdoorPatient("2020-096","raifa", 800);
            Patient ob4 = new OutdoorPatient("2020-097","rifat", 600);
            System.out.println(patient.Bill());
            System.out.println(patient.toString());
        }
    }
  
    

   
    
   
   
   
       
       
  
   


