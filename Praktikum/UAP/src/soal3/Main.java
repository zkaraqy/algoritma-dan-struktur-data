package soal3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AntrianPasien antrianPasien = new AntrianPasien();
        System.out.print("Masukkan NIM : ");
        String[] arrStrNIM = scan.nextLine().split("");
        for (int i = 0; i < arrStrNIM.length; i++) {
            int digitNIM = Integer.parseInt(arrStrNIM[i]);
            switch (digitNIM) {
                case 0:
                    antrianPasien.keluarkanPasienPertama();
                    break;
                case 1:
                    System.out.print("Masukkan Id : ");
                    int id = scan.nextInt();
                    antrianPasien.tambahPasien(id);
                    break;
                case 2:
                    antrianPasien.tukarPosisiDuaPasienPertama();
                    break;
                case 3:
                    antrianPasien.gandakanIdPasienTerakhir();
                    break;
                case 4:
                    antrianPasien.pindahPasienTerakhirKeAwal();
                    break;
                case 5:
                    antrianPasien.keluarkanPasienDenganIdTerkecil();
                    break;
                case 6:
                    antrianPasien.tindakanKhususNomor6();
                    break;
                case 7:
                    antrianPasien.balik();
                    break;
                case 8:
                    antrianPasien.hapusSemuaPasienDenganIDLebihKecilDari10();
                    break;
                case 9:
                    antrianPasien.tindakanKhususNomor9();
                    break;

            }
        }
    }

}
