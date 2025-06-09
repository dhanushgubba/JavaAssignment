import java.util.*;
public class allterms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 12;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
        System.out.println(sum / n);
        System.out.println(findMin(arr, n));
        System.out.println(findMax(arr, n));
    }

    static int findMin(int[] arr, int n) {
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = arr[0];
            if (arr[i] < min) {
                min = i;
            }
        }
        return min;
    }

    static int findMax(int[] arr, int n) {
        int max = 0;
        for(int i=0;i<n;i++) {
            max = arr[0];
            if(arr[i] > max) {
                max = i;
            } 
        }
        return max;
    }
}