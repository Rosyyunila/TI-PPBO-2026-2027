public class KartuKredit extends MetodePembayaran implements BisaCashback{

    //constructor untuk menentukan nama metode pembayaran
    public KartuKredit() {
        super("Kartu Kredit");
    }

     //menghitung biaya admin sebesar 2% dari jumlah belanja
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return jumlah * 0.02;
    }
    // menghitung cashback sebesar 1% dari jumlah belanja
    @Override
    public double hitungCashback(double jumlah ) {
        return jumlah * 0.01;
    }
}
