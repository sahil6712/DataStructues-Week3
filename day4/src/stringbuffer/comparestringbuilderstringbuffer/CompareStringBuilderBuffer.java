package stringbuffer.comparestringbuilderstringbuffer;

public class CompareStringBuilderBuffer {

    // Method to get the execution time of StringBuffer
    static long executionTimeStringBuffer() {

        StringBuffer sb = new StringBuffer();

        // to get the time when sb starts concatenating
        long startTime = System.nanoTime();
        for(int i=0; i<1000000; i++) {
            sb.append("Hello");
        }

        // End time of operation on StringBuffer
        long endTime = System.nanoTime();

        return endTime-startTime; // Returns the execution time
    }

    // Method to get the execution time of StringBuilder
    static long executionTimeStringBuilder() {

        StringBuilder sb = new StringBuilder();

        // Start time of operation on StringBuilder
        long startTime = System.nanoTime();

        for(int i=0; i<1000000; i++) {
            sb.append("Hello");
        }

        // End time of operations on StringBuilder
        long endTime = System.nanoTime();

        return endTime-startTime; // Returns the execution time
    }


    public static void main(String[] args) {

        // Call the method to get the execution time of operation on StringBuilder
        long executionTimeStringBuilder = executionTimeStringBuilder();

        // Call the method to get the execution time of operation on StringBuffer
        long executionTimeStringBuffer = executionTimeStringBuffer();

        // Output
        System.out.println("The execution time of operation on string buffer is: "+executionTimeStringBuffer);
        System.out.println("The execution time of operation on string builder is: "+executionTimeStringBuilder);
    }
}
