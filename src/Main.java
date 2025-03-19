import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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

    }

}