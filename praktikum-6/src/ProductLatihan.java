public class ProductLatihan {
    String namaProduk;
    double harga;

    // Constructor dengan parameter
    public ProductLatihan(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Method mengecek apakah harga melebihi batas
    public boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }
}
