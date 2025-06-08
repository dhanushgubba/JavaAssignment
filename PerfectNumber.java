import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkPerfect(n)) {
            System.out.println("It is a Perfect Number");
        } else {
            System.out.println("It is not a Perfect Number");
        }
        sc.close();
    }

    static boolean checkPerfect(int n) {
        if (n <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
