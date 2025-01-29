package stack.sortstack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Create the stack
        Stack<Integer> st = new Stack<>();

        // Instance of the SortStack
        SortStack sortStacks = new SortStack();

        // Inserting elements in the stack
        st.push(32);
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(43);
        st.push(10);
        st.push(10);

        // Method to sort a stack
        sortStacks.sortStack(st);

        //Display elements of stack
        System.out.println("Elements in sorted order are: ");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
