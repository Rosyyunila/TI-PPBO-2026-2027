public class BukuClass {
    public static void main(String[] args) {

        //method menampilkan data
        Buku buku1 = new Buku("Laskar pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("Bumi", "Tere Liye", 2014);

        buku1.tampilkanData();
        System.out.println("---");

        buku2.tampilkanData();
    }
}
