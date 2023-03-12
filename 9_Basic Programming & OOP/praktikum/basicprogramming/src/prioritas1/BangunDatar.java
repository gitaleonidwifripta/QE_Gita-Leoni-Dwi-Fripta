
package prioritas1;
public class BangunDatar {
        public static void main(String[] args) {
            // segitiga
            float alas = 20;
            float tinggi = 25;

            // hitung luas segitiga
            float luasSegitiga = 0.5f * alas * tinggi;
            System.out.println("Luas segitiga: " + luasSegitiga);

            // persegi panjang
            float panjang = 40;
            float lebar = 6;

            // hitung luas persegi panjang
            float luasPersegiPanjang = panjang * lebar;
            System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

            // lingkaran
            double jari2 = 7;

            // hitung luas lingkaran
            double luasLingkaran = Math.PI * jari2 * jari2;
            System.out.println("Luas lingkaran: " + luasLingkaran);
        }


}
