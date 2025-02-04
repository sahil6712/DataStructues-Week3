package stringbuilder.removeduplicate;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicate {

    // Method to remove the duplicate
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> characterSet = new HashSet<>();

        for(int i=0; i<str.length(); i++) {

            if(!characterSet.contains(str.charAt(i))) {
                characterSet.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();   // Returns string where this function is called
    }


    public static void main(String[] args) {

        // Scanner object to take the input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter the string: ");
        String str = input.nextLine();

        // Call the method to remove the duplicates from a string
        String strSet = removeDuplicates(str);

        // Output
        System.out.println("String after removing the duplicates: "+strSet);
    }
}
