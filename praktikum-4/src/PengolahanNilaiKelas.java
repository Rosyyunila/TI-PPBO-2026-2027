import java.util.Scanner;
public class PengolahanNilaiKelas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a.input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa:");
        int n= sc.nextInt();

        int[] nilai = new int[n];

        //input nilai mahasiswa
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i + 1) + ": ");
            nilai[i]= sc.nextInt();
        }
        //b. Menghitung rata-rata, niai tertinggi, terendah, dan jumlah lulus
        int total = 0;
        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        int jumlahLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
            if (nilai[i] >= 70) {
                jumlahLulus++;
            }
        }
        double rataRata = (double) total / n;
        int jumlahTidakLulus = n-jumlahLulus;

        //c. Sorting ascending menggunakan Bubble sort
        for (int i = 0; i < n -1; i++){
            for (int j = 0; j < n -1 -i; j++) {
                if(nilai[j] > nilai[j + 1]) {
                        int temp = nilai[j];
                        nilai[j] = nilai[j + 1];
                        nilai[j + 1] = temp;
                }
            }
        }
        // d. Menampilkan hasil
        System.out.println("\n======================================================");
        System.out.println("    HASIL PENGOLAHAN NILAI");

        System.out.println("Jumlah mahasiswa       :"   +n);
        System.out.println("Total nilai            :"+total);
        System.out.printf("Rata-rata kelas        : %.2f%n",rataRata);
        System.out.println("Nilai tertinggi        :"+ nilaiTertinggi);
        System.out.println("NilaiTerendah          :"+ nilaiTerendah);
        System.out.println("Jumlah mahasiswa lulus :"+ jumlahLulus);
        System.out.println("Jumlah tidak lulus     :"+ jumlahTidakLulus);

        System.out.println("\nNilai setelah diurutkan (ascending):");

        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-"+ (i + 1) + ": " + nilai[i]);
        }
        System.out.println("=========================================================");
    }
}
