public class PegawaiDemo {
    public static void main(String[] args) {

        Manager manager = new Manager("Andi", "M001", 8000000, 2000000);

        Staff staff = new Staff("Budi", "S001",4000000,1000000);

        Direktur direktur = new Direktur("Rosy", "D001", 15000000,5000000,
                3000000);
        System.out.println("==== DATA MANAGER ===");
        manager.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + manager.getTunjanganJabatan());

        System.out.println("\n=== DATA STAFF ===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja: " + staff.getTunjanganKinerja());

        System.out.println("\n=== DATA DIREKTUR ===");
        direktur.tampilkanData();
        System.out.println("Tunjangan Jabatan: " + direktur.getTunjanganJabatan());

        System.out.println("\n=== UJI VALIDASI GAJI ===");

        Pegawai pegawai = new Pegawai("Dedi", "P001", -5000000);
        pegawai.tampilkanData();

    }
}
