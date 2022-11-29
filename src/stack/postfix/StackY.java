package stack.postfix;

public class StackY {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackY(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        stackArray[++top] = value;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int size() {
        return (top + 1);
    }

    public int peekN(int n) {
        return stackArray[n];
    }

    public void displayStack(String s) {
        System.out.print(s);
        System.out.print("Stack (bottom-->top): ");
        for(int i = 0; i<size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }

}
