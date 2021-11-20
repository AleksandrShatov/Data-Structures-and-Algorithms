package stack.example1;

public class StackY {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackY(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch) {
        stackArray[++top] = ch;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}
