package challengeproblem.searching;

public class Main {
    public static void main(String[] args) {
        // Array declaration
        int[] arr = {21,21 ,22 ,11 ,39};
        System.out.println("First missing positive element is: " + LinearBinarySearch.firstMissingPositiveNumber(arr));

        int start = 0, end = arr.length - 1, target = 33;
        System.out.println("Result of searching for given target is: " + LinearBinarySearch.binarySearch(arr, start, end, target));
    }

}
