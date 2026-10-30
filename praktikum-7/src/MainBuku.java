public class MainBuku {
    public static void main(String[] args) {

        Buku buku = new Buku(
                "pemrograman java",
                "Fika Salsabila",
                2026
        );
        buku.tampilkanData();

        System.out.println("\nSetelah menggunakan Setter:");

        buku.setJudul("Pemrograman Berorientasi Objek");
        buku.setPengarang("Fika Salsabila");

        System.out.println("Judul             : " + buku.getJudul());
        System.out.println("Pengarang         : " + buku.getPengarang());


    }

}
