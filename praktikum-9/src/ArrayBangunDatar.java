public class ArrayBangunDatar {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = new BangunDatar[4];

        daftarBangun[0] = new Lingkaran(7);
        daftarBangun[1] = new Persegi(5);
        daftarBangun[2] = new Lingkaran(10);
        daftarBangun[3] = new Persegi(8);

        double totalLuas = 0;

        for (int i = 0; i < daftarBangun.length; i++) {

            double luas = daftarBangun[i].hitungLuas();
            System.out.println("Luas bangun ke-" + (i + 1) + ": " + luas);
            totalLuas += luas;
        }
        System.out.println("--------------------------------");
        System.out.println("Total luas seluruh bangun: " + totalLuas);
    }
}
