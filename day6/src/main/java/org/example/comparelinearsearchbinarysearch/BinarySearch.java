package org.example.comparelinearsearchbinarysearch;

class BinarySearch {

    // Method to find the targetIndex
    static int targetIndex(int[] arr, int target) {

        int start = 0;
        int end = arr.length-1;
        int mid;           // To separate array in left and right portions

        while(start <= end) {
            mid = start+(end-start)/2;    // Method to calculate the mid

            if(arr[mid] == target) {
                return mid;       // Return the index of the target
            } else if(arr[mid] > target) {
                end = mid-1;
            } else if(arr[mid] < target) {
                start = mid+1;
            }
        }
        return -1; // If target element is not found
    }
}
