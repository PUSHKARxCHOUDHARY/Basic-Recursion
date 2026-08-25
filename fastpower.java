public class fastpower {
    public static void main(String[] args){
        int x = 10;
        int n = 4;
        System.out.print(powerfast(x,n));

    }
    public static int powerfast(int x, int n){
        if(n==0){
            return 1;
        }
        int half = powerfast(x,n/2);
        if(n%2==0){
            return half*half;
        } 
        return x*half*half;
    }
    
}
