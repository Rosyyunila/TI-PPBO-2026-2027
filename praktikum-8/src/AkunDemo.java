public class AkunDemo {
    public static void main(String[] args) {

        AkunPremium akun = new AkunPremium(
                "rosy",
                1000000,
                2000000
        );
        akun.cekLimit();
    }
}
