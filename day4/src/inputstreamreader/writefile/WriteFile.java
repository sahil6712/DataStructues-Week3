package inputstreamreader.writefile;

import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the string to write in a file: ");
        String str = input.nextLine();

        // File object
        File file = new File("src/inputstreamreader/writefile/textfile.txt");

        try (
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)
        ) {
            pw.println(str); // Write to file
            System.out.println("Successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Close Scanner
        input.close();
    }
}
