package praktikum2;

public class Kalimat {

    private String[] strArr;

    public Kalimat(String str) {
        strArr = str.split("");
    }

    public int jumlahHurufVokalRekursi(int i) {
        if (i == strArr.length) {
            return 0;
        }
        if (strArr[i].equalsIgnoreCase("a") || strArr[i].equalsIgnoreCase("i") || strArr[i].equalsIgnoreCase("u") || strArr[i].equalsIgnoreCase("e") || strArr[i].equalsIgnoreCase("o")) {
            return 1 + jumlahHurufVokalRekursi(i + 1);
        }
        return jumlahHurufVokalRekursi(i + 1);
    }

    public int jumlahHurufForEach() {
        int n = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase("a") || strArr[i].equalsIgnoreCase("i") || strArr[i].equalsIgnoreCase("u") || strArr[i].equalsIgnoreCase("e") || strArr[i].equalsIgnoreCase("o")) {
                n++;
            }
        }
        return n;
    }

}
