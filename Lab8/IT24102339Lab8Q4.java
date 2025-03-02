import java.util.Scanner;
public class IT24102339Lab8Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] studentsArray = new int[8];  //array delcared and allocated
        int i,studentID,searchID;
        
        
        for ( i = 0; i < studentsArray.length; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");   //get the user input for student ID
            studentID = scanner.nextInt();
            
            if (studentID <= 0) {
                System.out.println("Error: Please Enter Only Positive Numbers");
                i--;           // to repeat input for student ID
            } else {
                studentsArray[i] = studentID;
            }
        }
        
        
        System.out.print("Enter a Student ID to search: ");   // Ask user to enter a search ID
        searchID = scanner.nextInt();
        
        boolean found = false;
        for (int id : studentsArray) {
            if (id == searchID) {
                found = true;
                break;
            }
        }
        
        
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        scanner.close();  //close the Scanner file
    }
}