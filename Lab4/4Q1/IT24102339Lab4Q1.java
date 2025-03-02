import java.util.Scanner;

public class IT24102339Lab4Q1 {

     public static void main (String[]args) {

           int number; 
  
           System.out.print("Enter a Number: ");
           Scanner input = new Scanner(System.in);
           number = input.nextInt();
           
           //to check if the number is positive or not and print the output
           if (number>0)
           {
               System.out.println("The number is Positive ");
           }
           
           else if(number<0)
           {
               System.out.println("The number is Negative ");
           }
           
           else
           {
               System.out.print("The number is Zero ");
           }


     }

}