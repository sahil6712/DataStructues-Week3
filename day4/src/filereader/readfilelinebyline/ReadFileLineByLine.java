package filereader.readfilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {

        // Path of a file that is to be read line by l
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day4\\src\\filereader\\readfilelinebyline\\textfile";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
