package org.example.comparelinearsearchbinarysearch;

class LinearSearch {

    // Method to linear Search
    static int targetIndex(int[] arr, int target) {

        // Iterate from first to last to find the target index
        for(int i=0; i<arr.length; i++) {
            if(target == arr[i]) {
                return i;       // Return the index
            }
        }
        return -1;          // If target is not found then return -1
    }
}
