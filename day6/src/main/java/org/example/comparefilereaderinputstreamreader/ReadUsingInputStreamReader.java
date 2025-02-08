package org.example.comparefilereaderinputstreamreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadUsingInputStreamReader {

    // Method to read from a file using input stream reader
    static void readFile(String filePath) throws IOException {

        try{

            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader reader = new InputStreamReader(fis);

            int c;

            while((c = reader.read()) != -1) {
              //  System.out.println((char) c);
            }

            reader.close();
            fis.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
