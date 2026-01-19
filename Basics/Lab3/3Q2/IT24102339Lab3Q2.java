//import Scanner class file
import java.util.Scanner;

public class IT24102339Lab3Q2 {

      public static void main (String []args) {

            //declare variables
            double monthly_salary, number_of_OT_hours, OT_hourly_rate, OT_amount, total_salary;
            
            //requesting user inputs
            System.out.print("Enter the monthly salary: ");
            Scanner input = new Scanner(System.in);
            monthly_salary = input.nextDouble();

            System.out.print("Enter the number of OT hours: ");
            
            number_of_OT_hours = input.nextDouble();

            System.out.print("Enter the OT hourly rate: ");
            OT_hourly_rate = input.nextDouble();

            OT_amount = number_of_OT_hours*OT_hourly_rate;
            

            total_salary = (monthly_salary+OT_amount);
            
            //output
            System.out.print("total salary including OT is: "+ total_salary);

            }




}