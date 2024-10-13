package uts;

public class ArrayAngka {

    protected double[] arrayAngka = new double[10];
    private boolean isSorted = false;
    private final BubbleSort bubbleSort = new BubbleSort();
    private final MergeSort mergeSort = new MergeSort();
    private final QuickSort quickSort = new QuickSort();
    private final RandomizeArrayAngka randomizeArrayAngka = new RandomizeArrayAngka();
    private final SequentialSearch sequentialSearch = new SequentialSearch();
    private final BinarySearch binarySearch = new BinarySearch();

    boolean isIsSorted() {
        return isSorted;
    }

    void setIsSorted(boolean isSorted) {
        this.isSorted = isSorted;
    }

    double[] getArrayAngka() {
        return arrayAngka;
    }

    void setAngkaAtIndex(int index, int angka) {
        arrayAngka[index] = angka;
    }

    double getAngkaAtIndex(int index) {
        return arrayAngka[index];
    }

    void bubbleSort() {
        bubbleSort.sort();
        setIsSorted(true);
    }

    void mergeSort() {
        mergeSort.sort(0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void quickSort() {
        quickSort.sort(0, arrayAngka.length - 1);
        setIsSorted(true);
    }

    void randomize() {
        randomizeArrayAngka.randomize();
        setIsSorted(false);
    }

    int sequentialSearch(double target) {
        return sequentialSearch.search(target);
    }
    
    int binarySearch(double target) {
        return binarySearch.search(target);
    }
}
