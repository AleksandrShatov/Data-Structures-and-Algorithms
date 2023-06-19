package list.firstlast;

public class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        this.dData = d;
        this.next = null;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
