package org.example.comparesortingalgorithm;

public class CompareSortingAlgorithms {
    public static void main(String[] args) {

        // For storing the execution time
        long startTime;
        long endTime;

        // Declare sample arrays to store datasets
        int[] sample1 = new int[1000];
        int[] sample2 = new int[100_00];
        int[] sample3 = new int[100_00_00];

        // Get the data set for all arrays
        for(int i=0; i<100_00_00; i++) {
            if(i < sample1.length) {
                sample1[i] = i%100;          // For making data unsorted
            }
            if(i < sample2.length) {
                sample2[i] = i%1000;        // For making data unsorted
            }
            sample3[i] = i%1000;             // For making data  unsorted
        }

        // Compare Algorithms
        System.out.println("Compare sorting algorithms: ");

        // Compare for sample 1
        System.out.println("Comparing for sample1: ");

        // Bubble Sort Execution time calculation
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(sample1);
        endTime = System.nanoTime();
        System.out.println("Execution time of bubble sort for sample1 is: "+(endTime-startTime));

        // Quick Sort Execution time calculation
        startTime = System.nanoTime();
        QuickSort.quickSort(sample1, 0, 999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Quick sort for sample1 is: "+(endTime-startTime));

        // Merge Sort Execution time calculation
        startTime = System.nanoTime();
        MergeSort.mergeSort(sample1,0,999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Merge sort for sample1 is: "+(endTime-startTime)+"\n");

        // Compare for sample2
        System.out.println("Comparing for sample2: ");

        // Bubble Sort Execution time calculation
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(sample2);
        endTime = System.nanoTime();
        System.out.println("Execution time of bubble sort for sample2 is: "+(endTime-startTime));

        // Quick Sort Execution time calculation
        startTime = System.nanoTime();
        QuickSort.quickSort(sample2, 0, 999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Quick sort for sample2 is: "+(endTime-startTime));

        // Merge Sort Execution time calculation
        startTime = System.nanoTime();
        MergeSort.mergeSort(sample2,0,999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Merge sort for sample2 is: "+(endTime-startTime)+"\n");

        // Compare for sample 3
        System.out.println("Comparing for sample3: ");

        // Bubble Sort Execution time calculation
        startTime = System.nanoTime();
        // BubbleSort.bubbleSort(sample3);
        endTime = System.nanoTime();
        System.out.println("Bubble sort for sample size "+sample3.length+" is not feasible needs approximately an hour to complete");

        // Quick Sort Execution time calculation
        startTime = System.nanoTime();
        QuickSort.quickSort(sample3, 0, 999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Quick sort for sample3 is: "+(endTime-startTime));

        // Merge Sort Execution time calculation
        startTime = System.nanoTime();
        MergeSort.mergeSort(sample3,0,999);
        endTime = System.nanoTime();
        System.out.println("Execution time of Merge sort for sample3 is: "+(endTime-startTime)+"\n");
    }
}
