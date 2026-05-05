package cafe;

class Menu {
    private String nama;
    private double harga;

    // Constructor
    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Overloading constructor
    public Menu() {
        this.nama = "Unknown";
        this.harga = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void detailMenu() {
        System.out.println(nama + " - " + harga);
    }
}