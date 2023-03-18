import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soal1_sample2 {
    public static void main(String[] args) {
        String[] arr1 = {"lee", "jin"};
        String[] arr2 = {"kazuya", "panda"};

        List<String> mergedList = new ArrayList<>(Arrays.asList(arr1));
        for (String s : arr2) {
            if (!mergedList.contains(s)) {
                mergedList.add(s);
            }
        }

        String[] mergedArr = mergedList.toArray(new String[0]);

        System.out.println(Arrays.toString(mergedArr));
    }
}
