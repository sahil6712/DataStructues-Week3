package stack.stockspan;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Method to get the stock span
   static public int[] getStockSpan(int[] arr) {

        // Array to store the stock span
        int[] ans = new int[arr.length];

        Stack<int[]> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(st.isEmpty()) {
                st.push(new int[]{arr[i], 1});
                ans[i] = 1;
            }
            else{
                if(st.peek()[0] > arr[i]) {
                    st.push(new int[]{arr[i],1});
                    ans[i] = 1;
                }
                else{
                    int count = 1;
                    while(st.peek()[0] <= arr[i]) {
                        count += st.peek()[1];
                        st.pop();
                    }
                    st.push(new int[]{arr[i],count});
                    ans[i] = count;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {

        // get the object to take input
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter Stock Span array
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();

        // Declare an array
        int[] stocksPricePerDay = new int[size];

        for(int i=0; i<size; i++) {
            stocksPricePerDay[i] = input.nextInt();
        }

        // Get the array which stores stock span for each day
        int[] ans = getStockSpan(stocksPricePerDay);

        for (int an : ans) {
            System.out.println(an);
        }

        input.close();
    }
}
