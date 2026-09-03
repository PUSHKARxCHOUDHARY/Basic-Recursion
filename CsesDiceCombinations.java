import java.util.Arrays;
import java.util.Scanner;

public class CsesDiceCombinations {

    static long solve(long n, long[] memo) {
        long mod = 1000000007;
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (memo[(int) n] != -1L)
            return memo[(int) n];

        return memo[(int) n] =
                (solve(n - 1, memo)
              + solve(n - 2, memo)
              + solve(n - 3, memo)
              + solve(n - 4, memo)
              + solve(n - 5, memo)
              + solve(n - 6, memo))%mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long[] memo = new long[(int) n + 1];
        Arrays.fill(memo, -1L);

        System.out.println(Math.abs(solve(n, memo)));

        sc.close();
    }
}