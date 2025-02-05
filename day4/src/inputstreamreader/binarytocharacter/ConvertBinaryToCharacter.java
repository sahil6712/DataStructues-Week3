package inputstreamreader.binarytocharacter;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class ConvertBinaryToCharacter {

    // Method to convert the binary to character
    public static void main(String[] args) {

        // File path
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day4\\src\\inputstreamreader\\binarytocharacter\\binary";

        try{
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8);
            int character;
            while((character = reader.read()) != -1) {
                System.out.println("The character is: "+(char) character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
