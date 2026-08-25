public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(sum(arr, arr.length - 1));
    }

    static int sum(int[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }

        return arr[index] + sum(arr, index - 1);
    }
}