package queue.slidingwindowmaximum;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {


    // Method to get all the maximums of windows from array
    public static int[] maximumOfWindows(int[] arr, int numberOfMax, int k) {

        // To store the answer
        int[] ans = new int[numberOfMax];
        int idx = 0;

        // Doubly ended queue
        Deque<int[]> dq = new ArrayDeque<>();

        int count = 0;
        int i = 0; // for tracking on which currently the iterations is
        for (int j : arr) { // iterate the array
            if ((!dq.isEmpty()) && i-dq.peekFirst()[1] == k) {  // if deque is full then remove 1 element
                dq.removeFirst();
            } // Check to insert in dequeue
            if (dq.isEmpty() || dq.peekLast()[0] > j) {
                dq.offer(new int[]{j,i});
                count++;
                if(count >= k && (!dq.isEmpty())) {
                    ans[idx] = dq.peekFirst()[0];
                    idx++;
                }

            } else {
                // check for removing elements from the dequeue
                while (dq.peekLast() != null && j >= dq.peekLast()[0]) {
                    dq.removeLast();
                }
                dq.offer(new int[]{j, i});
                count++;
                if(count >= k && (!dq.isEmpty())) {
                    ans[idx] = dq.peekFirst()[0];
                    idx++;
                }

            }
            i++;
        }


        return ans;
    }

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner input = new Scanner(System.in);

        // input size of array
        System.out.println("Enter the size of array");
        int n = input.nextInt();

        System.out.println("Enter the size of window: ");
        int k = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
        }


        // total number of maximum elements in window of k size in
        int numberOfMax = n-k+1;

        int[] ans = Main.maximumOfWindows(arr, numberOfMax, k);

        for (int an : ans) {
            System.out.println(an);
        }
    }
}
