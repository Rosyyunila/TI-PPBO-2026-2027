import java.util.Scanner;
public class NontonBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukka umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (ya/tidak): ");
        String status = input.next();

        int hargaTiket;
        if (status.equalsIgnoreCase("ya") && umur < 25) {
            hargaTiket = 25000;
            System.out.println("Mendapatkan harga khusus mahasiswa");
        } else {
            hargaTiket = 40000;
            System.out.println("Mendapatkan harga normal");
        }
        System.out.println("Harga tiket: Rp" + hargaTiket);
    }
}
