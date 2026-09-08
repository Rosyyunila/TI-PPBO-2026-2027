import java.util.Scanner;
public class ConversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan suhu dalam celcius: ");
        double celcius = sc.nextDouble();

        double fahrenheit = celcius * 9/5 + 32;
        System.out.println(celcius + " derajat" + fahrenheit + "derajat");

    }
}
