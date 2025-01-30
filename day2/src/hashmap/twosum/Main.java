package hashmap.twosum;


public class Main {
    public static void main(String[] args) {
        //Problem: Given an array and a target sum, find two indices such that their values add up to the target.
        // example array
        int size = 10;
        int []nums = {1, 2, 3, 5, 8, 4, 1, 9, 6, 0};
        // getting the two index from functon
        int [] ans = FindTwoSum.findTwoIndex(nums, size, 3);
        System.out.println(ans[0] +" "+ ans[1]);
    }
}
