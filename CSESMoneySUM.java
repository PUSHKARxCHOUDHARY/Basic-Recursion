import java.util.*;

public class CSESMoneySUM {

    static boolean[][] dp;
    static int[] coins;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        coins = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            sum += coins[i];
        }

        dp = new boolean[n + 1][sum + 1];

        // Sum 0 is always possible
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Take / Don't Take
        for (int i = n - 1; i >= 0; i--) {

            for (int target = 1; target <= sum; target++) {

                boolean notTake = dp[i + 1][target];

                boolean take = false;

                if (coins[i] <= target) {
                    take = dp[i + 1][target - coins[i]];
                }

                dp[i][target] = take || notTake;
            }
        }

        // Count possible sums
        int count = 0;

        for (int target = 1; target <= sum; target++) {
            if (dp[0][target]) {
                count++;
            }
        }

        System.out.println(count);

        // Print possible sums
        for (int target = 1; target <= sum; target++) {
            if (dp[0][target]) {
                System.out.print(target + " ");
            }
        }
    }
}