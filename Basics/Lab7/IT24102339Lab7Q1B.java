import java.util.Scanner;
public class IT24102339Lab7Q1B {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);      //Created a scanner object
        
        Declare the variables
        int i,j;  //Declare the variables i for student number , j for subject number
        double marks,totMarks=0,average;
        String grade;
        
        
        for (i=1;i<=3;i++) {
            System.out.println("Student "+i);
            System.out.print("Enter marks :");   //Get the marks as user inputs
            for (j=1;j<=4;j++) {
                marks = input.nextDouble();
                totMarks+=marks;
            }
            
            average = totMarks/4; //calculate the average
        
            
            grade = (average<50 ? "Fail" : (average<75 ? "Credit" : "Distinction"));  //Grade selection
            
             //Outputs
             System.out.println("Average is:"+average);
             System.out.println("Overall Grade is :"+grade);  ////Outputs

             System.out.println();
             totMarks=0;           //To reset the total marks
        }
    }
}