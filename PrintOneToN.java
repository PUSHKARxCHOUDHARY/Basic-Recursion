public class PrintOneToN {
    public static void main(String[] args) {
        int n = 10; // You can change this value to print up to a different number
        printNumbers(n);
    }   
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);
    }
    
}
