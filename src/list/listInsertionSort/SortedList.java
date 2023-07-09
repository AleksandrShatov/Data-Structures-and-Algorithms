package list.listInsertionSort;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }

    public SortedList(Link[] linkArr) {
        this.first = null;
        for (int j = 0; j < linkArr.length; j++) {
            insert(linkArr[j]);
        }
    }

    public void insert(Link link) {
        Link previous = null;
        Link current = first;

        while(current != null && link.dData > current.dData) {
            previous = current;
            current = current.next;
        }
        if(previous == null) {
            this.first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    public Link remove() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}
