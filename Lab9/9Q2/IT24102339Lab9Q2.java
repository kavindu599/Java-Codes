import java.util.Scanner;

public class IT24102339 {
    public static void main(String[]args) {
        
        //Creates a Scanner object
        Scanner input = new Scanner (System.in);  
        double radius;
        
        //request to enter radius 
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();
        
        //calling the methode
        double area = circleArea(radius);
        
        //Output of the area
        System.out.println("The area of the circle with radius "+radius+" is: "+ area);
        
    
    }
    
    
    //methode cration
    public static double circleArea (double radius)
    {
        //calculation for the area
        return Math.PI*radius*radius;
    }
}