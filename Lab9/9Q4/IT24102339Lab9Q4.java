import java.util.Scanner;
public class IT24102339Lab9Q4 
{
    public static double calcFinalMarks(int assignmentMarks, int paperMarks) //methode for finalmarks
    {
        return assignmentMarks*0.3 + paperMarks*0.7;  //Final marks calculation
    }
    
    public static String findGrades(double finalMarks)  //methode to find the grade
    {
        if (finalMarks >= 75)
        {
            return "A";
        }
        else if (finalMarks >=60)
        {
            return "B";
        }
        else if (finalMarks >= 50)
        {
            return "C";
        }
        else
        {
            return "F";
        }
    }
    
    
    public static void printDetails(String name, double finalMarks, String grade) //methode for print details
    {
        System.out.println(name +"\t\t"+ finalMarks+ "\t\t\t"+ grade); //output of printDetails
    }
    
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);  //input Scanner obejct created
        
        //to create arrays
        String name[] = new String[5];
        String grade[] = new String[5];
        double finalMarks[] = new double[5];
        int assignmentMarks[] = new int[5];
        int paperMarks[] = new int[5];
        
        //for the inputs of student information
        
        for (int i=0; i<5; i++)
        {
            System.out.print("Enter Name of Student "+(i+1)+": ");
            name[i]= input.nextLine();
            
            System.out.print("Enter Assignment Mark (out of 100) for "+name[i]+": ");
            assignmentMarks[i] = input.nextInt();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for "+name[i]+": ");
            paperMarks[i] = input.nextInt();
            
            finalMarks[i] = calcFinalMarks(assignmentMarks[i],paperMarks[i]);

            input.nextLine();
            
            grade[i] = findGrades(finalMarks[i]);
            
            System.out.println();
            
        }

        System.out.println();
        
        System.out.println("Name \t\t Final Marks \t\t Grade");
        
        for (int i=0; i<5; i++)
        {
            printDetails(name[i],finalMarks[i],grade[i]); 
        }
        
        input.close();  //to close Scanner object
    }
}