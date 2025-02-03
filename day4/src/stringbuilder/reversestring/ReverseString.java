package stringbuilder.reversestring;

import java.util.Scanner;

public class ReverseString {

    // Method to swap the characters of a string
    static void swapCharacters(StringBuilder sb, int idx) {

        // logic of swapping
        char temp = sb.charAt(idx);
        sb.setCharAt(idx, sb.charAt(sb.length()-idx-1));
        sb.setCharAt(sb.length()-idx-1, temp);
    }

    // Method to reverse a string
    static String reverseString(String word) {

        // String builder to store word to manipulate it
        StringBuilder sb = new StringBuilder(word);

        // Iterate the characters of word and swap first and last
        for(int i=0; i<sb.length()/2; i++) {
            swapCharacters(sb,i);
        }

        return sb.toString();   // Returns string builder as a string
    }


    public static void main(String[] args) {

        // Scanner object to take the input
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter the string that is needed to be reversed: ");
        String word = input.nextLine();

        // Call the function to reverse the string
        String reversedString = reverseString(word);

        // Output
        System.out.println("The reversed string is: "+reversedString);
    }
}
