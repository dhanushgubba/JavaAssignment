import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = findSum(arr, n);
        System.out.println(res);
    }

    static int findSum(int[] arr, int n) {
        n = arr.length;
        int sum = 0;
        while (n > 0) {
            sum += arr[n-1];
            n--;
            ;
        }
        return sum;
    }
}
