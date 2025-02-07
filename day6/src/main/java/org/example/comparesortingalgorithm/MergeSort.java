package org.example.comparesortingalgorithm;

class MergeSort {

    // method to merge array into sorted form
    public static void merge(int[] arr, int mid, int start, int end) {

        int[] ans = new int[end-start+1];  // To store the sorted elements
        int j = start, k=mid+1;

        for(int i=0; i<ans.length;) {
            while(j<=mid && k<=end) {
                if(arr[j] > arr[k]) {
                    ans[i] = arr[k];
                    k++;
                    i++;
                }
                else{
                    ans[i] = arr[j];
                    j++;
                    i++;
                }
            }
            while(j<=mid) {
                ans[i] = arr[j];
                j++;
                i++;
            }
            while(k<=end) {
                ans[i] = arr[k];
                k++;
                i++;
            }
        }

        // ans has sorted elements
        int idx = 0;
        for(int i=start; i<=end; i++) {
            arr[i] = ans[idx];
            idx++;
        }
    }

    // Sorting using divide and conquer algorithm
    public static void mergeSort(int[] arr, int start, int end) {
        // if there is only one or no element then end the function.
        if(start >= end) {
            return;
        }

        // To find the mid
        int mid = start + (end-start)/2;

        // Recursive calls
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        // Merge left and right arrays in sorted order
        merge(arr,mid, start, end);

    }

}