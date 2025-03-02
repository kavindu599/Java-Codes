public class IT24102339Lab9Q3 {
    
    public static int add(int a, int b)  //add method
    {
        return a + b;
    }
    
    public static int multiply(int a ,int b)  //multiply method
    {
        return a*b;
    }
    
    public static int square(int a)   //square method
    {
        return a*a;
    }
    
    public static void main (String[]args)   //main method
    {
        //for first expression
        
        int multi1 = multiply(3,4);
        int multi2 = multiply(5,7);
        int sum1   = add(multi1,multi2);
        int square1= square(sum1);
        
        //for second expression
        
        int sum2 = add(4,7);
        int sum3 = add(8,3);
        int square2 = square(sum2);
        int square3 = square(sum3);
        int sum4 = add(square2,square3);
        
        System.out.println("Result of (3*4+5*7)^2        : "+square1);
        System.out.print("Result of (4+7)^2+(8+3)^2    : "+sum4);         //print outputs
    }
}