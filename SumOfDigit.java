public class SumOfDigit {

    public static void main(String[] args) {
        int n = 12589630;
        System.out.println(sumdigit(n));
    }

    static int sumdigit(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumdigit(n / 10);
    }
}