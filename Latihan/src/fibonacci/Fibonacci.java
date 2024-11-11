package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        printFibo(100, 0);
        System.out.println("");
    }

    static void printFibo(int maxFibo, int indexAwal) {

        int fibo = fibo(indexAwal);
        if (fibo > maxFibo) {
            return;
        }
        System.out.print(fibo + ", ");
        printFibo(maxFibo, ++indexAwal);
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 2) + fibo(n - 1);
    }

}
