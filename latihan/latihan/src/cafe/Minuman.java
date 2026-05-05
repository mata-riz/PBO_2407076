package cafe;

class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println("Minuman: " + getNama() +
                           " | Ukuran: " + ukuran +
                           " | Harga: " + (int)getHarga());
    }
}