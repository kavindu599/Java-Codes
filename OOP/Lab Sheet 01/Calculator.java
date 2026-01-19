public class Calculator {

    //Create add methode
    public static int add(int number1, int number2)
        {
            return number1 + number2;
        }

        //Create multiply methode
        public static int multiply(int number1, int number2)
        {
            return number1 * number2;
        }

        //Create square methode
        public static int square (int number1)
        {
            return number1 * number1;
        }

        //Crete main methode
        public static void main (String []args) {

            int question1, question2;


            //calculation
            question1 = square(add(multiply(3,4) ,multiply(5,7)));

            question2 = add(square(add(4,7)), square(add(8,3)));

            //output
            System.out.println("Question1: "+ question1);
            System.out.println("Question2: "+ question2);



        }

}
