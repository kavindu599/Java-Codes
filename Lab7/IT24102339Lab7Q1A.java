import java.util.Scanner;  //import the Scanner class file

public class IT24102339Lab7Q1A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //ctreated a Scanner object called input
        
        
        int subject1, subject2, subject3, subject4;    // declare variables to store marks

        double average;
        
       
        System.out.println("Enter marks for four subjects:");   //request for user inputs
        System.out.print("Enter Subject Mark 1: ");     
        subject1 = input.nextInt();
        
        System.out.print("Enter Subject Mark 2: ");
        subject2 = input.nextInt();
        
        System.out.print("Enter Subject Mark 3: ");
        subject3 = input.nextInt();
        
        System.out.print("Enter Subject Mark 4: ");
        subject4 = input.nextInt();
        
        
        average = (subject1 + subject2 + subject3 + subject4) / 4.0;   //to calculate the average
        
        
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average <= 74) {     //find the grade according to marks
            grade = "Credit";
        } else if (average >= 0 && average <= 49) {
            grade = "Fail";
        } else {
            grade = "Invalid Marks Entered";
        }
        
       
        System.out.println("Average is: " + average);
        System.out.println("Overall Grade is: " + grade);   //display  average and overall marks
        
        
    }
}