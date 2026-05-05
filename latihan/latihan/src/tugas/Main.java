package tugas;

public class Main {
    public static void main(String[] args) {
        // Menggunakan satu tipe variabel (BangunDatar) untuk berbagai objek
        BangunDatar bangun;

        // Contoh Bangun Datar Default
        bangun = new BangunDatar(3.0, 4.0);
        bangun.tampilkan();
        System.out.println();

        // Objek Persegi
        bangun = new Persegi(5.0);
        bangun.tampilkan();
        System.out.println();

        // Objek Persegi Panjang
        bangun = new PersegiPanjang(6.0, 4.0);
        bangun.tampilkan();
        System.out.println();

        // Objek Segitiga
        bangun = new Segitiga(10.0, 8.0);
        bangun.tampilkan();
    }
}
