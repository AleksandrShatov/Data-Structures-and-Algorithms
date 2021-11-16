package sorting;

public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 120000;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);

        for (int i = 0; i < maxSize; i++) {
            long n = (long)(java.lang.Math.random()*(maxSize - 1));
            arr.insert(n);
        }

        long startTime = System.currentTimeMillis();

//        arr.display();

        arr.bubbleSort();

//        arr.display();

        long endTime = System.currentTimeMillis();

        System.out.println("Delta time is: " + (endTime - startTime) + " ms");
    }
}
