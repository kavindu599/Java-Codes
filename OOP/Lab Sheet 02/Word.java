import java.util.Scanner;

public class Word {
    public static void main (String []args) {

        Scanner input  = new Scanner (System.in);

        //Create an Array to store five words
        String words[] = new String [5];

        //Accept 5 words from the user and store them in the array
        for (int i=0; i<words.length; i++)
        {
            System.out.print("Enter a word: ");
            words[i] = input.next();
        }

        //to find and display the longest word in the array
        String longest_word = " ";
        for (String len_word : words)
        {
            if (len_word.length() > longest_word.length()) {
                longest_word = len_word;
            }
        }
        System.out.println("Longest word is: "+longest_word);

        //Calculate and display the total number of characters in the array
        int total_characters = 0;
        for (String char_words : words )
        {
            total_characters += char_words.length();
        }
        System.out.println("Total number of characters in all words: "+ total_characters);

        //Find and display the words with an even number of characters
        System.out.println("Words with an even number of characters: ");
        for (String even_words : words)
        {
            if (even_words.length() % 2 == 0)
            {
                System.out.println(even_words);
            }
        }

        input.close();



    }
}
