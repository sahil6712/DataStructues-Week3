package linearsearch.specificword;

import java.util.Scanner;

public class SpecificWord {

    // Method to find the specific word
    static String sentenceWithWord(String[] sentences, String targetWord) {

        // iterating the array of sentences
        for (String sentence : sentences) {
            String regex = "[\\s+.,]";

            //
            String[] words = sentence.split(regex);

            for (String word : words) {
                if (word.equals(targetWord)) {
                    return sentence;
                }
            }
        }


        return "Not Found";
    }


    public static void main(String[] args) {

        // Scanner object to take the input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of array of sentences
        System.out.println("Enter the number of sentences you wanted to store in the array");
        int numberOfSentences = input.nextInt();
        input.nextLine();   // Consume the left line after nextInt

        // Declare the array of sentences
        String[] sentences = new String[numberOfSentences];

        for(int i=0; i<sentences.length; i++) {
            System.out.println("Enter the sentence and press enter");
            sentences[i] = input.nextLine();
        }

        // Prompt the user to enter the target word
        System.out.println("Enter the word that we need to search");
        String word = input.next();

        // Call method to get the word
        System.out.println("The word is present in sentence: "+sentenceWithWord(sentences, word));
    }
}
