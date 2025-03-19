import java.util.*;
public class RadixSort {
    private static int getMaxStringLength(String[] arr) {
        int maxLength = 0;
        for (String s : arr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }

    private static void countSort(String[] arr, int charIndex) {
        int n = arr.length;
        Map<Integer, List<String>> buckets = new HashMap<>();

        // 53 buckets: 1-26 for A - Z, 27-52 for a-z, 0 for short words.
        for (int i = 0; i < 53; i++) {
            buckets.put(i, new ArrayList<>());
        }

        for (String s : arr) {
            int bucketIndex;
            if (charIndex < s.length()) {
                char ch = s.charAt(charIndex);
                if (Character.isUpperCase(ch)) {
                    bucketIndex = ch - 'A' + 1;
                } else if (Character.isLowerCase(ch)) {
                    bucketIndex = ch - 'a' + 27;
                } else {
                    bucketIndex = 0;
                }
            } else {
                bucketIndex = 0; //this bucket handles the short words.
            }
            buckets.get(bucketIndex).add(s); //add
        }

        int index = 0;
        for (int i = 0; i < 53; i++) {
            List<String> bucket = buckets.get(i);
            for (String word : bucket) {
                arr[index++] = word;
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
