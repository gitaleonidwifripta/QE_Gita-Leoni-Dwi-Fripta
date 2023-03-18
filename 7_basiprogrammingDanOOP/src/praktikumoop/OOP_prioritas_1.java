package praktikumoop;

public class OOP_prioritas_1 {
    private String nama;
    private String deskripsi;
    private int harga;
    private int jumlahStok;

    public OOP_prioritas_1(String nama, String deskripsi, int harga, int jumlahStok) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }


    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    // Setter methods
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    // Method to get product information
    public void getInfo() {
        System.out.println("nama: " + nama);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Harga: " + harga);
        System.out.println("JumlahStok: " + jumlahStok);
    }


    public static void main(String[] args) {
        System.out.println("===");
        System.out.println("Info product");
        OOP_prioritas_1 p = new OOP_prioritas_1("Coffe", "This is coffee", 15000, 10);
        OOP_prioritas_1 q = new OOP_prioritas_1("Milk", "This is fresh milk", 25000, 10);
        OOP_prioritas_1 r = new OOP_prioritas_1("Apple juice", "This is juice", 18000, 20);
        p.getInfo();
        q.getInfo();
        r.getInfo();
        System.out.println("===");
    }

}
