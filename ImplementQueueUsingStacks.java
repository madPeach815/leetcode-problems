import java.util.NoSuchElementException;
/*
Implement a first in first out(FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue.(push, peek, pop, and empty).
Note: You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and isEmpty operations are valid. Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque(double-ended queue) as long as you use only a stack's standard operations.
*/
class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;


    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    //Pshes element x to the back of the queue
    public void push(int x) {
        inStack.push(x);
    }
    
    //Removes the element from the front of the queue and returns it.
    public int pop() {
         peek();

        return outStack.pop();
    }
    
    //Returns the element at the front of the queue.
    public int peek() {
      moveToOutStack();

        if(outStack.empty()){
        throw new NoSuchElementException("Queue is empty");
        }
        return outStack.peek();
    }
    
    //Returns true if the queue is empty, false otherwise. 
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void moveToOutStack(){
  if(!inStack.isEmpty() && outStack.isEmpty()){
            while(!inStack.isEmpty()){
            outStack.push(inStack.pop());
            }
    }
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
