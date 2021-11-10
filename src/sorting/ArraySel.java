package sorting;

public class ArraySel {

    private long[] a;
    private int nElems;

    public ArraySel(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public void selectionSort() {
        int outIn, inIn, minIn;
        for (outIn = 0; outIn < nElems - 1; outIn++) {
            minIn = outIn;
            for (inIn = outIn + 1; inIn < nElems; inIn++) {
                if(a[inIn] < a[minIn]) {
                    minIn = inIn;
                }
            }
            swap(outIn, minIn);
        }
    }

    public void swap(int oneIn, int twoIn) {
        long temp = a[oneIn];
        a[oneIn] = a[twoIn];
        a[twoIn] = temp;
    }
}
