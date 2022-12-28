package final_herawati;
import java.util.Scanner;
class HitungLuas{
    int panjang;
    int lebar;
    int tinggi;
    int alas;
    double phi;
    double jari;
    double luas;
    
    Scanner masukkan = new Scanner(System.in);
    
    
   
//Nama : Herawati
//NIM : D0221069
    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    void LuasPersegi(){
        double luas = panjang * lebar * tinggi;
        System.out.println("hasil = " + luas);
        
    }
    void LuasSegitiga(){
        double luas = alas * tinggi / 2;
        System.out.println("hasil = " + luas);
    } 
    void LuasLingkaran(){
        double luas = phi * jari * jari;
        System.out.println("hasil = " + luas);
    }
    
}
class Volume extends HitungLuas{
    
    void VolumeTabung(){
        double volume = phi * jari * jari * tinggi;
        System.out.println("hasil :" + volume);
    }
    void VolumeBalok(){
        double volume = panjang * lebar * tinggi;
        System.out.println("hasil :" + volume);
    }
    void VolumeSegitiga(){
        double volume = alas * tinggi / 2;
        System.out.println("hasil :" + volume);
    }
    

}


public class Final_Herawati {

    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);
        System.out.println("Objek untuk hitung luas");
        HitungLuas luas = new HitungLuas();
        
        luas.setPanjang(4);
        System.out.println("panjang :" + luas.getPanjang());
        
        luas.setAlas(3);
        System.out.println("Alas :" + luas.getAlas());
        
        
        
        luas.setLebar(6);
        System.out.println("Lebar" +luas.getLebar());
        
        luas.setTinggi(8);
        System.out.println("Luas :" +luas.getTinggi());
        
        luas.setJari(3.12);
        System.out.println("Jari-jari :" + luas.getJari());
        
        luas.setPhi(22/7);
        System.out.println("Phi :" + luas.getPhi());
        
        System.out.println("");
        System.out.println("objek untuk volume");
        Volume hitung = new Volume();
        
        hitung.setPanjang(4);
        System.out.println("panjang :" + hitung.getPanjang());
        
        hitung.setAlas(3);
        System.out.println("Alas :" + hitung.getAlas());
        
        hitung.setLebar(6);
        System.out.println("Lebar" +hitung.getLebar());
        
        hitung.setTinggi(8);
        System.out.println("Luas :" +hitung.getTinggi());
        
        hitung.setJari(3.12);
        System.out.println("Jari-jari :" + hitung.getJari());
        
        hitung.setPhi(22/7);
        System.out.println("Phi :" + hitung.getPhi());
        
        System.out.println("");
        while(true){

            System.out.println("<--- Menu ---> :");
            System.out.println("1. Hitung Luas");
            System.out.println("2. Volume");
            System.out.println("0. Keluar");

            
            System.out.print("Pilih Menu :");
            int pilihan = masukkan.nextInt();
            
            if (pilihan == 1){
                while(true){
                    System.out.println("Hitung luas :");
                    System.out.println("1. Luas persegi");
                    System.out.println("2. Luas segitiga");
                    System.out.println("3. Luas lingkaran");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan Menu :");
                    int mn = masukkan.nextInt();
                    
                    if (mn == 1){
                        luas.LuasPersegi();
                    }else if (mn == 2){
                        luas.LuasSegitiga();
                    }else if (mn == 3){
                        luas.LuasLingkaran();
                    }else if (mn == 4){
                        break;
                        
                    }else{
                        System.out.println("Menu salah");
                    }
                    
                    
                }
                
            }else if (pilihan == 2){
                while(true){
                    System.out.println("Hitung volume :");
                    System.out.println("1. volume tabung");
                    System.out.println("2. Luas balok");
                    System.out.println("3. Luas segitiga");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan Menu :");
                    int mn = masukkan.nextInt();
                    
                    if (mn == 1){
                        hitung.VolumeTabung();
                    }else if (mn == 2){
                        hitung.VolumeBalok();
                    }else if (mn == 3){
                        hitung.VolumeSegitiga();
                    }else if (mn == 4){
                        break;
                    
                    }
                        
                }
            }else if (pilihan == 0){
                break;
                
            }else{
                System.out.println("Menu salah");
            }
        
    }
    
}
}
