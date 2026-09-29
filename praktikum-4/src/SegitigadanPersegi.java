import java.util.Scanner;
public class SegitigadanPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran: ");
        int ukuran = input.nextInt();

        System.out.println("\n=== SEGITIGA TERBALIK ===");

        for (int baris = ukuran; baris >= 1; baris --) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n=== PERSEGI ===");
        for (int baris = 1; baris <= ukuran; baris++) {
            for (int kolom =1; kolom <= ukuran; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
