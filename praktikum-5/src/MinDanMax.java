import java.util.Scanner;
public class MinDanMax {
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
static int cariNilaiMaksimum(int[] data) {
        int max = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
}
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah nilai ujian: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
            System.out.print("Nilai minimum: " + cariNilaiMinimum(nilai));
            System.out.println();
            System.out.print("Nilai maksimum: " + cariNilaiMaksimum(nilai));
        }
}
