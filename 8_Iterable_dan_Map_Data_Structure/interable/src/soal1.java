import java.util.*;
public class soal1 {

        public static void main(String[] args) {
            String[] arr1 = {"kazuya", "jin", "lee"};
            String[] arr2 = {"kazuya", "feng"};

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
