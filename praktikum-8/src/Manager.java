public class Manager extends Pegawai {
    private  double tujunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tujunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor pegawai
        this.tujunjanganJabatan = tujunjanganJabatan;
    }
    public void tampilkanRingkasan() {
        System.out.println("Manager: " + nama); //ERROR jika private
    }
}
