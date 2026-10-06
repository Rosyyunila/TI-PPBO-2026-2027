import java.util.Scanner;
public class NilaiRatarata {
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }
    static int[] filterDiatasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }
        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }
        return hasil;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah data: ");
        int n = sc.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = sc.nextInt();
        }
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        int[] hasil = filterDiatasRataRata(data);

        System.out.print("Data di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }

    }
}
