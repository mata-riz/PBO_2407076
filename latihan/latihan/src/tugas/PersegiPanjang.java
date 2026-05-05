package tugas;

public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar); // Menggunakan constructor 2 parameter
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("======================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("======================");
    }
}