public class IT24102339Lab7Q2B {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++)  //Expression for th loop
               {  
                    System.out.print(i + "-");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
           
            System.out.println();  //to print the new line
        }
    }
}