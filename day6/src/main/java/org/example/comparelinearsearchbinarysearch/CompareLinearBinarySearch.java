package org.example.comparelinearsearchbinarysearch;

public class CompareLinearBinarySearch {
    public static void main(String[] args) {

        long startTime;
        long endTime;
        // Arrays to store sample data to compare binary and linear search
        int[] sample1 = new int[10_00];
        int[] sample2 = new int[100_00];
        int[] sample3 = new int[10_00_00];

        // Assigning the data to the arrays
        for(int i=0; i<100000; i++) {
            if(i < sample1.length) {
                sample1[i] = i;
            }
            if(i < sample2.length) {
                sample2[i] = i;
            }
            sample3[i] = i;
        }

        // Compare for sample 1
        System.out.println("Compare linear Search and Binary Search");

        // Linear Search
        startTime = System.nanoTime();
        LinearSearch.targetIndex(sample1,500);
        endTime = System.nanoTime();
        System.out.println("Total time taken by linear Search for sample1 is: "+(endTime-startTime));

        // Binary Search
        startTime = System.nanoTime();
        BinarySearch.targetIndex(sample1,500);
        endTime = System.nanoTime();
        System.out.println("Total time taken by Binary Search for sample1 is: "+(endTime-startTime)+"\n");

        // Compare for sample2

        // Linear Search
        startTime = System.nanoTime();
        LinearSearch.targetIndex(sample2,5000);
        endTime = System.nanoTime();
        System.out.println("Total time taken by linear Search for sample2 is: "+(endTime-startTime));

        // Binary Search
        startTime = System.nanoTime();
        BinarySearch.targetIndex(sample2,5000);
        endTime = System.nanoTime();
        System.out.println("Total time taken by Binary Search for sample2 is: "+(endTime-startTime)+"\n");

        // Compare for sample3
        // Linear Search
        startTime = System.nanoTime();
        LinearSearch.targetIndex(sample3,50000);
        endTime = System.nanoTime();
        System.out.println("Total time taken by linear Search for sample3 is: "+(endTime-startTime));

        // Binary Search
        startTime = System.nanoTime();
        BinarySearch.targetIndex(sample3,5000);
        endTime = System.nanoTime();
        System.out.println("Total time taken by Binary Search for sample3 is: "+(endTime-startTime)+"\n");
    }
}
