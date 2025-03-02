import java.util.Scanner;

public class IT24102339Lab9Q1 {
   
  public static void main (String[]args) {
        
       Scanner input = new Scanner (System.in);

          
          //Declare varialbles
           double a,b,c;  

           double root1, root2;

           //Request user inputs
           System.out.print("Enter value a: ");
           a = input.nextDouble();

           System.out.print("Enter value b: ");
           b = input.nextDouble();

           System.out.print("Enter value c: ");
           c = input.nextDouble();

           //Calculations
           root1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);

           root2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);


           //To print outputs
           System.out.println("Roots are real and different: ");

           System.out.println("Root 1: "+root1);

           System.out.println("Root 2: "+root2);

          //close Scanner file
          input.close(); 




   }




}