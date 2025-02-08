package org.example.comparefilereaderinputstreamreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadUsingFileReader {

    // Method to read file
    static void readFile(String filePath) {

        try {
            FileReader fr = new FileReader(filePath);
            int c;
            while((c = fr.read()) != -1) {
              //  System.out.println((char)c);
            }
        } catch (IOException e) {
            System.out.println("Exception Occured");
            throw new RuntimeException(e);
        }
    }
}
