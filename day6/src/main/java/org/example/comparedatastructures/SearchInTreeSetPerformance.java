package org.example.comparedatastructures;

import java.util.TreeSet;

class SearchInTreeSetPerformance {

    // Method to search in a treeset
    static boolean searchTreeSet(TreeSet<Integer> t, int target) {
        return t.contains(target);   // Returns true if it contains the target element
    }
}
