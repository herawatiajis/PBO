package tugas3pbo;
public class Menghitung {
    double luas;
    double phi;

    public Menghitung(double phi) {
        this.phi = phi;
    }
    
    public double persegi(double sisi){
        luas = sisi*sisi;
        return luas;
    }
    public double luas_lingkaran(int jari){
        luas = phi * jari * jari;
        return luas;
    }
    public double luas_segitiga(int alas, int tinggi){
        luas = 1/2 * alas * tinggi;
        return luas;
    }
    
    
    
    
}
