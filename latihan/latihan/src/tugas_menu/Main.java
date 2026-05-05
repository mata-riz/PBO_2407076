package tugas_menu;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari MenuItem
        MenuItem pesanan1 = new MenuItem("Nasi Goreng", 15000, 2);
        MenuItem pesanan2 = new MenuItem("Es Teh Manis", 5000, 3);

        System.out.println("=== NOTA PEMESANAN ===");
        
        pesanan1.tampilkan();
        System.out.println("----------------------");
        
        pesanan2.tampilkan();
        System.out.println("----------------------");

        // Menghitung total keseluruhan
        double grandTotal = pesanan1.hitungTotal() + pesanan2.hitungTotal();
        System.out.println("GRAND TOTAL: " + grandTotal);
        System.out.println("======================");
    }
}
