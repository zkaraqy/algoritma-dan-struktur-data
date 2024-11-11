package faktorial;

import java.util.Scanner;

/**
 *
 * @author Azka
 */
public class Faktorial {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = scan.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);

        printNilai(nilai);
        int jumlah = jumlahNilai(nilai);
        System.out.println("jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Faktorial = " + faktorial);
    }

//    fungsi rekursif sederhana
    static void printNilai(int parameter) {
        System.out.println("nilai = " + parameter);
        if (parameter == 10) {
            return;
        }
        parameter++;
        printNilai(parameter);
    }

    static int jumlahNilai(int parameter) {
        if (parameter == 0) {
            return parameter;
        }
        System.out.println("Parameter = " + parameter);
        return parameter + jumlahNilai(parameter - 1);
    }

    static int hitungFaktorial(int parameter) {
        System.out.println("Parameter = " + parameter);
        if (parameter == 1) {
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }
}
