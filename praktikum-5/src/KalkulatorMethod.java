import java.util.Scanner;
public class KalkulatorMethod {

    // Method tambah dengan 2 parameter
    static double tambah(double a, double b) {
        return a + b;
    }

    //Method tambah dengan 3 parameter (overloading)
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    // Method pengurangan
    static double kurang(double a, double b) {
        return a - b;
    }

    // Method perkalian
    static double kali(double a, double b) {
        return a * b;
    }

    // Method pembagian
    static double bagi(double a, double b) {
        return a / b;
    }

    //Method perpangkatan
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    //Method akar kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    //Method untuk mencari hasil terbesar dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil) {
        double maksimum = riwayatHasil[0];

        for (int i = 1; i < riwayatHasil.length; i++) {
            if (riwayatHasil[i] > maksimum) {
                maksimum = riwayatHasil[i];
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array untuk menyimpan hasil perhitungan
        double[] riwayatHasil = new double[100];
        int jumlahRiwayat = 0;

        int pilihan;

        //Menu akan terus muncul sampai pengguna memilih keluar
        do {
            System.out.println("\n KALUKALTOR METHOD ===");
            System.out.println("1. tambah 2 angka");
            System.out.println("2. tambah 3 angka");
            System.out.println("3. kurang");
            System.out.println("4. kali");
            System.out.println("5. bagi");
            System.out.println("6. pangkat");
            System.out.println("7. akar kuadrat");
            System.out.println("0. keluar");
            System.out.println("pilih operasi: ");
            pilihan = sc.nextInt();

            double a, b, hasil;
            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    hasil = tambah(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    System.out.print("Masukkan angka ketiga: ");
                    double c = sc.nextDouble();

                    hasil = tambah(a, b, c);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    hasil = kurang(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 4:
                    System.out.print("Masukkan angka pertama");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua");
                    b = sc.nextDouble();

                    hasil = kali(a, b);
                    System.out.println("Hasil: " + hasil);
                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = sc.nextDouble();

                    if (b != 0) {
                        hasil = bagi(a, b);
                        System.out.println("Hasil: " + hasil);
                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    } else {
                        System.out.println("Tidak dapat membagi dengan 0.");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan bilangan: ");
                    a = sc.nextDouble();

                    System.out.print("Masukkan pangkat: ");
                    b = sc.nextDouble();

                    hasil = pangkat(a, b);
                    System.out.println("Hasil: " + hasil);

                    riwayatHasil[jumlahRiwayat] = hasil;
                    jumlahRiwayat++;
                    break;

                case 7:
                    System.out.print("Masukkan bilangan: ");
                    a = sc.nextDouble();

                    if (a >= 0) {
                        hasil = akarKuadrat(a);
                        System.out.println("Hasil: " + hasil);

                        riwayatHasil[jumlahRiwayat] = hasil;
                        jumlahRiwayat++;
                    } else {
                        System.out.println("Akar kuadrat bilangan negatif tidak dapat dihitung.");
                    }
                    break;
                case 0:
                    System.out.println("\nProgram selesai.");
                    //Menampilkan hasil maksimum dari seluruh riwayat
                    if (jumlahRiwayat > 0) {
                        double[] dataRiwayat = new double[jumlahRiwayat];

                        for (int i = 0; i < jumlahRiwayat; i++) {
                            dataRiwayat[i] = riwayatHasil[i];
                        }
                        System.out.println("Hasil terbesar dari riwayat:" + riwayatKeMaksimum(dataRiwayat));

                    } else {
                        System.out.println("Belum ada perhitungan yang dilakukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
            } while (pilihan != 0);
            sc.close();

    }
}