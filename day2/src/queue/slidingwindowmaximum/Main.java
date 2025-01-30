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

        Deque<Integer> dq = new ArrayDeque<>();

        int count = 0;
        for (int j : arr) {
            if (dq.size() == k) {
                dq.removeFirst();
            }
            if (dq.isEmpty() || dq.peekLast() > j) {
                dq.offer(j);
                count++;
                if(count >= k) {
                    ans[idx] = dq.peekFirst();
                    idx++;
                }

            } else {
                while (dq.peekLast() != null && j >= dq.peekLast()) {
                    dq.removeLast();
                }
                dq.offer(j);
                count++;
                if(count >= k) {
                    ans[idx] = dq.peekFirst();
                    idx++;
                }

            }
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
