package org.example.fibonacirecursiveiterative;

public class CompareFibonaci {
    public static void main(String[] args) {

        // for getting the runtime
        long startTime;
        long endTime;

        // Compare   fibonaci for number 10

        // Iteration
        startTime = System.nanoTime();
        IterativeFibonaci.findFiboncaiNumber(10);
        endTime = System.nanoTime();
        System.out.println("The runtime of fibonaci by iterative method is: "+(endTime-startTime));

        // Recursive
        startTime = System.nanoTime();
        RecursiveFibonaci.findFibonaciNumber(10);
        endTime = System.nanoTime();
        System.out.println("The runtime of fibonaci by Recursive method is: "+(endTime-startTime)+"\n");

        // Compare   fibonaci for number 30

        // Iteration
        startTime = System.nanoTime();
        IterativeFibonaci.findFiboncaiNumber(30);
        endTime = System.nanoTime();
        System.out.println("The runtime of fibonaci by iterative method is: "+(endTime-startTime));

        // Recursive
        startTime = System.nanoTime();
        RecursiveFibonaci.findFibonaciNumber(30);
        endTime = System.nanoTime();
        System.out.println("The runtime of fibonaci by Recursive method is: "+(endTime-startTime)+"\n");

        // Compare   fibonaci for number 50

        // Iteration
        startTime = System.nanoTime();
        IterativeFibonaci.findFiboncaiNumber(50);
        endTime = System.nanoTime();
        System.out.println("The runtime of fibonaci by iterative method is: "+(endTime-startTime));

        // Recursive
        System.out.println("The runtime of fibonaci for 50th term using recursion is not feasible:");
    }
}
