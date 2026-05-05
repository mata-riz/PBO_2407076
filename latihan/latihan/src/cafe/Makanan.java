package cafe;

class Makanan extends Menu {
    private String jenis;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    @Override
    public void detailMenu() {
        System.out.println("Makanan: " + getNama() +
                           " | Jenis: " + jenis +
                           " | Harga: " + (int)getHarga());
    }
}