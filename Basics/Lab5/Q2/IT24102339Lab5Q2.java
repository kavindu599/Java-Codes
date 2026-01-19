import java.util.Scanner;
public class IT24102339Lab5Q2
{
	public static void main(String[] args)  
	{
		
		Scanner input = new Scanner(System.in);   //created a object called input
		int numOfPeople;
		

		
		System.out.print("Enter the number of new members: ");   //display the input interface
		numOfPeople = input.nextInt();
		
		switch(numOfPeople)    // Switch statement
		{
			case 0 : System.out.println("No Prize");
				   break;

			case 1 : System.out.println("Prize is a : Pen");
				   break;
			
			case 2 : System.out.println("Prize is a : Umbrella");            //arguments and outputs to find the prizes
				   break;

			case 3 : System.out.println("Prize is a : Bag");
				   break;

			case 4 : System.out.println("Prize is a : Travelling Chair");
				   break;
		
            		default :
			    if (numOfPeople>=5)
			    {
			        System.out.println("Prize is a : Headphone");
			    }
                
                	else 
               		    {
                    		System.out.println("Input must be a number 0 or greater");       // display a respond for other inputs-1
               		    }
			    
		}

	 }

}