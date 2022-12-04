package list.link;

public class Link {
    public int iData;           // Data (key)
    public double dData;        // Data
    public Link next;           // Next element in the list

    public Link(int id, double dd) {
        this.iData = id;
        this.dData = dd;
        this.next = null;
    }

    public void displayLink() {
        System.out.print("{" + iData + ", " + dData + "} ");
    }
}
