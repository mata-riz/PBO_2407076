package tugas4;

public class jajargenjang extends bangun_datar {
    
    public double hitungLuas() {
        // Rumus: alas * tinggi (kita pakai lebar sebagai alas)
        return lebar * tinggi;
    }

    public double hitungKeliling() {
        // Rumus: 2 * (alas + sisi miring)
        return 2 * (lebar + sisi);
    }
}
