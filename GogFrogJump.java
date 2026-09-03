import java.util.Arrays;
class GogFrogJump{
public static void main(String[] args) {
        int[] height = {1,2,3,4,5,6,4,4,8,6,5}

        int n = height.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        Sys solve(0, height, memo);
    }

}

    int solve(int i, int[] height, int[] memo) {
        int n = height.length;
        if (i == n - 1) return 0;
        if (memo[i] != -1) return memo[i];
        int oneStep = Math.abs(height[i] - height[i + 1])+ solve(i + 1, height, memo);
        int twoStep = Integer.MAX_VALUE;
        if (i + 2 < n) {
            twoStep = Math.abs(height[i] - height[i + 2])+ solve(i + 2, height, memo);
        }
        return memo[i] = Math.min(oneStep, twoStep);
    }
   
}