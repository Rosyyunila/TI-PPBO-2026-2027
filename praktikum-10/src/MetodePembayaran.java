public abstract class MetodePembayaran {

    //atribut untuk menyimpan nama metode pembayaran
    protected String namaMetode;

    //contructor untuk mengisi nama metode pembayran
    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }
    //absract method untuk menghitung biaya administrasi
    public abstract double hitungBiayaAdmin(double jumlah);

    // method untuk menampilkan proses pembayaran
    public void prosesPembayaran(double jumlah) {

        // Menghitung  biaya administrasi dan total pembayaran
        double biayaAdmin = hitungBiayaAdmin(jumlah);
        double total = jumlah + biayaAdmin;

        System.out.println("Metode Pembayaran : " + namaMetode);
        System.out.println("Jumlah Belanja    : Rp" + jumlah);
        System.out.println("Biaya Admin       : Rp" + biayaAdmin);
        System.out.println("Total Bayar       : Rp" + total);
    }
}
