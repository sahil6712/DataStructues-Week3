package hashmap.subarraywithzerosum;

import java.util.*;

public class Main {
    public static List<List<Integer>> findSubarraysWithZeroSum(int[] arr) {
        // To store the subarrays
        List<List<Integer>> result = new ArrayList<>();

        // HashMap to store the cumulative sum and its corresponding indices
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        int currentSum = 0;

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // If currentSum is zero, the subarray from the start to the current index has a zero sum
            if (currentSum == 0) {
                List<Integer> subarray = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    subarray.add(arr[j]);
                }
                result.add(subarray);
            }

            // If currentSum has been encountered before, we have found subarrays that sum to zero
            if (sumMap.containsKey(currentSum)) {
                // Get the previous indices where the same sum was encountered
                List<Integer> indices = sumMap.get(currentSum);
                for (int index : indices) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int j = index + 1; j <= i; j++) {
                        subarray.add(arr[j]);
                    }
                    result.add(subarray);
                }
            }

            // Store the current sum with its index
            sumMap.putIfAbsent(currentSum, new ArrayList<>());
            sumMap.get(currentSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, -2, 3, 4, -4, -3, 2};

        List<List<Integer>> subarrays = findSubarraysWithZeroSum(arr);

        System.out.println("Subarrays with zero sum:");
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
}