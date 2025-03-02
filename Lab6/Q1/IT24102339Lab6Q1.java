import java.util.Scanner;

public class IT24102339Lab6Q1 {

    public static void main (String[]args) {

        double number, square_number, squareRoot ;      //Declare variables
      
        Scanner input = new Scanner(System.in);  //Create a object called input to the Sanner class

        System.out.print("Enter a number: ");   //Request for the user input to enter a number
        number = input.nextDouble();

        square_number = Math.pow(number,2);   //calculation to find the square number

        System.out.println("The square of "+number+" is: "+square_number);  //Display the square number

        squareRoot = Math.sqrt(number);     //Calculation for to find the square root

        System.out.println("The aquare root of "+number+" is: "+squareRoot);

  }


}