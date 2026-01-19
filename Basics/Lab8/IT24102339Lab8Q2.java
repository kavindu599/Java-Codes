public class IT24102339Lab8Q2 {
     public static void main(String args[]) {
      
         int A[] = {10,20,30,40,50};
         int B[] = {34,67,12,89,12};  // declared and allocated arrays
         int C[] = new int[5];
         int i;            // declared variables
             
         
         for (i=0;i<C.length;i++){
             C[i] = A[i]+B[i];
         }
         System.out.println("A Array Contents:");
         for(i=0;i<5;i++) {
            System.out.print(A[i]+" ");   //to print A array contents
         }
         System.out.println();

         System.out.println("B Array Contents:");
         for(i=0;i<5;i++) {
            System.out.print(B[i]+" ");  //to print B array contents
         }
         System.out.println();

         System.out.println("C Array Contents (A + B) :");
         for(i=0;i<5;i++) {
            System.out.print(C[i]+" ");   //to print C array contents
         }

     }
}