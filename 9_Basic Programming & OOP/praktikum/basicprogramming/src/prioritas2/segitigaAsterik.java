package prioritas2;

import java.util.Scanner;

public class segitigaAsterik {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan jumlah baris segitiga: ");
            int n = input.nextInt();

            for (int a = 0; a < n; a++) {
                for (int j = n - a; j > 1; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= a; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
