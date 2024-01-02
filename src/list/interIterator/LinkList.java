package list.interIterator;

public class LinkList {
    private Link first;

    public LinkList() {
        this.first = null;
    }

    public Link getFirst() {
        return this.first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public ListIterator getIterator() {
        return new ListIterator(this);
    }

    public void displayList() {
        Link current = this.first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
