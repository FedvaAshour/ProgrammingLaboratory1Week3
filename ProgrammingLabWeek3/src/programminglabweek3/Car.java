package programminglabweek3;


    


public class Car {

    protected String plateNumber;
    protected String model;
    protected double mileage;
    protected double fuelLevel;
    protected double tankCapacity;

    // Constructor
    public Car(String plateNumber, String model,
               double fuelLevel, double tankCapacity) {

        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    // Drive method
    public void Drive(double km) {

        double needFuel = km / 10;

        if (fuelLevel - needFuel < 0) {

            System.out.println("Not Enough fuel for this trip!");

        } else {

            System.out.println("Driving " + km + " km");

            fuelLevel = fuelLevel - needFuel;
            mileage = mileage + km;
        }

        System.out.println("Car: " + model + " " + plateNumber);
        System.out.println("Current Mileage: " + mileage);
        System.out.println("Current Fuel: "
                + fuelLevel + "/" + tankCapacity);

        System.out.println("-------------------------");
    }

    // Refuel method
    public void Refuel(double increaseFuel) {

        System.out.println("Refueling " + increaseFuel + " Liters");

        fuelLevel = fuelLevel + increaseFuel;

        if (fuelLevel > tankCapacity) {

            System.out.println("Tank is full, extra fuel discarded.");

            fuelLevel = tankCapacity;
        }

        System.out.println("Current Mileage: " + mileage);
        System.out.println("Current Fuel: "
                + fuelLevel + "/" + tankCapacity);

        System.out.println("-------------------------");
    }

    // Check Status method
    public void checkStatus() {

        System.out.println("Current Mileage: " + mileage);
        System.out.println("Current Fuel Level: "
                + fuelLevel + "/" + tankCapacity);

        if (fuelLevel < tankCapacity * 0.10) {

            System.out.println("Low fuel warning!");
        }

        System.out.println("-------------------------");
    }
}



