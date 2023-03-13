package praktikumbasic;

public class BP_prioritas1_No_2_sampel1 {
    public static void main(String[] args) {
        int hargaBeli = 15000;
        int hargaJual = 30000;

        // hitung keuntungan atau kerugian
        int selisih = hargaJual - hargaBeli;

        if (selisih > 0) {
            System.out.println("Untung sebesar: " + selisih);
        } else if (selisih < 0) {
            System.out.println("Rugi sebesar: " + Math.abs(selisih));
        } else {
            System.out.println("Sama saja");
        }
    }
}
