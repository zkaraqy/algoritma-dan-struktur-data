package praktikum1;

public class JadwalPenerbanganPesawat extends ReservasiTiketPesawat {
    
    static void tampilkanJadwalPenerbangan() {
        System.out.println("\tJadwal Penerbangan Pesawat");
        System.out.println("Penerbangan Pesawat 1:");
        jadwalPenerbanganPesawat(getTiket1());
        System.out.println("");
        System.out.println("Penerbangan Pesawat 2:");
        jadwalPenerbanganPesawat(getTiket2());
        System.out.println("");
        System.out.println("Penerbangan Pesawat 3:");
        jadwalPenerbanganPesawat(getTiket3());
    }
    
    private static void jadwalPenerbanganPesawat(Tiket tiket) {
        System.out.println("Nama Maskapai : " + tiket.getNamaMaskapai());
        System.out.println("Tanggal dan Waktu Keberangkatan : " + tiket.getTanggalDanWaktuKeberangkatan());
        System.out.println("Bandara Keberangkatan : " + tiket.getBandaraKeberangkatan());
        System.out.println("Bandara Tujuan : " + tiket.getBandaraTujuan());
    }
    
}
