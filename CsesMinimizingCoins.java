import java.util.*;

public class CsesMinimizingCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int[] dp = new int[x + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int sum = 1; sum <= x; sum++) {
            for (int coin : coins) {
                if (sum >= coin && dp[sum - coin] != Integer.MAX_VALUE) {
                    dp[sum] = Math.min(dp[sum], dp[sum - coin] + 1);
                }
            }
        }

        System.out.println(dp[x] == Integer.MAX_VALUE ? -1 : dp[x]);
    }
}