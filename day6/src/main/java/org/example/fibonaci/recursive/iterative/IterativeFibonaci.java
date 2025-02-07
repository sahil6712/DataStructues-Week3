package org.example.fibonaci.recursive.iterative;

class IterativeFibonaci {

    // Method to get the fibonaci
    static int findFiboncaiNumber(int n) {
        int a = 0, b = 1;
        int sum = 0;
        for(int i=2; i<=n; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
