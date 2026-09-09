/*
* Nama program : KalkulatorBangunDatar
* Jenis        : Kalkulator Bangun Datar
* Input        : panjang, lebar, dan jari-jari
* Deskripsi    : Program untuk menghitung luas dan keliling persegi panjang
*                serta lingkaran berdasarkan jari-jari, program juga menentukan
*                apakah luas persegi panjang lebih besar dari 100 menggunakan tipe boolean.
* Bahasa       : Java
 */

import java.util.Scanner;
public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        //membuat objek scannner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        //meminta input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang= input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        //menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        //menghitung keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        //menampilkan hasil perhitungan persegi panjang
        System.out.println("\n=== HASIL PERSEGI PANJANG ===");
        System.out.println("Luas         : " + luasPersegiPanjang);
        System.out.println("Keliling     : " + kelilingPersegiPanjang);

        //menentukan apakah luas persegi panjang lebih besar dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        //menampilkan nilai boolean luasBesar
        System.out.println("Luas > 100 : " + luasBesar);

        //meminta input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        //menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jariJari * jariJari;

        //menghitung keliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jariJari;

        //menampilkan hasil perhitungan lingkaran
        System.out.println("\n=== HASIL LINGKARAN ===");
        System.out.println("Luas       : " + luasLingkaran);
        System.out.println("Keliling   : " + kelilingLingkaran);

        //menutup Scanner
        input.close();
    }

}
