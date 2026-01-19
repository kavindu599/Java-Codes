//import scanner class file
import java.util.Scanner;

public class IT24102339Lab3Q1B {

      public static void main (String []args) {

            //declare and initialized variables
            double price_of_1kg_of_rice, number_of_kilograms, total, discount, new_total;
            
            //user inputs
            System.out.print("Enter the price of 1kg of rice: ");
            Scanner input = new Scanner(System.in);
            price_of_1kg_of_rice = input.nextDouble();

            System.out.print("Enter the number of kilograms you want to buy: ");
            
            number_of_kilograms = input.nextDouble();

            //calculations
            total = (price_of_1kg_of_rice*number_of_kilograms);
            discount = (total*10)/100;
            new_total = (total-discount);
            
            //output
            System.out.print("The total amount with 10% discount is: "+ new_total);

            }




}