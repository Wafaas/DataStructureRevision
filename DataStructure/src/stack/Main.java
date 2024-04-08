package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(3);
//        myStack.getTop();
//        myStack.getHeight();
        myStack.push(2);
        myStack.push(1);
        myStack.push(0);
        myStack.push(5);

        myStack.pop();
        myStack.printStack();
    }
}