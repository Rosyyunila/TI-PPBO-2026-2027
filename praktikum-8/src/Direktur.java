public class Direktur extends Manager {
    private double tunjanganSaham;

    public Direktur(String nama, String nip, double gajipokok,
                    double tunjanganJabatan, double tunjanganSaham) {
        super(nama, nip, gajipokok, tunjanganJabatan);
        this.tunjanganSaham= tunjanganSaham;
    }

}
