import java.util.Scanner;
public class IT24102339Lab5Q1
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);  //create a obeject called input 
		int number1,number2,number3;

		
		System.out.print("Enter the first integer: ");  // for the first integer input
		number1 = input.nextInt();
		
		System.out.print("Enter the second integer: ");  //for the second integer input
		number2 = input.nextInt();

		System.out.print("Enter the third integer: ");  // for the third integer input
		number3 = input.nextInt();
		
		
        	System.out.println("User entered numbers are : "+(number1+" "+number2+" "+number3));  //to display input numbers
		
	    	if ((number1<number2) && (number1<number3))                        
	    	{
	       		System.out.println("The Smallest number is: "+number1);
	    	}
	    	else if ((number2<number1) && (number2<number3))                   //arguments to find the Smallest number and to display the outputs
	    	{
	       		System.out.println("The Smallest number is: "+number2); 
	    	}
	    	else
	    	{
	        	System.out.println("The Smallest number is: "+number3);
	    	}
	    
	    	
		
	     	if ((number1>number2) && (number1>number3))
	   	 {
	       		System.out.println("The Largest number is: "+number1);
	    	}
	    	else if ((number2>number1) && (number2>number3))
	    	{
	       		System.out.println("The Largest number is: "+number2);      //arguments to find the largest number and to display the outputs
	    	}
	    	else
	    	{
	        	System.out.println("The Largest number is: "+number3);
	    	}
	    
	 }

}
