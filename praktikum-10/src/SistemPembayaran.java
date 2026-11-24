import java.util.Scanner;
public class SistemPembayaran {
    public static void main(String[] args) {

        //membuat objek scanner untuk membaca input pengguna
        Scanner input = new Scanner(System.in);

        // meminta pengguna memasukkan nominal belanja
        System.out.print("Masukkan nominal belaja: Rp");
        double jumlah = input.nextDouble();

        //membuat array berisi beberapa objek metode pembayaran
        MetodePembayaran[] metode = {
                new Tunai(),
                new KartuKredit(),
                new EWallet(),
                new KartuKredit(),
        };
        // Menyiapkan variabel untuk mencari total bersih terkecil
        double totalBersihMinimum = Double.MAX_VALUE;
        String metodeTerbaik = "";

        System.out.println("\n==== RINCIAN PEMBAYARAN ====");

        // Melakukan perulangan untuk setiap metode pembyaran
        for (MetodePembayaran pembayaran : metode) {

             //memproses pembayran menggunakan polymorphism
            pembayaran.prosesPembayaran(jumlah);

            //nilai awal cashback adalah 0
            double cashback = 0;

            //memeriksa apakah objek mengimplementasikan interface bisacashback
            if (pembayaran instanceof BisaCashback) {

                //Melakukan casting ke tipe Bisacashback
                BisaCashback cb = (BisaCashback) pembayaran;

                //menghitung cashback berdasarkan jumlah belanja
                cashback = cb.hitungCashback(jumlah);

                System.out.println("Cashback          : Rp" + cashback);
            }
            //menghitung total bersih setelah dikurangi cashback
            double totalBersih =
                    jumlah + pembayaran.hitungBiayaAdmin(jumlah)
                    - cashback;

            System.out.println("Total Bersih      : Rp" + totalBersih);
            System.out.println("-------------------------------------------");

            //membandikan total bersih untuk mencari yang terkecil
            if (totalBersih < totalBersihMinimum) {
                totalBersihMinimum = totalBersih;
                metodeTerbaik = pembayaran.namaMetode;
            }
            }

            //membandingkan metode pembayaran dengan total bersih terkecil
            System.out.println("\n===== METODE TERBAIK =====");
            System.out.println("Metode Pembayaran      : " + metodeTerbaik);
            System.out.println("Total Bersih           : Rp" + totalBersihMinimum);

            //menutup Scanner setelah selesai digunakan
            input.close();



    }
}
