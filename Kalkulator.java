package kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        //kalkulator sederhana mengoperasikan 2 bilangan

        int angka1,angka2,pilihan;
        double hasil;
        String lanjut;
        
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan angka pertama :");
        angka1 = masukkan.nextInt();
        System.out.print("Masukkan angka kedua :");
        angka2 = masukkan.nextInt();
        
            System.out.println("Pilih operasi :");
            System.out.println("1. penjumlahan [+]");
            System.out.println("2. pengurangan [-]");
            System.out.println("3. perkalian [*]");
            System.out.println("4. pembagian[/]");

            System.out.print("Masukkan nomor operator pilihan anda :");
            pilihan = masukkan.nextInt();
            if (pilihan == 1){
                hasil = angka1 + angka2;
                    System.out.println("Hasil operasi angka1 + angka2 = " + hasil);
            }else if (pilihan == 2){
                hasil = angka1 - angka2;
                    System.out.println("Hasil operasi angka1 - angka2 = " + hasil);
            }else if (pilihan == 3){
                hasil = angka1 * angka2;
                    System.out.println("Hasil operasi angka1 * angka2 = " + hasil);
            }else if (pilihan == 4){
                hasil = angka1 / angka2;
                    System.out.println("Hasil operasi angka1 / angka2 = " + hasil);
            }else{
                System.out.println("Pilihan operasi tidak tersedia");
            }
            
        
    }
}
