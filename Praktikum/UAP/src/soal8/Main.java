package soal8;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama tanpa spasi : ");
        String nama = scan.nextLine();
        String reversed_nama = reverseNama(nama);
        System.out.println("Anagram = " + nama.equals(reversed_nama));

        HashMap<Character, Integer> frekuensiKarakter = new HashMap<>();
        for (int i = 0; i < nama.length(); i++) {
            if (frekuensiKarakter.containsKey(nama.charAt(i))) {
                frekuensiKarakter.put(nama.charAt(i), frekuensiKarakter.get(nama.charAt(i)) + 1);
            } else {
                frekuensiKarakter.put(nama.charAt(i), 1);
            }
        }
        System.out.println("Map Frekuensi Karakter Pada Nama: ");
        for (Map.Entry<Character, Integer> entry : frekuensiKarakter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    static String reverseNama(String nama) {
        String str = "";
        for (int i = nama.length() - 1; i >= 0; i--) {
            str += nama.charAt(i);
        }
        return str;
    }
}
