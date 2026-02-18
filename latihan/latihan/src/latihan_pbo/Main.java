package latihan_pbo;

// Class Persegi (Enkapsulasi)
class Persegi {
    private int panjang;
    private int lebar;

    // Method untuk menampilkan pesan pembuka
    void tampil() {
        System.out.println("=== Menghitung Persegi ===");
    }

    // Setter untuk Panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // Getter untuk Panjang
    public int getPanjang() {
        return panjang;
    }

    // Setter untuk Lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Getter untuk Lebar
    public int getLebar() {
        return lebar;
    }

    // Bonus: Method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}

// Class Utama
public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi();
        
        // Memasukkan nilai angka
        persegi1.setPanjang(9);
        persegi1.setLebar(10 );
        
        persegi1.tampil();
        System.out.println("Panjang : " + persegi1.getPanjang());
        System.out.println("Lebar   : " + persegi1.getLebar());
        System.out.println("Luas    : " + persegi1.hitungLuas());
    }
}