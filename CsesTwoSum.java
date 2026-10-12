import java.util.*;

public class CsesTwoSum {

    static long solve(int i, int target) {

        if (target == 0)
            return 1;

        if (i == 0 || target < 0)
            return 0;

        long take = solve(i - 1, target - i);

        long notTake = solve(i - 1, target);

        return take + notTake;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        if (sum % 2 != 0) {
            System.out.println(0);
            return;
        }

        int target = sum / 2;

        long ans = solve(n, target);

        System.out.println(ans / 2);
    }
}