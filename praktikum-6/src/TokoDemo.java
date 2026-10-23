public class TokoDemo {
    public static void main(String[] args) {

        // array of object produk
        Produk[] daftarProduk = new Produk[5];

        daftarProduk[0] = new Produk("P001", "Laptop", 8000000, 10);
        daftarProduk[1] = new Produk("P002", "Mouse", 150000, 20);
        daftarProduk[2] = new Produk("P003", "Keyboard", 500000, 15);
        daftarProduk[3] = new Produk("P004", "Monitor", 2500000, 8);
        daftarProduk[4] = new Produk("P005", "Printer", 3000000, 5);

        //menampilkan seluruh data produk
        System.out.println("=== DATA PRODUK ===");

        for (Produk produk : daftarProduk) {
            produk.tampilkanData();
            System.out.println("-------------------");
        }
        //pembelian produk pertama
        System.out.println("\n=== PEMBELIAN 1 ===");

        Produk produk1 = daftarProduk[0];
        int jumlahBeli1 = 2;

        System.out.println("Produk         : " + produk1.namaProduk);
        System.out.println("Jumlah beli    : " + jumlahBeli1);
        System.out.println("Total harga    : Rp" + (long) produk1.hitungTotalHarga(jumlahBeli1));

        produk1.kurangiStok(jumlahBeli1);

        //pembelian produk kedua dengan stok tidak mencukupi
        System.out.println("\n=== PEMBELIAN 2 ===");

        Produk produk2 = daftarProduk[4];
        int jumlahBeli2 = 10;

        System.out.println("Produk        : " + produk2.namaProduk);
        System.out.println("Jumlah beli   : " + jumlahBeli2);
        System.out.println("Total harga   : Rp" + (long) produk2.hitungTotalHarga(jumlahBeli2));

        produk2.kurangiStok(jumlahBeli2);

        //mencari produk dengan harga termahal
        Produk produkTermahal = daftarProduk[0];

        for (Produk produk  : daftarProduk) {
            if (produk.harga > produkTermahal.harga) {
                produkTermahal = produk;
            }
        }

        System.out.println("\n=== PRODUK TERMAHAL ===");
        produkTermahal.tampilkanData();
    }
}
