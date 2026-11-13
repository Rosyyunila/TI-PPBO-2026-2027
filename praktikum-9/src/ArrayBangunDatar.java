public class ArrayBangunDatar {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = new BangunDatar[5];

        daftarBangun[0] = new Lingkaran(7);
        daftarBangun[1] = new Persegi(5);
        daftarBangun[2] = new Lingkaran(10);
        daftarBangun[3] = new Persegi(8);
        daftarBangun[4] = new PersegiPanjang(8,4);


        double totalLuas = 0;
        double luasTerbesar = 0;
        BangunDatar bangunTerbesar = null;

        for (int i = 0; i < daftarBangun.length; i++) {
            System.out.println("Bangun ke-" + (i + 1));
            daftarBangun[i].tampilkanInfo();

            double luas = daftarBangun[i].hitungLuas();
            totalLuas += luas;

            if (bangunTerbesar == null || luas > luasTerbesar) {
                luasTerbesar = luas;
                bangunTerbesar = daftarBangun[i];
            }
        }
        System.out.println("==== HASIL PERHITUNGAN =====");
        System.out.println("Total luas seluruh bangun   : " + totalLuas);
        System.out.println("Bangun dengan luas terbesar : " + bangunTerbesar.namaBangun);
        System.out.println("Luas terbesar  : " + luasTerbesar);

    }
}
