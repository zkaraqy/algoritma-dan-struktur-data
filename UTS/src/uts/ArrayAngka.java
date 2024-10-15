package uts;

public class ArrayAngka {

    protected double[] arrayAngka = new double[10];
    protected int idx = 0;
    private boolean isSorted = false;
    private BubbleSort bubbleSort;
    private MergeSort mergeSort;
    private QuickSort quickSort;
    private RandomizeArrayAngka randomizeArrayAngka;
    private SequentialSearch sequentialSearch;
    private BinarySearch binarySearch;
    
    boolean isIsSorted() {
        return isSorted;
    }

    void setIsSorted(boolean isSorted) {
        this.isSorted = isSorted;
    }

    double[] getArrayAngka() {
        return arrayAngka;
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
        bubbleSort.sort();
        setIsSorted(true);
    }

    void doMergeSort() {
        mergeSort.sort(0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void doQuickSort() {
        quickSort.sort(0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void randomize() {
        randomizeArrayAngka.randomize();
        setIsSorted(false);
    }

    int doSequentialSearch(double target) {
        return sequentialSearch.search(target);
    }

    int doBinarySearch(double target) {
        return binarySearch.search(target);
    }
}
