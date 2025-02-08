package org.example.comparedatastructures;

import java.util.HashSet;

class SearchInHashSetPerformance {

    // Method to  search in arrays
    static boolean searchHashSet(HashSet<Integer> h, int target) {
        return h.contains(target);    // Return true if HashSet has target
    }
}
