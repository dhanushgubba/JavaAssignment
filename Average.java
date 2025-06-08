import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n values: ");
        int n = sc.nextInt();
        System.out.println("Enter the values of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        float res = average(n, arr);
        System.out.println(res);
        sc.close();
    }

    static float average(int n,int[] arr) {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum / n;
    }
}
