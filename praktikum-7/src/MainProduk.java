public class MainProduk {
    public static void main(String[] args) {

        Produk produk = new Produk(
           "P001",
           "Buku Tuis",
           5000,
            10
        );
        System.out.println("Kode Produk  : " + produk.getKodeProduk());
        System.out.println("Nama Produk  : " + produk.getNamaProduk());
        System.out.println("Harga        : " + produk.getHarga());
        System.out.println("Stok         : " + produk.getStok());

        System.out.println("\nSetelah menambah stok:");
        produk.tambahStok(5);
        System.out.println("Stok            : " + produk.getStok());

        System.out.println("\nSetelah mengurangi stok:");
        produk.kurangiStok(3);
        System.out.println("Stok            : " + produk.getStok());

        System.out.println("\nPengujian nilai tidak valid:");
        produk.setHarga(-1000);
        produk.tambahStok(0);
        produk.kurangiStok(20);

    }
}
