//import scanner class file
import java.util.Scanner;

public class IT24102339Lab3Q1A {

      public static void main (String []args) {

            //declare and initialize variables
            double price_of_1kg_of_rice, number_of_kilograms, total;
            
            //user inputs
            System.out.print("Enter the price of 1kg of rice: ");
            Scanner input = new Scanner(System.in);
            price_of_1kg_of_rice = input.nextDouble();

            System.out.print("Enter the number of kilograms you want to buy: ");
            
            number_of_kilograms = input.nextDouble();

            //Calculation
            total = (price_of_1kg_of_rice*number_of_kilograms);
            
            //output
            System.out.print("total amount is: "+ total);

            }




}