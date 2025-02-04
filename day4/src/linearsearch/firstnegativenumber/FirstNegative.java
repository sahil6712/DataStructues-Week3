package linearsearch.firstnegativenumber;

import java.util.Scanner;

public class FirstNegative {

    // Method to linear Search
    static int findFirstNegative(int[] arr) {

        // iterate the array
        for(int i=0; i<arr.length; i++) {
            if(arr[i] < 0) {
                return i;
            }
        }

        return -1;     // If there is no negative number in the array returns -1
    }

    public static void main(String[] args) {

        // Scanner object to take the input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();

        //declare the array
        int[] arr = new int[size];

        // Prompt the user to enter the elements the array
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // call the method to get the first negative element
        int negativeIdx = findFirstNegative(arr);

        // Output
        if(negativeIdx >= 0) {
            System.out.println("The first negative elements in the array is: "+arr[negativeIdx]);
        }else {
            System.out.println("There is no negative element in the array");
        }

    }
}
