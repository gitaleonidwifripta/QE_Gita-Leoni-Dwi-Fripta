package prioritas1;
public class hasilpenjualan {
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
