import java.util.Scanner;

public class IT24102339Lab3Q4 {

    public static void main (String[]args) {

        //declare varialbes
        int Number, number1, number2, number3, number4, number5, r1, r2, r3, r4, r5;

        //requesting user inputs
        System.out.print("Enter a Five-digit Number: ");
        Scanner input = new Scanner(System.in);
        Number = input.nextInt();

        //Calculations and outputs
        number1= Number/10000;
        System.out.print(number1);

        r1 = Number%10000;
        number2= r1/1000;
        System.out.print(" "+number2);

        r2 = r1%1000;
        number3= r2/100;
        System.out.print(" "+number3);

        r3 = r2%100;
        number4= r3/10;
        System.out.print(" "+number4);

        r4 = r3%10;
        number5= r4/1;
        System.out.print(" "+number5);
        

    }
}