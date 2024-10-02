package praktikum2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String str = scan.nextLine();
        Kalimat kalimat = new Kalimat(str);
        System.out.println("Jumlah banyaknya huruf vokal: ");
        System.out.println("- rekursif  : " + kalimat.jumlahHurufVokalRekursi(0));
        System.out.println("- foreach   : " + kalimat.jumlahHurufForEach());
    }

}
