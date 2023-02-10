public class Vehicle {
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected int fuelCapacity;
    protected int cc ;
 public Vehicle()
 {

 }
 public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc) 
 {  
    this.make=make;
      this.vehicleNumber=vehicleNumber;  
    this.fuelType=fuelType;
      this.fuelCapacity=fuelCapacity;
      this.cc=cc;
 }
 public void setVehicleNumber(String vehicleNumber){
     this.vehicleNumber=vehicleNumber;}
 public void setFuelType(String fuelType)
 {
     this.fuelType=fuelType;
     }

     public int getFuelCapacity()
       {   
         return this.fuelCapacity; 
         } 
          public int getCc()
            { 
                return this.cc; 
             } 
             public void displayMake()  
            {    
                   System.out.println("***"+this.make+"***");   
                 System.out.println("Vechicle number: "+ this.vehicleNumber);  
                  System.out.println("Fuel type: "+this.fuelType);
                    System.out.println(" fuel Capactity : "+ this.fuelCapacity);   
      System.out.println("CC: "+this.cc);  }}
}
