package list.linkStack;

public class LinkStack {

    private LinkList theList;

    public LinkStack() {
        this.theList = new LinkList();
    }

    public void push(long data) {
        theList.insertFirst(data);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public boolean isEmpty() {
        return ( theList.isEmpty() );
    }

    public void displayStack() {
        System.out.print("Stack (top-->bottom): ");
        theList.displayList();
    }
}
