import java.util.Scanner;   // import Scanner class file

public class IT24102339Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // created a new obeject called input
        int count = 0;
        int number;
        double sumOfSquares = 0.0;  //declare variable types

        while (true) {   //while condition
            System.out.print("Enter a number: ");  //request for the user input
             number = input.nextInt();

            if (number == -99) //condition if the user input is -99
            {
                break;
            }

            if (number <= 0) //condition if user input is Zero
            {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate. ");
                continue;
            }

            sumOfSquares += Math.pow(number, 2);   //to find the sum of squares
            count++;
        }

        

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);  //to calculate the squaroot of the sumofsquares
            System.out.printf("The Root Mean Square (RMS) is: "+ rms);  //to display the rms value
        } else {
            System.out.println("The Root Mean Square (RMS) is: 0.0");
        }
    }
}
