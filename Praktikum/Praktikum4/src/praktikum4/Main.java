package praktikum4;

public class Main {

    public static void main(String[] args) {
        ArrayAngka arrayAngka = new ArrayAngka();
        System.out.println("-> Program Mengurutkan Angka Secara Ascending <-");
        System.out.println("");
        arrayAngka.isiArrayAngka();
        System.out.println("");
        arrayAngka.printArray("Array Angka Sebelum Diurutkan");
        System.out.println("");
        arrayAngka.quickSort(0, arrayAngka.length - 1);
        System.out.println("");
        arrayAngka.printArray("Array Angka Setelah Diurutkan");
    }

}
