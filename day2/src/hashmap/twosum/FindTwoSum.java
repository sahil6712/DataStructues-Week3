package hashmap.twosum;

import java.util.HashMap;

class FindTwoSum {
    public static int[] findTwoIndex(int []nums, int n, int target) {
        HashMap<Integer , Integer> prev = new HashMap<>();

        // looping through array
        for (int i = 0; i < n; i++) {
            // checking if the other number is in hashmap or not
            if (prev.getOrDefault(target - nums[i], 0) != 0) {

                return new int[] {prev.get(target - nums[i]), i+1};
            }
            // pushing the ith val in hashmap
            prev.put(nums[i], i+1);

        }
        return new int[] {-1, -1};
    }
}
