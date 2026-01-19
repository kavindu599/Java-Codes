import java.util.Scanner;

class Employee {

    //declare variables
    private int ID;
    private String name;
    private double basicSalary;
    private int performanceRate;
    private double bonus;
    private double totalSalary;


    public Employee(int ID, String name, double basicSalary, int performanceRate) {
        this.ID = ID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.performanceRate = performanceRate;
    }

    //to calculate the Bonus
    public void calculateBonus() {
        switch (performanceRate) {
            case 5:
                bonus = basicSalary * 20 / 100;
                break;
            case 4:
                bonus = basicSalary * 15 / 100;
                break;
            case 3:
                bonus = basicSalary * 10 / 100;
                break;
            case 2:
                bonus = basicSalary * 5 / 100;
                break;
            case 1:
                bonus = 0;
                break;
            default:
                System.out.println("Performance Rate should be between 1 and 5: ");
                bonus = 0;
        }
    }

    // to calculate the total salary
    public void calculateTotalSalary() {
        totalSalary = basicSalary + bonus;
    }

    //for print details
    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Performance Rating: " + performanceRate);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }
}

public class EmployeePerformance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //requesting user inputs
        System.out.print("Enter Employee ID: ");
        int ID = input.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = input.nextDouble();

        System.out.print("Enter Performance Rating (1-5): ");
        int performanceRate = input.nextInt();

        System.out.println();

        //create a new employee object
        Employee employee = new Employee(ID, name, basicSalary, performanceRate);
        employee.calculateBonus();
        employee.calculateTotalSalary();
        employee.printDetails();
    }
}
