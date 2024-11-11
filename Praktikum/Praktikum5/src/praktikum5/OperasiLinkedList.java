package praktikum5;

import java.util.LinkedList;
import java.util.Scanner;

public class OperasiLinkedList {

    static Scanner scan = new Scanner(System.in);
    private String dataString;
    private double dataDecimal;
    private int index;

    void tambahDataString(LinkedList linkedList) {
        System.out.print("Masukkan Data String: ");
        dataString = scan.nextLine();
        add(linkedList, dataString);
    }

    void tambahDataStringAtIndex(LinkedList linkedList) {
        System.out.print("Masukkan Data String: ");
        dataString = scan.nextLine();
        dataString = scan.nextLine();
        System.out.print("Masukkan Index: ");
        index = scan.nextInt();
        add(linkedList, dataString, index);
    }

    void tambahDataDecimal(LinkedList linkedList) {
        System.out.print("Masukkan Data Decimal: ");
        dataDecimal = scan.nextDouble();
        add(linkedList, dataDecimal);
    }

    void tambahDataDecimalAtIndex(LinkedList linkedList) {
        System.out.print("Masukkan Data Decimal: ");
        dataDecimal = scan.nextDouble();
        System.out.print("Masukkan Index: ");
        index = scan.nextInt();
        add(linkedList, dataDecimal, index);
    }

    void hapusDataString(LinkedList linkedList) {
        System.out.print("Masukkan Data String: ");
        dataString = scan.nextLine();
        delete(linkedList, dataString);
    }

    void hapusDataDecimal(LinkedList linkedList) {
        System.out.print("Masukkan Data Decimal: ");
        dataDecimal = scan.nextDouble();
        delete(linkedList, dataDecimal);
    }

    void hapusDataAtIndex(LinkedList linkedList) {
        System.out.print("Masukkan Index Data: ");
        index = scan.nextInt();
        deleteByIndex(linkedList, index);
    }

    void tampilkanDataAtIndex(LinkedList linkedList) {
        System.out.print("Masukkan Index Data: ");
        index = scan.nextInt();
        Object data = getData(linkedList, index);
        if (data == null) {
            return;
        }
        System.out.println("Data -> " + data);
    }

    void add(LinkedList linkedList, String data) {
        linkedList.add(data);
        System.out.println("-> Data Berhasil Ditambahkan");
    }

    void add(LinkedList linkedList, String data, int index) {
        try {
            linkedList.add(index, data);
            System.out.println("-> Data Berhasil Ditambahkan");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("-> Data Tidak Berhasil Ditambahkan");
            System.out.println("-> Index Out Of Bonds");
        }
    }

    void add(LinkedList linkedList, double data) {
        linkedList.add(data);
        System.out.println("-> Data Berhasil Ditambahkan");
    }

    void add(LinkedList linkedList, double data, int index) {
        try {
            linkedList.add(index, data);
            System.out.println("-> Data Berhasil Ditambahkan");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("-> Data Tidak Berhasil Ditambahkan");
            System.out.println("-> Index Out Of Bonds");
        }
    }

    void delete(LinkedList linkedList, String data) {
        if (linkedList.remove(data)) {
            System.out.println("-> Data Berhasil Dihapus");
        } else {
            System.out.println("-> Data Tidak Berhasil Dihapus");
            System.out.println("-> Data Tidak Ditemukan Dalam LinkedList");
        }
    }

    void delete(LinkedList linkedList, double data) {
        if (linkedList.remove(data)) {
            System.out.println("-> Data Berhasil Dihapus");
        } else {
            System.out.println("-> Data Tidak Berhasil Dihapus");
            System.out.println("-> Data Tidak Ditemukan Dalam LinkedList");
        }
    }

    void deleteByIndex(LinkedList linkedList, int index) {
        try {
            linkedList.remove(index);
            System.out.println("-> Data Berhasil Dihapus");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("-> Data Tidak Berhasil Dihapus");
            System.out.println("-> Data Tidak Ditemukan Dalam LinkedList");
        }
    }

    void deleteAllData(LinkedList linkedList) {
        linkedList.clear();
        System.out.println("-> Semua Data Telah Terhapus");
    }

    void tampilkanData(LinkedList linkedList) {
        System.out.println("Data :");
        for (int i = 0; i < linkedList.size(); i++) {
            Object get = linkedList.get(i);
            if (i == linkedList.size() - 1) {
                System.out.println(get);
                break;
            }
            System.out.print(get + " => ");
        }
    }

    Object getData(LinkedList linkedList, int index) {
        Object data;
        try {
            data = linkedList.get(index);
            return data;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("-> Data Tidak Ditemukan");
            return null;
        }
    }
}
