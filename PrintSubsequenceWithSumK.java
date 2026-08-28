import java.util.ArrayList;

public class PrintSubsequenceWithSumK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;

        printSubsequence(0, arr, new ArrayList<>(), 0, k);
    }

    static void printSubsequence(int idx, int[] arr,
                                 ArrayList<Integer> ds,
                                 int sum, int k) {

        if (idx == arr.length) {
            if (sum == k) {
                System.out.println(ds);
            }
            return;
        }

        // Pick
        ds.add(arr[idx]);
        printSubsequence(idx + 1, arr, ds, sum + arr[idx], k);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Not Pick
        printSubsequence(idx + 1, arr, ds, sum, k);
    }
}