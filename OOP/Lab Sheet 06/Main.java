
class Vehicle {
    protected String vehicleName;

    // Default constructor
    public Vehicle() {
        this.vehicleName ="N/A";
    }

    // Parameterized constructor
    public Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Method to display vehicle details
    public void displayVehicleDetails(){
        System.out.println("Vehicle Name: "+ vehicleName);
    }

    // Method to calculate speed
    public double calculateSpeed(){
        return 0.0;
    }

    // Overloaded method to calculate speed with a given factor
    public double calculateSpeed(double factor){
        return calculateSpeed()* factor;
    }
}

class Car extends Vehicle{
    private int engineCapacity;
    private double topSpeed;

    //Default constructor
    public Car(){
        super();
        this.engineCapacity = 0;
        this.topSpeed = 0.0;
    }

    // Parameterized constructor
    public Car(String name , int engineCapacity , double topSpeed){
        super(name);
        this.engineCapacity = engineCapacity;
        this.topSpeed = topSpeed;
    }

    // Overriding the calculateSpeed method to return top speed
    public double calculateSpeed(){
        return topSpeed;
    }

    // Overriding the displayVehicleDetails method
    public void displayVehicleDetails(){
        super.displayVehicleDetails();
        System.out.println("Engine Capacity: "+engineCapacity+" CC");
        System.out.println("Top speed :"+topSpeed+"km/h");
    }
}

class Bicycle extends Vehicle{
    private int gearCount;
    private double maxPedelSpeed;

    // Default constructor
    public Bicycle(){
        super();
        this.gearCount = 0;
        this.maxPedelSpeed = 0;
    }

    // Parameterized constructor
    public Bicycle(String name, int gearCount , double maxPedelSpeed){
        super(name);
        this.gearCount = gearCount;
        this.maxPedelSpeed = maxPedelSpeed;
    }

    // Overriding the calculateSpeed method to return max pedal speed
    public double calculateSpeed() {
        return maxPedelSpeed;
    }

    // Overriding the displayVehicleDetails method
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Gear Count : "+ gearCount);
        System.out.println("Max Padel Speed: "+maxPedelSpeed+"km/h");

    }
}

public class Main {
    public static void main(String[] args){

        // Creating a Car object
        Car car1 = new Car();

        //// Create a Bicycle object
        Bicycle bike1 = new Bicycle("Bicycle1", 5,200);


        // Display the details
        car1.displayVehicleDetails();

        System.out.println();

        bike1.displayVehicleDetails();
    }
}




