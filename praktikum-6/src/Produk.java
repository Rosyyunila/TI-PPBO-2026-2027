public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    //constructor dengan parameter
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    //menghitung total harga pembelian
    public double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    //mengurangi stok produk
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println("Pembelian berhasil.");
            System.out.println("Stok tersisa: " + stok);
        } else  {
            System.out.println("Stok tidak mencukupi");

        }
    }

    //menampilkan data produk
    public void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga : Rp" + harga );
        System.out.println("Stok : " + stok);

    }
}
