package sorting;

public class SelectSortApp {
    public static void main(String[] args) {
        int maxSize = 120000;
        ArraySel arr;
        arr = new ArraySel(maxSize);

        for (int i = 0; i < maxSize; i++) {
//            long n = (long)(java.lang.Math.random()*(maxSize - 1));
//            arr.insert(n);

//            arr.insert(maxSize - i - 1);

            arr.insert(i);
        }

        long startTime = System.currentTimeMillis();

//        arr.display();

        arr.selectionSort();

//        arr.display();

        long endTime = System.currentTimeMillis();

        System.out.println("Delta time is: " + (endTime - startTime) + " ms");
    }

}
