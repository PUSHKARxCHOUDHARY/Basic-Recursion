/*public class PowerOfX {
    public static void main(String[] args){
        int n = 2;
        int x = 2;
         System.out.print(powerfun(x, n));
    }       
    public static void powerfun(int n, int x){
        if(n==0){
            return;
        }
        return x*powerfun(x, n-1);
    }
}*/
class PowerOfX {

    public static void main(String[] args) {
        int n = 2;
        int x = 2;

        System.out.print(powerfun(x, n));
    }

    public static int powerfun(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powerfun(x, n - 1);
    }
}