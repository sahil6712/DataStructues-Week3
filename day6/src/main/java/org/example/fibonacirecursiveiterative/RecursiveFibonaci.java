package org.example.fibonacirecursiveiterative;

class RecursiveFibonaci {

    // Method to find the fibonaci number at a given position
    static int findFibonaciNumber(int n) {
        if(n<=1) {
            return n;
        }
        return findFibonaciNumber(n-1)+findFibonaciNumber(n-2);
    }
}
