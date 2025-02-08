package org.example.comparedatastructures;

class SearchInArrayPerformance {

    // Method to search in an array
    static boolean searchArray(int[] array, int target) {

        // Iterate linearly
        for (int j : array) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }
}
