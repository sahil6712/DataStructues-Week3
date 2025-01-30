package hashmap.pairwithgivensum;

import java.util.HashMap;

class FindGivenSumInArray {
    // boolean functon to check if pair exist
    public static boolean findTwoPair(int []nums, int n, int target) {
        HashMap<Integer , Integer> prev = new HashMap<>();

        // looping through array
        for (int i = 0; i < n; i++) {
            // checking if the other number is in hashmap or not
            if (prev.getOrDefault(target - nums[i], 0) != 0) {
                return true;
            }
            // pushing the ith val in hashmap
            prev.put(nums[i], i+1);
        }
        return false;
    }
}
 public class Main {
    public static void main(String[] args) {
        int size = 10;
        int[] nums = {1, 2, 3, 5, 8, 4, 1, 9, 6, 0};
        // getting the two index from function
        boolean ans = FindGivenSumInArray.findTwoPair(nums, size, 7);
        if (ans) {
            System.out.println("Pair found");
        }
        else {
            System.out.println("Pair not found");
        }
    }
}

