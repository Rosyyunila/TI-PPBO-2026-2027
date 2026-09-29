import java.util.Scanner;
public class Matriks3x3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int total = 0;
        System.out.println("=== INPUT MATRIKS 3x3 ===");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print("Masukkan elmen [" + baris + "][" + kolom + "]: ");
                matriks[baris][kolom] = input.nextInt();
            }
        }
        System.out.println("\n=== MATRIKS ===");

        for (int baris = 0; baris < 3; baris++) {
            for (int kolom = 0; kolom < 3; kolom++) {
                System.out.print(matriks[baris][kolom] + " ");
            }
            System.out.println();
        }
        System.out.println("\n=== JUMLAH setiap baris ===");
        for (int baris = 0; baris < 3; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < 3; kolom++) {
                jumlahBaris += matriks[baris][kolom];
                total += matriks[baris][kolom];
            }
            System.out.println("jumlah baris " + (baris + 1) + " = " + jumlahBaris);
        }
        System.out.println("Jumlah seluruh elemen = " + total);
    }
}

