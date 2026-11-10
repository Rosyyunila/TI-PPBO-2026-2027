public class Manager extends Pegawai {
    private  double tunjanganJabatan;

    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
    public void tampilkanRingkasan() {
        System.out.println("Manager: " + nama); //ERROR jika private
    }
    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }
}
