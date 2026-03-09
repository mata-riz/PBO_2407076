package tugas3;

import java.util.Scanner;

class Cafe {
    private String namaMenu;
    private String bahan1;
    private String bahan2;
    private String bahan3;

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setResep() {
        // Menggunakan switch case (lebih rapi untuk Java modern)
        switch (namaMenu.toLowerCase()) {
            case "mocafino":
                bahan1 = "1 shot espresso";
                bahan2 = "2 oz foam (setengah lot)";
                bahan3 = "1 sendok coklat bubuk";
                break;
            case "espresso":
                bahan1 = "1 shot espresso (30 ml)";
                bahan2 = "Tidak ada";
                bahan3 = "Tidak ada";
                break;
            case "cappuccino":
                bahan1 = "1 shot espresso";
                bahan2 = "1 oz susu steamed";
                bahan3 = "1 oz foam";
                break;
            case "latte":
                bahan1 = "1 shot espresso";
                bahan2 = "3 oz susu steamed";
                bahan3 = "tipis foam";
                break;
            case "americano":
                bahan1 = "1 shot espresso";
                bahan2 = "3 oz air panas";
                break;
            default:
                bahan1 = "Resep tidak tersedia";
                bahan2 = "-";
                bahan3 = "-";
                break;
        }
    }

    public void tampilResep() {
        System.out.println("\n=== RESEP MINUMAN ===");
        System.out.println("Menu       : " + namaMenu);
        System.out.println("Bahan 1    : " + bahan1);
        System.out.println("Bahan 2    : " + (bahan2 != null ? bahan2 : "-"));
        System.out.println("Bahan 3    : " + (bahan3 != null ? bahan3 : "-"));
        System.out.println("=====================");
    }
}

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.println("===== PROGRAM RESEP KOPI =====");
        System.out.print("Masukkan nama menu (Mocafino, Espresso, Cappuccino, Latte, Americano): ");
        String menu = input.nextLine();

        cafe.setNamaMenu(menu);
        cafe.setResep();
        cafe.tampilResep();

        input.close();
    }
}
