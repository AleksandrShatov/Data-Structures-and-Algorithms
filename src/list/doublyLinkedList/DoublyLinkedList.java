package list.doublyLinkedList;

public class DoublyLinkedList {
    private Link first;
    private Link last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long data) {
        Link newLink = new Link(data);
        if(isEmpty()) {
            this.last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        this.first = newLink;
    }

    public void insertLast(long data) {
        Link newLink = new Link(data);
        if(isEmpty()) {
            this.first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        this.last = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        if(first.next == null) {
            this.last = null;
        } else {
            first.next.previous = null;
        }
        this.first = first.next;
        return temp;
    }

    public Link deleteLast() {
        Link temp = last;
        if(first.next == null) {
            this.first = null;
        } else {
            last.previous.next = null;
        }
        this.last = last.previous;
        return temp;
    }

    public boolean insertAfter(long key, long data) {
        Link current = first;
        while(current.dData != key) {
            current = current.next;
            if(current == null) {
                return false;
            }
        }
        Link newLink = new Link(data);
        if(current == last) {
            newLink.next = null;
            this.last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }

    public Link deleteByKey(long key) {
        Link current = first;
        while(current.dData != key) {
            current = current.next;
            if(current == null) {
                return null;
            }
        }
        if(current == first) {
            this.first = current.next;
        } else {
            current.previous.next = current.next;
        }
        if(current == last) {
            this.last = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        return current;
    }

    public void displayForward() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while(current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void displayBackward() {
        System.out.print("List (last-->first): ");
        Link current = last;
        while(current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
}
