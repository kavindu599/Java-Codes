import java.util.Scanner;
public class IT24102339Lab8Q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        int numArray[] = new int[6];  //declared and allocated Array
        int i,count=0, num;   //delcred and initialized variables
        
        while (count<6){
            System.out.print("Enter a positive number (" + (count+1) + "/6): ");   //for user input
            num = input.nextInt();
            
            if(num>0) {
                numArray[count] = num;
                count++;
            }
            else{
                System.out.println("Error:Please Enter Only positive Numbers");  //error message
            }
        }
        System.out.println("Array Contents:");
        for(i=0; i<numArray.length; i++) {
            System.out.print(numArray[i]+" ");    //to print array contents
        }
        System.out.println();
        
        int max = numArray[0];
        for(i=1; i<numArray.length; i++){    //to find the max number
            if(numArray[i]>max) {
                max = numArray[i];
            }
        }
        System.out.println("The Maximum Number is: "+max);   //to print the max number
    }
}