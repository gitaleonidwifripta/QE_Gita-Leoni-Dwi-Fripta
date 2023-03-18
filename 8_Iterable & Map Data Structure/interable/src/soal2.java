//program variable string berisi kumpulan angka
//output merupakan list/array berisi angka yang hanya muncul 1 kali
import java.util.*;      //karena menggunakan ArrayList maka perrlu import java.util.*
public class soal2 {     //sebuah kelas dengan nama soal2
        public static void main(String[] args) {
            String input = "76523752"; //sebuah string input
            List<Integer> uniqueNumbers = findUniqueNumbers(input);
            System.out.println(uniqueNumbers); // Output: [6, 3]
        }
        public static List<Integer> findUniqueNumbers(String input) {
            List<Integer> uniqueNumbers = new ArrayList<>();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
                    uniqueNumbers.add(Character.getNumericValue(currentChar));
                }
            }
            return uniqueNumbers;
        }

}
