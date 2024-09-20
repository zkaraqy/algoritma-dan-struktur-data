package tugasarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilihan, baris1, baris2, kolom1, kolom2;
        int[][] matriks1, matriks2, matriksHasil;
        
        do {
            System.out.println("\n\tMatriks");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Transpose");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Pilihan = ");
            pilihan = scan.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah baris matriks 1 : ");
                    baris1 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 1 : ");
                    kolom1 = scan.nextInt();
                    System.out.print("Masukkan jumlah baris matriks 2 : ");
                    baris2 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 2 : ");
                    kolom2 = scan.nextInt();
                    matriks1 = Matriks.input(baris1, kolom1, 1);
                    matriks2 = Matriks.input(baris2, kolom2, 2);
                    matriksHasil = Penjumlahan.jumlahkan(matriks1, matriks2);
                    Matriks.print(matriksHasil);
                    break;
                    
                case 2:
                    System.out.print("Masukkan jumlah baris matriks 1 : ");
                    baris1 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 1 : ");
                    kolom1 = scan.nextInt();
                    System.out.print("Masukkan jumlah baris matriks 2 : ");
                    baris2 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 2 : ");
                    kolom2 = scan.nextInt();
                    matriks1 = Matriks.input(baris1, kolom1, 1);
                    matriks2 = Matriks.input(baris2, kolom2, 2);
                    matriksHasil = Pengurangan.kurangkan(matriks1, matriks2);
                    Matriks.print(matriksHasil);
                    break;
                    
                case 3:
                    System.out.print("Masukkan jumlah baris matriks 1 : ");
                    baris1 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 1 : ");
                    kolom1 = scan.nextInt();
                    System.out.print("Masukkan jumlah baris matriks 2 : ");
                    baris2 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks 2 : ");
                    kolom2 = scan.nextInt();
                    matriks1 = Matriks.input(baris1, kolom1, 1);
                    matriks2 = Matriks.input(baris2, kolom2, 2);
                    matriksHasil = Perkalian.kalikan(matriks1, matriks2);
                    Matriks.print(matriksHasil);
                    break;
                    
                case 4:
                    System.out.print("Masukkan jumlah baris matriks : ");
                    baris1 = scan.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks : ");
                    kolom1 = scan.nextInt();
                    matriks1 = Matriks.input(baris1, kolom1, 1);
                    matriksHasil = Transpose.transpose(matriks1);
                    Matriks.print(matriksHasil);
                    break;

                case 5:
                    break;
                default:
                    throw new AssertionError();
            }
        } while (pilihan != 5);
    }

}
