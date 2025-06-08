import java.util.Scanner;

public class MaximumofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int res = max(first, second, third);
        System.out.println(res);
        sc.close();
    }

    static int max(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if(third > max) {
            max = third;
        }
        return max;
    }
}
