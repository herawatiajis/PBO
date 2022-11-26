package tugas3pbo;
import tugas3pbo.Menghitung;
import java.util.Scanner;
public class Tugas3Pbo {
    
    public static void main(String[] args) {
        System.out.println("Nama : Herawati");
        System.out.println("NIM : D0221069");
        //Menghitung luas persegi
        Scanner input = new Scanner(System.in);
        Menghitung perpanjang = new Menghitung(3.14);
        double luas;
        
        System.out.print("Masukkan nilai sisi :");
        double sisi = input.nextDouble();
        
        luas = perpanjang.persegi(sisi);
        System.out.println("Luas persegi adalah " + luas);
        
        //Menghitung luas lingkaran
        Menghitung lingkaran = new Menghitung(3.14);
        
        System.out.print("Masukkan nilai nilai jari-jari :");
        int jari = input.nextInt();
        
        luas = lingkaran.luas_lingkaran(jari);
        System.out.println("Luas lingkaran adalah " + luas);
        
        //Menghitung luas segitiga
        Menghitung segitiga = new Menghitung(3.14);
        
        System.out.print("Masukkan nilai nilai alas :");
        int alas = input.nextInt();
        System.out.print("Masukkan nilai nilai tinggi :");
        int tingi = input.nextInt();
        
        luas = segitiga.luas_segitiga(alas, tingi);
        System.out.println("Luas segitiga adalah " + luas);
        
    }
    
    
    
}
