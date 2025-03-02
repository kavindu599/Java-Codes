import java.util.Scanner;
public class IT24102339Lab5Q3
{
	public static void main(String[] args)
    	{
		
    		Scanner input = new Scanner(System.in); //crate the input object
        
		
        	int start_date, end_date, date;   // defined the datatypes
        	double total_1 , total_2 ,discount_1 ,discount_2, amount_1, amount_2;  //defined the datatypes
        
		
        	System.out.print("Enter Start Date (1-31): ");   //display the start date statemet for a input
        	start_date = input.nextInt();
        
		
        	System.out.print("Enter End Date (1-31): ");   // display the end date sattement for a input
        	end_date = input.nextInt();
        
		
        	final double room_per_day = 48000.0;
		    final double first = 10.0/100;                  // useed the CONSTANT method for fixed values
		    final double more = 20.0/100;

		
        	if ((start_date>=1) && (start_date<=31) && (end_date>=1) && (end_date<=31))
        	{
			
  			if ((start_date)<(end_date))
            		{
                		date = end_date - start_date;	
                		System.out.println("Room Charge Per Day: Rs. "+room_per_day+"/=");	
               		 	System.out.println("Number of Days Reserved: " +date);	

				
                		if (date>=5)
                		{
					
                    			amount_1 = room_per_day*date;
                    			discount_1 = amount_1*more;                   // calculation, arguments and outputs for the total amount
                    			total_1= (amount_1 - discount_1);
                     			System.out.println("Total Amount to be Paid: "+total_1);         
               			}
				
                		else if (date==3 || date==4)                        
                		{
					
                     			amount_2 = room_per_day*date;
                     			discount_2 = amount_2*first;                         //calculation, arguments and outputs for the total amount
                     			total_2= (amount_2 - discount_2);
                     			System.out.println("Total Amount to be aid: "+total_2); 
                		}
                		else 
                		{
                   			System.out.println("Total Amount to be Paid: "+room_per_day); 
                		}
            		}
            		else
            		{
                		System.out.println("Error: Start Date must be less than End Date");
            		}
        	}
        	else
        	{
            		System.out.println("Error: Days must be between 1 and 31");
        	}
    }
    
    
}