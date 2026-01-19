import java.util.Scanner;
public class IT241022285Lab8Q1A{  
              public static void main(String [] args){   

                      Scanner input = new Scanner(System.in);

                      int i ;
                      int myArray[] = new int[5];
 
                      System.out.print("Enater numbers");

                      for(i=0;i<myArray.length;i++){
                                  System.out.print("Enter Number"+(1+i)+":");
                                  myArray[i]   =  input.nextInt();
                      }
                      System.out.print("Array in Reverse Order:");
                      for(i=myArray.length-1;i>=0;i--){
                                 System.out.print(myArray[i]+" ");
                     }
         }
}
                               
                      
    


