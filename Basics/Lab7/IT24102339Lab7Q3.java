import java.util.*;
public class IT24102339Lab7Q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);   //Createed a scanner object
        
                  //Declare and initialize the variables
        int i;   //to control the customer number
        double totalAmount,discount=0.05, discountAmount, finalAmount;
        char modeOfPayment;
        
        for(i=1;i<=5;i++){   //control customer numbers
            System.out.println("Customer "+i);
            System.out.print("Enter total bill amount: ");
            totalAmount = input.nextDouble();
            
            System.out.print("Enter mode of payment(c for cash, o for other):");   //get payment methode from the user
            modeOfPayment = input.next().charAt(0);
            
            if(modeOfPayment=='c') {  //check the payment type
                discountAmount = totalAmount*discount;
                finalAmount = totalAmount-discountAmount;
                
                //outputs
                System.out.println("Discount is: "+discountAmount);
                System.out.println("Amount to be paid: "+finalAmount);
            }
            else if(modeOfPayment=='o') {   //check the paymemt type
                System.out.println("No discount applicable");   //outputs
                finalAmount=totalAmount;
                System.out.println("Amount to be paid: "+finalAmount);
            }
            else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();  //to print a line
        }
    }
}