import java.util.ArrayList;
import java.util.List;

public class soal2_sample2 {
    public static void main(String[] args) {
        String input = "1122"; //sebuah string input
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
