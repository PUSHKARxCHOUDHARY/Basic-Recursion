public class CountSubsetWithSumK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                     11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int k = 30;

        System.out.println(solve(0, 0, arr, k));
    }

    private static int solve(int idx, int sum, int[] arr, int k) {

       
        if (idx == arr.length) {
            if(sum==k){
                return 1;
            }
            return 0;
        }

       
        int pick = solve(idx + 1, sum + arr[idx], arr, k);

      
        int notPick = solve(idx + 1, sum, arr, k);

        return pick + notPick;
    }
}