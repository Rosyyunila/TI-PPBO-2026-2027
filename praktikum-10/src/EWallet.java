public class EWallet extends MetodePembayaran implements BisaCashback {

    //constructor untuk menentukan nama metode pembayaran
    public EWallet() {
        super("E-Wallet");
    }

    //biaya administrasi E-Wallet sebesar Rp1.000
    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    //menghitung cashback sebesar 5% dengan batas maksimal Rp20.000
    @Override
    public double hitungCashback(double jumlah) {

        double cashback = jumlah * 0.05;

        //membatasi cashback agar tidak melebihi Rp20.000
        if (cashback > 20000) {
            cashback = 20000;
        }
        return cashback;
    }
}
