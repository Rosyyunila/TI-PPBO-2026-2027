public class BankDemo {
    public static void main(String[] args) {

        RekeningBank rek1 = new RekeningBank(
                "001",
                        "Budi",
                        100000,
                        "Tabungan"

        );
        RekeningBank rek2 = new RekeningBank(
                "002",
                "Siti",
                200000,
                "Giro"
        );
        System.out.println("=== SKENARIO 1: SETOR ===");
        rek1.setor(50000);
        rek2.setor(100000);

        System.out.println("=== SKENARIO 2: TARIK ===");
        rek1.tarik(30000);
        rek2.tarik(50000);

        System.out.println("\n=== SKENARIO 3: TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 50000);

        System.out.println("\n=== SKENARIO 4: TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 500000);

        System.out.println("\n=== MUTASI AKHIR REKENING 1 ===");
        rek1.cetakMutasi();

        System.out.println("\n=== MUTASI AKHIR REKENING 2 ===");
        rek2.cetakMutasi();


    }
}
