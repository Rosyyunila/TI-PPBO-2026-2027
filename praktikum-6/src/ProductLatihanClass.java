public class ProductLatihanClass {
    public static void main(String[] args) {

        ProductLatihan produk1 = new ProductLatihan("Laptop" , 8000000);
        ProductLatihan produk2 = new ProductLatihan("Mause" , 150000);
        ProductLatihan produk3 = new ProductLatihan("Keyboard" , 500000);

        double batasHarga = 1000000;

        System.out.println(produk1.namaProduk + " mahal? " + produk1.isMahal(batasHarga));
        System.out.println(produk2.namaProduk + " mahal? " + produk2.isMahal(batasHarga));
        System.out.println(produk3.namaProduk + " mahal? " + produk3.isMahal(batasHarga));
    }
}
