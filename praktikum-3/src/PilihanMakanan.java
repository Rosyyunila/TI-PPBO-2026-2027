import java.util.Scanner;
public class PilihanMakanan {
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Menu Makanan ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Sate Ayam");

        System.out.println("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            case 4:
                System.out.println("Anda memilih Sate Ayam");
                break;
            default:
                System.out.println("Pilihan tidak valid");


        }
    }

}
