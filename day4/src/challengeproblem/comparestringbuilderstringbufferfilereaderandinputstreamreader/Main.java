package challengeproblem.comparestringbuilderstringbufferfilereaderandinputstreamreader;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // example text file
        String filePath = "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java-Basics\\week3\\day4\\src\\challengeproblem\\comparestringbuilderstringbufferfilereaderandinputstreamreader\\textfile.txt";

        // Measure time for FileReader
        long startTime = System.nanoTime();
        int wordCountFileReader = compareFileReaderInputStreamReader.countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("Word count using FileReader: " + wordCountFileReader);
        System.out.println("Time taken using FileReader: " + (endTime - startTime) + " ms");

        // Measure time for InputStreamReader
        startTime = System.nanoTime();
        int wordCountInputStreamReader = compareFileReaderInputStreamReader.countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("Word count using InputStreamReader: " + wordCountInputStreamReader);
        System.out.println("Time taken using InputStreamReader: " + (endTime - startTime) + " ms");

        // Measuring time for String Builder by appending hello multiple times
        CompareStringBuilderStringBuffer.appendWordsUsingStringBuilder("hello");

        // Measuring time for String buffer by appending hello multiple times
        CompareStringBuilderStringBuffer.appendWordsUsingStringBuffer("hello");

    }
}


