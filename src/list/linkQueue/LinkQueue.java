package list.linkQueue;

public class LinkQueue {
    private FirstLastList theList;

    public LinkQueue() {
        this.theList = new FirstLastList();
    }

    public boolean isEmpty() {
        return this.theList.isEmpty();
    }

    public void insert(long data) {
        this.theList.insertLast(data);
    }

    public long remove() {
        return this.theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        this.theList.displayList();
    }
}
