package queue.circulartourproblem;

import java.util.Scanner;

public class Main {

    // Method to find the correct start point to complete the circular path
    public static int getCorrectStartPoint(int[] petrol, int[] distance) {
        int startIdx = 0;
        int currentFuel = 0;
        for(int i=0; i<petrol.length; i++) {
            currentFuel += petrol[i];
            if(currentFuel >= distance[i]) {
                currentFuel -= distance[i];
            }
            else {
                startIdx = i+1;
                currentFuel = 0;

            }
        }

        // If start index is not the 0th index then it will check till startIdx
        for(int i = 0; i < startIdx; i++) {
            currentFuel += petrol[i];
            if(currentFuel >= distance[i]) {
                currentFuel -= distance[i];
            }
            else if(startIdx == petrol.length) {
                return -1;
            }
            else {
                return -1;

            }
        }


        return startIdx;
    }

    public static void main(String[] args) {

        // Scanner object
        Scanner input = new Scanner(System.in);

        // Input number of petrol pumps
        System.out.println("Enter number of petrol pumps: ");
        int n = input.nextInt();

        // Array to store the petrol available at each fuel station
        int[] petrol = new int[n];

        // Array to store the distance between fuel stations
        int[] distance =  new int[n];

        // Input fuel at each fuel station
        System.out.println("Enter fuel in each fuel: ");
        for(int i=0; i<n ;i++) {
            petrol[i] = input.nextInt();
        }

        // Input distance between  fuel station
        System.out.println("Enter distance between fuel station: ");
        for(int i=0; i<n ;i++) {
            distance[i] = input.nextInt();
        }

        // Call method to get the start index
        int startIdx = Main.getCorrectStartPoint(petrol, distance);

        // Output
        System.out.println("Start index is: "+startIdx);
    }
}
