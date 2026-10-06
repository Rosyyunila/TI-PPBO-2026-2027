public class OverloadingKonversiSuhu {
    static double KonversiSuhu(double celcius) {
        return (celcius * 9 / 5) + 32;
    }
    static double KonversiSuhu(double celcius, String SkalaTujauan) {
        if (SkalaTujauan.equalsIgnoreCase("Kelvin")) {
            return celcius + 273.15;
        } else if (SkalaTujauan.equalsIgnoreCase("Fahrenheit")) {
            return (celcius * 9 / 5) + 32;
        } else {
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println("celcius ke Fahrenheit: " + KonversiSuhu(25));
        System.out.println("celcius ke Kelvin: " + KonversiSuhu(25, "Kelvin"));
        System.out.println("celcius ke Fahrenheit: " + KonversiSuhu(25, "Fahrenheit"));
    }
}
