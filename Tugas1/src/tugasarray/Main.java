package tugasarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan;
        Matriks matriks1 = new Matriks(1);
        Matriks matriks2 = new Matriks(2);

        do {
            System.out.println("\n\tMatriks");
            menu();
            System.out.print("Pilihan = ");
            pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    matriks1.setDimensi();
                    matriks2.setDimensi();
                    matriks1.inputElemenMatriks();
                    matriks2.inputElemenMatriks();
                    Matriks.print(Penjumlahan.jumlahkan(matriks1.getMatriks(), matriks2.getMatriks()));
                    break;

                case 2:
                    matriks1.setDimensi();
                    matriks2.setDimensi();
                    matriks1.inputElemenMatriks();
                    matriks2.inputElemenMatriks();
                    Matriks.print(Pengurangan.kurangkan(matriks1.getMatriks(), matriks2.getMatriks()));
                    break;

                case 3:
                    matriks1.setDimensi();
                    matriks2.setDimensi();
                    matriks1.inputElemenMatriks();
                    matriks2.inputElemenMatriks();
                    Matriks.print(Perkalian.kalikan(matriks1.getMatriks(), matriks2.getMatriks()));
                    break;

                case 4:
                    matriks1.setDimensi();
                    matriks1.inputElemenMatriks();
                    Matriks.print(Transpose.transpose(matriks1.getMatriks()));
                    break;
                case 5:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pilihan != 5);
    }

    static void menu() {
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Transpose");
        System.out.println("5. Keluar");
        System.out.println("");
    }
}
