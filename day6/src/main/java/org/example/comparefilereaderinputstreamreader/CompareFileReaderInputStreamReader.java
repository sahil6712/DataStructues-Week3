package org.example.comparefilereaderinputstreamreader;

import java.io.IOException;

public class CompareFileReaderInputStreamReader {
    public static void main(String[] args) throws IOException {

        long startTime;
        long endTime;

        // Sample files path
        String filePath1 = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day6\\src\\main\\java\\org\\example\\comparefilereaderinputstreamreader\\file1";
        String filePath2 = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day6\\src\\main\\java\\org\\example\\comparefilereaderinputstreamreader\\file2.bin";
        String filePath3 = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day6\\src\\main\\java\\org\\example\\comparefilereaderinputstreamreader\\file3";

        // Compare for filePath1
        System.out.println("Reading text file of size 1mb: ");
        startTime = System.nanoTime();
        ReadUsingFileReader.readFile(filePath1);
        endTime= System.nanoTime();
        System.out.println("The runtime for reading file using FileReader is: "+(endTime-startTime));

        startTime = System.nanoTime();
        ReadUsingInputStreamReader.readFile(filePath1);
        endTime = System.nanoTime();
        System.out.println("The runtime for reading file using InputStreamReader is: "+(endTime-startTime)+"\n");

        // Compare for filePath2
        System.out.println("Reading binary file of 5mb");
        startTime = System.nanoTime();
        ReadUsingFileReader.readFile(filePath2);
        endTime= System.nanoTime();
        System.out.println("The runtime for reading file using FileReader is: "+(endTime-startTime));

        startTime = System.nanoTime();
        ReadUsingInputStreamReader.readFile(filePath2);
        endTime = System.nanoTime();
        System.out.println("The runtime for reading file using InputStreamReader is: "+(endTime-startTime)+"\n");

        // Compare for filePath3
        System.out.println("Reading text file of 15mb");
        startTime = System.nanoTime();
        ReadUsingFileReader.readFile(filePath3);
        endTime= System.nanoTime();
        System.out.println("The runtime for reading file using FileReader is: "+(endTime-startTime));

        startTime = System.nanoTime();
        ReadUsingInputStreamReader.readFile(filePath3);
        endTime = System.nanoTime();
        System.out.println("The runtime for reading file using InputStreamReader is: "+(endTime-startTime)+"\n");
    }
}
