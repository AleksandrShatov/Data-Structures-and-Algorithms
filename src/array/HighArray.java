package array;

public class HighArray {

    private long[] a;

    private int nElems;

    public HighArray(int max) {
        this.a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++) {
            if(a[j] == searchKey) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        } else {
            return true;
        }
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++) {
            if(a[j] == value) {
                break;
            }
        }
        if(j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems - 1; k++) {
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    public long getMax() {
        if(nElems == 0) {
            return -1;
        } else {
            long max = a[0];
            for (int i = 1; i < nElems; i++) {
                if(a[i] > max) {
                    max = a[i];
                }
            }
            return max;
        }
    }

//    public long removeMax() {
//        long max = getMax();
//        if(max != -1) {
//            delete(max);
//        }
//        return max;
//    }

    public long removeMax() {
        if(nElems == 0) {
            return -1;
        } else {
            int maxIn = 0;
            long max = a[maxIn];
            for (int i = 1; i < nElems; i++) {
                if(a[i] > max) {
                    maxIn = i;
                    max = a[maxIn];
                }
            }

            for (int k = maxIn; k < nElems - 1; k++) {
                a[k] = a[k+1];
            }
            nElems--;

            return max;
        }
    }


}
