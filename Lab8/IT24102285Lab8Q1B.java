import java.util.Scanner;
public class IT24102285Lab8Q1B {
          public static void main(String args[]) {
                    Scanner input = new Scanner(System.in);

                    int i;
                    int myArray[] = new int[5];
                    int evenArray[] = new int[5];
                    int evenNum;

                    System.out.println("Enter numbers:");
        
                    for(i=0 ; i<myArray.length; i++){
                                  System.out.print("Enter number"+(i+1)+":");
                                  myArray[i] = input.nextInt();
                    }
                    System.out.println("myArray content:");
                    for(i=0; i<myArray.length;i++){
                                 System.out.print(myArray[i]+" ");
                    }
                    System.out.println("\nevenArray contents:");
                    for (i=0;i<evenArray.length;i++){
                                  evenNum = myArray[i]%2;
                                  if(evenNum==0){
                                             evenArray[i] = myArray[i];
                                  }
                                  else {
                                               evenArray[i]=0;
                                 }
                                 System.out.print(evenArray[i]+" ");
                   }
          }
}
                    
                    

         

 
        
