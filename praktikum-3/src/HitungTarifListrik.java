import java.util.Scanner;
public class HitungTarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM HITUNG TARIF LISTRIK ===");

        System.out.print("Masukkan golongan daya (450/900/1300/2200 VA): ");
        int golongan = input.nextInt();

        System.out.print("Masukkan jumlah pemaakaian listrik (kwh): ");
        double kwh = input.nextDouble();

        double tarif;

        if (kwh <= 0) {
            System.out.println("Error: Jumlah pemakaian khw harus lebih dari 0.");
            return;
        }

        switch (golongan) {
            case 450:
                tarif =415;
                break;
            case 900:
                tarif =605;
                break;
            case 1300:
                tarif =1444.70;
                break;
            case 2200:
                tarif =1444.70;
                break;
            default:
                System.out.println("Error: Golongan daya tidak valid.");
              return;
        }
        double totalTagihan = kwh * tarif;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Golongan daya : " + golongan + " VA");
        System.out.println("Pemakaian     : " + kwh + " kwh");
        System.out.println("Tarif per kwh : Rp" + tarif );
        System.out.println("Total tagihan : Rp" + totalTagihan);
    }
}

