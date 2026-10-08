
package programminglabweek3;


public class ProgrammingLabWeek3 {

   
    public static void main(String[] args) {
  Car car = new Car("38 ABC 123", "Toyota Corolla", 20, 50);
   System.out.println("Car :"+car.model+" ("+car.plateNumber+") "); 
   System.out.println("current Mileage :"+car.mileage+" rm");
   System.out.println("Current Fual: "+car. fuelLevel+"/"+car.tankCapacity);
   System.out.println("Car created.");
   
       car.checkStatus();

        car.Drive(100);

        car.Refuel(20);

        car.Drive(200);

        // Not enough fuel case
        car.Drive(500);

        // Tank capacity exceeded case
        car.Refuel(50);

        car.checkStatus();
    }
}
    
    

