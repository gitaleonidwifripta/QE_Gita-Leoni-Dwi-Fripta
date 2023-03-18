package praktikumoop;

public class OOP_prioritas_2 {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4;
        add(num1, num2);

        int num3 = 15, num4 = 4;
        substract(num3, num4);

        int num5 = 10, num6 = 10;
        multiply(num5, num6);

        int num7 = 12, num8 = 3;
        divide(num7, num8);
    }

    public static void add(int a, int b) {
        int result = a + b;
        System.out.println("Penjumlahan: " + result);
    }

    public static void substract(int a, int b) {
        int result = a - b;
        System.out.println("Pengurangan: " + result);
    }

    public static void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Perkalian: " + result);
    }

    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println("Pembagian: " + result);
    }
}
