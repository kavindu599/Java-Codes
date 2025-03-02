import java.util.Scanner;

public class IT24102339Lab4Q2 {
    
    public static void main (String[]args) {
        
        int exam_marks, lab_marks, exam_percentage, lab_percentage, sum_of_percentages;
        double final_marks;
        
        System.out.println("Please enter exam marks (OUT OF 100): ");
        Scanner input = new Scanner(System.in);
        exam_marks = input.nextInt();
        
        System.out.println("Please enter lab submission marks(out of 100): ");
        lab_marks = input.nextInt();
        
        System.out.println("Please enter the percentage given for the exam: ");
        exam_percentage = input.nextInt();
        
        System.out.println("Please enter the percentage given for the lab submission: ");
        lab_percentage = input.nextInt();
        
        sum_of_percentages= exam_percentage+lab_percentage;
        
        
        if ((exam_marks>=0 && exam_marks<=100) && (exam_percentage>=0 && lab_percentage<=100) && (sum_of_percentages==100));
        
        {
            final_marks = ((exam_marks*exam_percentage)/100) + ((lab_marks*lab_percentage)/100);
            System.out.println("final Exam Mark is : "+final_marks);
        }
        
            if (exam_marks>100 || exam_marks<0)
            {
               System.out.println("Invalid input for exam marks. terminating program "); 
            }
            
            else if (lab_marks>100 || lab_marks<0)
            {
               System.out.println("Invalid input for lab submission marks. terminating program "); 
            }
            
            else if (exam_percentage>100 || exam_percentage<0)
            {
               System.out.println("Invalid input for exampercentage. terminating program "); 
            }
            
            else if (lab_percentage>100 || lab_percentage<0)
            {
               System.out.println("Invalid input for lab percentage. terminating program "); 
            }
            
            else
            {
                System.out.println("The percentages must add up to 100 ");
            }
    }
    
}