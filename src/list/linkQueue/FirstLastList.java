package list.linkQueue;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (this.first == null);
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);
        if(isEmpty()) {
            this.first = newLink;
        } else {
            this.last.next = newLink;
        }
        this.last = newLink;
    }

    public long deleteFirst() {
        long temp = this.first.dData;
        if(this.first.next == null) {
            this.last = null;
        }
        this.first = this.first.next;
        return temp;
    }

    public void displayList() {
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
