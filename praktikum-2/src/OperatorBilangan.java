import java.util.Scanner;
public class OperatorBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();

        //Operator Aritmatika
        System.out.println("penjumlahan: " + ( a + b));
        System.out.println("pengurangan: " + ( a - b));
        System.out.println("perkalian: " + ( a * b));
        System.out.println("pembagian: " + ( a / b));
        System.out.println("modulus: " + ( a % b));

        //Operator perbandingan
        System.out.println("a > b: " + ( a > b));
        System.out.println("a < b: " + ( a < b));
        System.out.println("a == b: " + ( a == b));

        sc.close();




    }
}
