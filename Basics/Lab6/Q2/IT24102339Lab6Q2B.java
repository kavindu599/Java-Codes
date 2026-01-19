import java.util.Scanner;  //import the Scanner class file

public class IT24102339Lab6Q2B {
    
    public static void main (String[]args) {
        
        int count=1,number;   //Declare variable types
        String numbers="";
        
        Scanner input = new Scanner(System.in); //Created a obeject called input for the scanner class file
        
        while (count<11)   // used while loop
        {
            System.out.print("Enter number "+count+": ");
            number = input.nextInt();
            count++;   // Calculation for the number count
            
            numbers = numbers+number+ " ";
            
            
            
            
        }
        System.out.print("The numbers you entered are: "+numbers+"");
    }
}