public class Driver {

    //Attributes
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor that accepts only driverID and driverName
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performanceScore = 1;
    }

    //constructor that accepts productID, productName and basePrice.
    public Driver(String driverID, String driverName, double baseSalary) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        this.performanceScore = 1;
    }

    //constructor that initializes all four attributes
    public Driver(String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    // Getters
    public String getDriverID() {
        return driverID;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    // Setter validation
    public void setPerformanceScore(int performanceScore) {
        if (performanceScore < 1 || performanceScore > 5) {
            this.performanceScore = 1; // Default to 1 if invalid
        } else {
            this.performanceScore = performanceScore;
        }
    }

    // Method to calculate bonus on performance score
    public double calculateBonus() {
        switch (performanceScore) {
            case 5: return baseSalary * 0.25;
            case 4: return baseSalary * 0.20;
            case 3: return baseSalary * 0.15;
            case 2: return baseSalary * 0.10;
            default: return 0.0; // No bonus for score 1
        }
    }

    // Method to calculate bonus with custom score
    public double calculateBonus(int customScore) {
        switch (customScore) {
            case 5: return baseSalary * 0.25;
            case 4: return baseSalary * 0.20;
            case 3: return baseSalary * 0.15;
            case 2: return baseSalary * 0.10;
            default: return 0.0;
        }
    }

    // Method to calculate total salary
    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    // Display driver details
    public void displayDriverDetails() {
        System.out.println("Driver ID: " + driverID);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Driver object
        Driver driver1 = new Driver("D1001", "John Smith", 4000, 5);
        Driver driver2 = new Driver("D1002", "Emily Davis", 3500, 3);
        Driver driver3 = new Driver("D1003", "Michael Johnson", 5000, 1);

        // Displaying driver details
        driver1.displayDriverDetails();
        driver2.displayDriverDetails();
        driver3.displayDriverDetails();

        // Custom bonus calculation
        System.out.println("Bonus for driver 3 with custom rating 4: " + driver3.calculateBonus(4));
    }
}