import java.util.Scanner;

public class IT24102339Lab4Q3 {

    public static void main (String[]args) {

        int number;
        String message; 

        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        message = (number>0) ? "The number is: positive" : 
                  (number<0)? "The number is: negative" : 
                  "The number is zero" ;

        System.out.println(message);



    }
    
}
