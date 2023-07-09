package list.sortedList;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(long data) {
        Link newLink = new Link(data);
        Link previous = null;
        Link current = first;

        while(current != null && data > current.dData) {
            previous = current;
            current = current.next;
        }

        if(previous == null) {
            this.first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
