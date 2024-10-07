package praktikum3;

public class Angkatan {

    public static int jumlahMaksimal = 40;
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMaksimal];
    private int i = 0;

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        if (i < daftarMahasiswa.length) {
            daftarMahasiswa[i] = mahasiswa;
            i++;
        } else {
            System.out.println("Daftar mahasiswa dalam angkatan telah maksimal");
        }
    }

    public Mahasiswa cariMahasiswa(String namaAtauNIM) {
        for (int j = 0; j < i; j++) {
            Mahasiswa mahasiswa = daftarMahasiswa[j];
            if (mahasiswa.getNIM() != null) {
                if (mahasiswa.getNIM().equalsIgnoreCase(namaAtauNIM)) {
                    return mahasiswa;
                }
            }
            if (mahasiswa.getNama().equalsIgnoreCase(namaAtauNIM) || mahasiswa.getNama().toLowerCase().contains(namaAtauNIM.toLowerCase())) {
                return mahasiswa;
            }
        }
        return null;
    }

}
