package stack.postfix;

public class ParsePost {

    private StackY theStack;
    private String input;

    public ParsePost(String in) {
        this.input = in;
    }

    public int doParse() {
        theStack = new StackY(20);
        char ch;
        int j;
        int num1, num2, interAns;
        for(j = 0; j < input.length(); j++) {
            ch = input.charAt(j);
            theStack.displayStack(""+ch+"");
            if(ch >= '0' && ch <= '9') {
                theStack.push((int)(ch - '0'));
            } else {
                num2 = theStack.pop();
                num1 = theStack.pop();
                switch(ch) {
                    case '+':
                        interAns = num1 + num2;
                        break;
                    case '-':
                        interAns = num1 - num2;
                        break;
                    case '*':
                        interAns = num1 * num2;
                        break;
                    case '/':
                        interAns = num1 / num2;
                        break;
                    default:
                        interAns = 0;
                }
                theStack.push(interAns);
            }
        }
        interAns = theStack.pop();
        return interAns;
    }

}
