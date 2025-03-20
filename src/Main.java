import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Radix sort
        RadixSort rs = new RadixSort();
        String[] arr = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "amaterasu",
                "amazon", "puppy", "hydra", "amazonia", "vueltiao"};
        String[] arr2 = {"peter", "jayden", "chris", "navi"};
        String [] arr3 = {"Google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "Amaterasu",
                "Amazon", "puppy", "hydra", "Amazonia", "vueltiao"};
        rs.radixSort(arr);
        rs.radixSort(arr2);
        rs.radixSort(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        //Word Pattern
        WordPattern wp = new WordPattern();
        String pattern = "abba";
        char delimiter = '?';
        String s = "dog?cat?cat?dog";

        String pattern2 = "abba";
        char delimiter2 = '|';
        String s2 = "apple|banana|grape|apple";

        String pattern3 = "aaaa";
        char delimiter3 = ',';
        String s3 = "dog,cat,cat,dog";

        String pattern4 = "adxp";
        char delimiter4 = ' ';
        String s4 = "ice cream taco day";

        System.out.println(wp.isFollowPattern(pattern,delimiter,s));
        System.out.println(wp.isFollowPattern(pattern2,delimiter2,s2));
        System.out.println(wp.isFollowPattern(pattern3,delimiter3,s3));
        System.out.println(wp.isFollowPattern(pattern4,delimiter4,s4));

        //Sum target
        sumTarget sum = new sumTarget();
        int[] num = {1, 2, 3, 7, 5};
        int[] result1 = sum.findSumTarget(num,12);
        int[] result2 = sum.findSumTarget(num,5);
        int[] result3 = sum.findSumTarget(num,7);
        int[] result4 = sum.findSumTarget(num,11);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
        System.out.println(Arrays.toString(result4));





    }

}