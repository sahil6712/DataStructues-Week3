package filereader.occurrenceofwordinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OccurrenceOfWord {
    public static void main(String[] args) throws RuntimeException {

        // word that is to be searched in a file
        String word = "Dream";

        // to store the frequency of the given word
        int count =0;

       // Absolute address where text file is present
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day4\\src\\filereader\\occurrenceofwordinfile\\textfile";

        try {
            // Using file reader to read the file
            FileReader reader = new FileReader(filePath);

            BufferedReader br = new BufferedReader(reader);

            String line;

            // Iterate for each line in the file
            while((line = br.readLine()) != null) {

                // Regular expression to split the line into words
                String regex = "[\\s,!.?]+";

                // words array store all the words of a line
                String[] words = line.split(regex);

                // iterate the words array and increase count if target word matches
                for(String str:words) {
                    if(str.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }

            // Output
            System.out.println("The frequency of word "+word+" is: "+count);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
