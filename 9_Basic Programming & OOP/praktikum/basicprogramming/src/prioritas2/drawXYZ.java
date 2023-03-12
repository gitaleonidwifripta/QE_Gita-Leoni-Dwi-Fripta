package prioritas2;

public class drawXYZ {
        public static void main(String[] args) {
            String[] pola =
                    {"X", "Z", "X", "Z", "Y",
                    "X", "Y", "Z", "X", "Z",
                    "Y", "X", "Y", "Z", "X",
                    "Z", "Y", "X", "Y", "Z",
                    "X", "Z", "Y", "X", "Y"};

            int counter = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(pola[counter] + " ");
                    counter++;
                }
                System.out.println();
            }
        }
}
