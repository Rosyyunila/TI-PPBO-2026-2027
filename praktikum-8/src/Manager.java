public class Manager extends Pegawai {
    private  double tujunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tujunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor pegawai
        this.tujunjanganJabatan = tujunjanganJabatan;
    }
}
