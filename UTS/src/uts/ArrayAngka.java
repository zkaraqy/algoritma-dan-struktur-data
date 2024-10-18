package uts;

public class ArrayAngka {

    private double[] arrayAngka = new double[10];
    private int idx = 0;
    private boolean isSorted = false;
    private BubbleSort bubbleSort;
    private MergeSort mergeSort;
    private QuickSort quickSort;
    private RandomizeArrayAngka randomizeArrayAngka;
    private SequentialSearch sequentialSearch;
    private BinarySearch binarySearch;

    public ArrayAngka() {
        bubbleSort = new BubbleSort();
        mergeSort = new MergeSort();
        quickSort = new QuickSort();
        randomizeArrayAngka = new RandomizeArrayAngka();
        sequentialSearch = new SequentialSearch();
        binarySearch = new BinarySearch();
    }

    int getIndex() {
        return idx;
    }

    boolean isIsSorted() {
        return isSorted;
    }

    void setIsSorted(boolean isSorted) {
        this.isSorted = isSorted;
    }

    double[] getArrayAngka() {
        return arrayAngka;
    }

    void setArrayAngka(double[] arr) {
        arrayAngka = arr;
    }

    int add(double angka) {
        if (idx < arrayAngka.length) {
            arrayAngka[idx] = angka;
            idx++;
            return idx - 1;
        } else {
            throw new Error("Array Angka Telah Penuh!");
        }
    }

    void setAngkaAtIndex(int index, double angka) {
        arrayAngka[index] = angka;
    }

    double getAngkaAtIndex(int index) {
        return arrayAngka[index];
    }

    void doBubbleSort() {
        arrayAngka = bubbleSort.sort(arrayAngka);
        setIsSorted(true);
    }

    void doMergeSort() {
        arrayAngka = mergeSort.sort(arrayAngka, 0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void doQuickSort() {
        arrayAngka = quickSort.sort(arrayAngka, 0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void randomize() {
        arrayAngka = randomizeArrayAngka.randomize(arrayAngka);
        setIsSorted(false);
    }

    int doSequentialSearch(double target) {
        return sequentialSearch.search(arrayAngka, target);
    }

    int doBinarySearch(double target) {
        return binarySearch.search(arrayAngka, target);
    }

    void resetArrayAngka() {
        for (int i = 0; i < arrayAngka.length; i++) {
            arrayAngka[i] = 0;
        }
        setIsSorted(false);
        idx = 0;
    }
}
