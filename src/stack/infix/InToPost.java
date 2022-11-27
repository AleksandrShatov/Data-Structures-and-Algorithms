package stack.infix;

public class InToPost {

    private StackS theStack;
    private String input;
    private String output = "";

    public InToPost(String in) {
        this.input = in;
        int stackSize = input.length();
        this.theStack = new StackS(stackSize);
    }

    /**
     * Transfer infix to postfix form
     * @return the String in postfix form
     */
    public String doTrans() {
        for(int i = 0; i < input.length(); i++) {
           char ch = input.charAt(i);
           theStack.displayStack("For "+ch+" ");    // Diagnostic
           switch (ch) {
               case '+':
               case '-':
                   gotOper(ch, 1);
                   break;
               case '*':
               case '/':
                   gotOper(ch, 2);
                   break;
               case '(':
                   theStack.push(ch);
                   break;
               case ')':
                   gotParen(ch);
                   break;
               default:
                   output = output + ch;
                   break;
           }
        }
        while(!theStack.isEmpty()) {
            theStack.displayStack("While ");        // Diagnostic
            output = output + theStack.pop();
        }
        theStack.displayStack("End    ");           // Diagnostic
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while(!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if(opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;                              // Priority for new operator
                if(opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if(prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while(!theStack.isEmpty()) {
            char chx = theStack.pop();
            if(chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

}
