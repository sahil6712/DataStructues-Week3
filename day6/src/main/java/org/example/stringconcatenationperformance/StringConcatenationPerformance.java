package org.example.stringconcatenationperformance;

public class StringConcatenationPerformance {

    // Method to concatenate using String
    static void concatenateUsingString(int numberOfConcatenation) {
        // Initial String
        String str = "";

        // Number of times to concatenate
        for(int i=0; i<numberOfConcatenation; i++) {
            str = str.concat("Hello");                // Changing the reference of str each time
        }
    }

    // Method to concatenate using StringBuilder
    static void concatenateUsingStringBuilder(int numberOfConcatenation) {

        // Initial StringBuilder
        StringBuilder sb = new StringBuilder();

        // Looping to concatenate
        for(int i=0; i<numberOfConcatenation; i++) {
            sb.append("Hello");                      // Adding at the last of string builder
        }

    }

    // Method to concatenate using StringBuffer
    static void concatenateUsingStringBuffer(int numberOfConcatenation) {

        // Initial StringBuffer
        StringBuffer sb = new StringBuffer();

        // Looping to concatenate
        for(int i=0; i<numberOfConcatenation; i++) {
            sb.append("Hello");
        }
    }


    public static void main(String[] args) {

        // variable used to find the runtime by storing start and end time of the process
        long startTime;
        long endTime;

        // Variables to store the number of times to concatenate
        int numberOfConcatenation1 = 10_00;
        int numberOfConcatenation2 = 10_00_0;
        int numberOfConcatenation3 = 10_00_00_0;

        // Compare String, StringBuilder, and StringBuffer for different number of concatenation

        System.out.println("Comparing for number of Concatenation "+numberOfConcatenation1);

        startTime = System.nanoTime();
        concatenateUsingString(numberOfConcatenation1);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using String is: "+(endTime-startTime));

        startTime = System.nanoTime();
        concatenateUsingStringBuilder(numberOfConcatenation1);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuilder is: "+(endTime-startTime));

        startTime = System.nanoTime();
        concatenateUsingStringBuffer(numberOfConcatenation1);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuffer is: "+(endTime-startTime)+"\n");

        System.out.println("Comparing for number of Concatenation "+numberOfConcatenation2);

        // Compare for numberOfConcatenation2
        startTime = System.nanoTime();
        concatenateUsingString(numberOfConcatenation2);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using String is: "+(endTime-startTime));

        startTime = System.nanoTime();
        concatenateUsingStringBuilder(numberOfConcatenation2);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuilder is: "+(endTime-startTime));

        startTime = System.nanoTime();
        concatenateUsingStringBuffer(numberOfConcatenation2);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuffer is: "+(endTime-startTime)+"\n");

        System.out.println("Comparing for number of Concatenation "+numberOfConcatenation3);

        // Compare for numberOfConcatenation3
        //startTime = System.nanoTime();
        //concatenateUsingString(numberOfConcatenation3);
        //endTime = System.nanoTime();
        System.out.println("Concatenation using string is not possible for this large number of concatenation");

        startTime = System.nanoTime();
        concatenateUsingStringBuilder(numberOfConcatenation3);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuilder is: "+(endTime-startTime));

        startTime = System.nanoTime();
        concatenateUsingStringBuffer(numberOfConcatenation3);
        endTime = System.nanoTime();
        System.out.println("Runtime for concatenation using StringBuffer is: "+(endTime-startTime)+"\n");
    }
}
