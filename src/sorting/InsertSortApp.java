package sorting;

public class InsertSortApp {
    public static void main(String[] args) {
        int maxSize = 120000;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);

        for (int i = 0; i < maxSize; i++) {
//            long n = (long)(java.lang.Math.random()*(maxSize - 1));
//            arr.insert(n);

            arr.insert(maxSize - i - 1);
        }

        long startTime = System.currentTimeMillis();

//        arr.display();

        arr.insertionSort();

//        arr.display();

        long endTime = System.currentTimeMillis();

        System.out.println("Delta time is: " + (endTime - startTime) + " ms");
    }
}
