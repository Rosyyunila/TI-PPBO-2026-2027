public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Contructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;

    }
    //contructor dengan parameter
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }
    //Instance method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama : " + nama);
        System.out.println("Nim  : " + nim);
        System.out.println("IPK  : " + ipk);
    }
    //Instance method untuk mengecek apakah cumlaude
    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
}
