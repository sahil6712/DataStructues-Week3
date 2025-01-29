package stack.implementqueueusingstack;

import java.util.Stack;

class ImplementQueue {
    private Stack<Integer> enqueStack;
    private Stack<Integer> dequeStack;

    // Constructor
    ImplementQueue() {
        this.enqueStack = new Stack<>();
        this.dequeStack = new Stack<>();
    }

    // Method to enqueue operation
    public void setEnqueueStack(int x) {

        // Added element
        enqueStack.push(x);
        System.out.println("Element added: "+x);
    }

    // Method to dequeue
    public void setDequeStack() {
        if(dequeStack.isEmpty()) {
            while(!enqueStack.isEmpty()) {
                dequeStack.push(enqueStack.pop());
            }
        }
        if(dequeStack.isEmpty()) {
            System.out.println("Queue is empty: ");
        }
        else {
            System.out.println("Element poped is: "+dequeStack.pop());
        }
    }

}
