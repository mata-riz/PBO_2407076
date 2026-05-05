package cafe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("KLAFE Cake & Coffee Factory");

        // Tambah menu
        cafe.tambahMenu(new Makanan("Nasi Ayam Goreng", 28000, "Berat"));
        cafe.tambahMenu(new Makanan("Chicken Rice Bowl", 26000, "Berat"));
        cafe.tambahMenu(new Minuman("Coffe Latte", 25000, "Small"));
        cafe.tambahMenu(new Minuman("Huzelnut Coffe", 21000, "Medium"));

        double total = 0;
        char lagi;

        do {
            cafe.tampilkanMenu();

            System.out.print("\nPilih menu (1-" + cafe.jumlahMenu() + "): ");
            int pilih = input.nextInt();

            if (pilih > 0 && pilih <= cafe.jumlahMenu()) {
                Menu m = cafe.getMenu(pilih - 1);

                // 🔥 KHUSUS MINUMAN → PILIH UKURAN
                if (m instanceof Minuman) {
                    System.out.println("Pilih ukuran:");
                    System.out.println("1. Small");
                    System.out.println("2. Medium (+2000)");
                    System.out.println("3. Large (+4000)");
                    System.out.print("Masukkan pilihan: ");
                    int ukuran = input.nextInt();

                    String size = "";
                    double tambahan = 0;

                    switch (ukuran) {
                        case 1:
                            size = "Small";
                            break;
                        case 2:
                            size = "Medium";
                            tambahan = 2000;
                            break;
                        case 3:
                            size = "Large";
                            tambahan = 4000;
                            break;
                        default:
                            size = "Small";
                    }

                    // buat object minuman baru sesuai ukuran
                    m = new Minuman(m.getNama(), m.getHarga() + tambahan, size);
                }

                total += m.getHarga();
                System.out.println("Kamu pilih: " + m.getNama());
            } else {
                System.out.println("Pilihan tidak valid!");
            }

            System.out.print("Tambah lagi? (y/n): ");
            lagi = input.next().charAt(0);

        } while (lagi == 'y');

        System.out.println("\nTotal bayar: " + (int)total);
    }
}