package list.interIterator;

public class Link {
    public long dData;
    public Link next;

    public Link(long data) {
        this.dData = data;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
