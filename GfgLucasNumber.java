import java.util.Arrays;

public class GfgLucasNumber {
    //tabulation
    class Solution {
    static final long MOD = 1000000007L;

    public long lucas(long n) {
        if (n == 0) return 2;
        if (n == 1) return 1;

        long[] dp = new long[(int)n + 1];

        dp[0] = 2;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }

        return dp[(int)n];
    }
}
//memorization
class Solution {

    static final long MOD = 1000000007L;

    public long lucas(long n) {
        long[] memo = new long[(int) n + 1];
        Arrays.fill(memo, -1);

        return solve((int) n, memo);
    }

    private long solve(int n, long[] memo) {
        if (n == 0) return 2;
        if (n == 1) return 1;

        if (memo[n] != -1) {
            return memo[n];
        }

        return memo[n] =
                (solve(n - 1, memo) + solve(n - 2, memo)) % MOD;
    }
}
    
}
