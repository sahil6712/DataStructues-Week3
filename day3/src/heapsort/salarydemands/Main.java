package heapsort.salarydemands;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // example salary expected
        int[] salaryDemands = {8100, 8900, 900, 1100, 1400, 7600, 5400, 2200};

        // printing the unsorted array
        System.out.println(Arrays.toString(salaryDemands));

        // sorting the salary demands
        SortJobApplicationBySalary.maxHeap(salaryDemands);

        // printing the update salary demands array
        System.out.println(Arrays.toString(salaryDemands));
    }

}