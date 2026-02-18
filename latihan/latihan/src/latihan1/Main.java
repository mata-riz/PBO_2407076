package latihan_pbo;

class Cafe {
    String nama;
    String alamat;
    String genre;
    
}

public class Main {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe();
        cafe1.nama = "Kopi Kenangan";
        cafe1.alamat = "Indramayu";
        cafe1.genre = "kopi";
        System.out.println("Nama cafe : " + cafe1.nama);
        System.out.println("Alamat di : " + cafe1.alamat);
        System.out.println("genre : " + cafe1.genre);
        System.out.println("-----------------------");


        Cafe cafe2 = new Cafe();
        cafe2.nama = "Kopi Kenangan";
        cafe2.alamat = "Indramayu";
        cafe2.genre = "kopi";
        System.out.println("Nama cafe : " + cafe2.nama);
        System.out.println("Alamat di : " + cafe2.alamat);
        System.out.println("genre : " + cafe2.genre);

        
    }
}
