public class Tunai extends MetodePembayaran {

    //constructor untuk menentukan nama metode pembayaran
    public Tunai() {
        super("Tunai");
    }
    //menghitung biaya administrasi pembayaran tunai
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0; // pembayaran tunai tidak dikenakan biaya admin
    }
}
