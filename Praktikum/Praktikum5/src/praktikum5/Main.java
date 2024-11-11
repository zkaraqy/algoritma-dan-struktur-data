package praktikum5;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        OperasiLinkedList operasi = new OperasiLinkedList();
        int pilihan;
        boolean ulang = true;
        do {
            menu();
            System.out.println("------------------------------------");
            System.out.print("Masukkan Nomor Pilihan: ");
            pilihan = scan.nextInt();
            System.out.println("------------------------------------");
            switch (pilihan) {
                case 1:
                    operasi.tambahDataString(linkedList);
                    break;
                case 2:
                    operasi.tambahDataDecimal(linkedList);
                    break;
                case 3:
                    operasi.tambahDataStringAtIndex(linkedList);
                    break;
                case 4:
                    operasi.tambahDataDecimalAtIndex(linkedList);
                    break;
                case 5:
                    operasi.hapusDataString(linkedList);
                    break;
                case 6:
                    operasi.hapusDataDecimal(linkedList);
                    break;
                case 7:
                    operasi.hapusDataAtIndex(linkedList);
                    break;
                case 8:
                    operasi.deleteAllData(linkedList);
                    break;
                case 9:
                    operasi.tampilkanData(linkedList);
                    break;
                case 10:
                    operasi.tampilkanDataAtIndex(linkedList);
                    break;
                case 11:
                    ulang = false;
                    break;
                default:
                    
            }
            System.out.println("");
            System.out.println("------------------------------------");
        } while (ulang);
    }

    static void menu() {
        System.out.println("-> Program Linked List <-");
        System.out.println("1. Tambah Data String");
        System.out.println("2. Tambah Data Decimal");
        System.out.println("3. Tambah Data String Berdasarkan Index");
        System.out.println("4. Tambah Data Decimal Berdasarkan Index");
        System.out.println("5. Hapus Data String");
        System.out.println("6. Hapus Data Decimal");
        System.out.println("7. Hapus Data Berdasarkan Index");
        System.out.println("8. Hapus Semua Data");
        System.out.println("9. Tampilkan Seluruh Data");
        System.out.println("10. Tampilkan Data Berdasarkan Index");
        System.out.println("11. Berhenti");
    }
}
