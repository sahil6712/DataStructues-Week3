package stack.implementqueueusingstack;

public class Main {
    public static void main(String args[]) {

        // Create object of the ImplementQueue
        ImplementQueue queue = new ImplementQueue();

        // Add elements to the queue
        queue.setEnqueueStack(1);
        queue.setEnqueueStack(2);
        queue.setEnqueueStack(3);
        queue.setEnqueueStack(4);
        queue.setEnqueueStack(5);
        queue.setEnqueueStack(6);

        // Delete elements from queue
        queue.setDequeStack();
        queue.setDequeStack();
        queue.setDequeStack();
        queue.setDequeStack();
        queue.setDequeStack();
        queue.setDequeStack();
        queue.setDequeStack();

    }
}
