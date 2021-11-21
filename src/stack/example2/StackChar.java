package stack.example2;

public class StackChar {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackChar(int max) {
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
