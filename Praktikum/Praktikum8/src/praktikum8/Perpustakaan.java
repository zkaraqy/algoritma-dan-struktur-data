package praktikum8;

import java.util.HashMap;

public class Perpustakaan {
    
    // Studi Kasus: Sistem Pencatatan Buku Perpustakaan
    // Key: ISBN
    // Value: Buku

    public static void main(String[] args) {
        HashMap<String, Buku> perpus = new HashMap<>();

        perpus.put("978-3-16-148410-0", new Buku("Java Programming", "James Gosling", 1995, 300000));
        perpus.put("978-0-596-52068-7", new Buku("Learning Python", "Mark Lutz", 2013, 280000));
        perpus.put("978-1-491-99455-3", new Buku("Java Island", "Joshua Bloch", 2018, 500000));

        printBukuDiPerpustakaan(perpus);
        
        String isbn = "978-3-16-148410-0";
        if (perpus.containsKey(isbn)) {
            System.out.println("Data Buku dengan isbn " + isbn + " :");
            perpus.get(isbn).printBuku();
        } else {
            System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan.");
        }
        System.out.println("");
        
        if (perpus.containsKey("978-0-596-52068-7")) {
            Buku buku = perpus.get("978-0-596-52068-7");
            buku.setHarga(400000);
            System.out.println("Data buku setelah update harga:");
            perpus.get("978-0-596-52068-7").printBuku();
        }
        System.out.println("");
        
        perpus.remove("978-1-491-99455-3");
        System.out.println("Buku dengan ISBN 978-1-491-99455-3 telah dihapus.");
        
        printBukuDiPerpustakaan(perpus);

    }

    static void printBukuDiPerpustakaan(HashMap<String, Buku> perpus) {
        System.out.println("\nDaftar Buku di Perpustakaan:");
        int i = 1;
        for (String key : perpus.keySet()) {
            System.out.println(i + ".");
            perpus.get(key).printBuku();
            i++;
        }
        System.out.println("");
    }
    
}
