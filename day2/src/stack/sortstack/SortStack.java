package stack.sortstack;

import java.util.Stack;

class SortStack {


    // Method to insert element at correct position in sorted stack
    private void insertElement(Stack<Integer> st, Integer temp) {
        if(st.isEmpty() || (st.peek() <= temp)) {
            st.push(temp);
            return;
        }
        Integer temp2 = st.pop();
        insertElement(st, temp);
        st.push(temp2);
    }

    // Method to sort an stack
    public void sortStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        Integer temp = st.pop();
        sortStack(st);
        insertElement(st, temp);
    }
}
