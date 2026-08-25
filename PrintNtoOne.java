public class PrintNtoOne {
    public static void main(String[] args) {
        int n = 10; // You can change this value to print down to a different number
        printNumbers(n);
    }   
    static void printNumbers(int n) {
        if (n > 0) {                
            System.out.println(n);
            printNumbers(n - 1);       

        }
    }
    
}
