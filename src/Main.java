import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RadixSort rs = new RadixSort();
        String[] arr = {"google", "gojo", "amazingly", "jogo", "luna", "pup", "solas", "solo", "pupperino", "amaterasu",
                "amazon", "puppy", "hydra", "amazonia", "vueltiao"};
        String[] arr2 = {"peter", "jayden", "chris", "navi"};
        rs.radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }

}