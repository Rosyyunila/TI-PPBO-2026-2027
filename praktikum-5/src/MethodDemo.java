public class MethodDemo {
    //method dengan satu parameter
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }
    //Menampilkan dengan lebih dari satu parameter
    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }
    public static void main(String[] args) {
        sapa ("budi");
        sapa ("Siti");
        // Panggil pada method main:
        tampilkanBiodata("Budi", 20, "Bandung");

    }
}
