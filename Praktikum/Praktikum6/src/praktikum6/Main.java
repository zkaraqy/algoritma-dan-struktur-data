package praktikum6;

public class Main {

    public static void main(String[] args) {
        Vaksinasi vaksinasi = new Vaksinasi();
        System.out.println("-> Selamat Datang di Program Pendaftaran Vaksinasi <-");
        int pilihan;
        do {
            System.out.println("");
            vaksinasi.tampilkanSisaDosisVaksin();
            vaksinasi.tampilkanAntrian();
            pilihan = vaksinasi.pilihanMenuPengguna();
            switch (pilihan) {
                case 1:
                    vaksinasi.panggilOrangSelanjutnya();
                    break;
                case 2:
                    vaksinasi.tutupPendaftaran();
                    break;
                default:

            }
        } while (pilihan != 2);
    }
}
