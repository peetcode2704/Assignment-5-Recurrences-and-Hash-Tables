import java.util.*;
public class RadixSort {
    private static int getMaxStringLength(String[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }

    private static void countSort(String[] arr, int charIndex) {
        int n = arr.length;
        Map<Integer, List<String>> buckets = new HashMap<>();
        //1-26 letters = 26 buckets and an extra empty space for the short words.
        for (int i = 0; i < 27; i++) {
            buckets.put(i, new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            String s = arr[i];
            int bucketIndex;
            if (charIndex < s.length()) {
                bucketIndex = s.charAt(charIndex) - 'a' + 1;
            } else {
                bucketIndex = 0;
            }
            buckets.get(bucketIndex).add(s);
        }

        int index = 0;
        for (int i = 0; i < 27; i++) {
            List<String> bucket = buckets.get(i);
            for (int j = 0; j < bucket.size(); j++) {
                arr[index++] = bucket.get(j);
            }
        }
    }

    public void radixSort(String[] arr) {
        int maxLength = getMaxStringLength(arr);
        for (int pos = maxLength - 1; pos >= 0; pos--) {
            countSort(arr, pos);
        }
    }

}
