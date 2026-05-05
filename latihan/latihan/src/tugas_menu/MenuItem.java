package tugas_menu;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga); // Memanggil constructor dari class Menu
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        super.tampilkan(); // Memanggil tampilan dari class Menu
        System.out.println("Jumlah Beli: " + jumlah);
        System.out.println("Total Bayar: " + hitungTotal());
    }
}