import java.util.Scanner;
public class IT24102339Lab3Q3 {
    public static void main (String[]args){

        //declare variables
        int rupee_amount, note5000, note1000, note500, note200, note100, note50, note20, note10, note5, note2, note1, rem5000, rem1000, rem500, rem200, rem100, rem50, rem20,rem10, rem5, rem2,rem1;

        //requesting user inputs
        System.out.print("Enter the Rupee amount: ");
        Scanner input = new Scanner(System.in);
        rupee_amount = input.nextInt();

        //calculations
        note5000 = rupee_amount/5000;
        System.out.println("5000 Notes -  "+note5000);

        rem5000= rupee_amount%5000;
        note1000= rem5000/1000;
        System.out.println("1000 Notes -  "+note1000);

        rem1000= rem5000%1000;
        note500= rem1000/500;
        System.out.println("500 Notes -  "+note500);

        rem500= rem1000%500;
        note200= rem500/200;
        System.out.println("200 Notes -  "+note200);

        rem200= rem500%200;
        note100= rem200/100;
        System.out.println("100 Notes -  "+note100);

        rem100= rem200%100;
        note50= rem100/50;
        System.out.println("50 Notes -  "+note50);

        rem50= rem100%50;
        note20= rem50/20;
        System.out.println("20 Notes -  "+note20);

        rem20= rem50%20;
        note10= rem20/10;
        System.out.println("10 coins -  "+note10);

        rem10= rem20%10;
        note5= rem10/5;
        System.out.println("05 coins -  "+note5);

        rem5= rem10%5;
        note2= rem5/2;
        System.out.println("02 coins -  "+note2);

        rem2= rem5%2;
        note1= rem2/1;
        
        //output
        System.out.println("01 coins -  "+note1);




    }
    
}
