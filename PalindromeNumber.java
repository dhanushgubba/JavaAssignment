import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = checkPalindrome(n);
        System.out.println(res);
        sc.close();
    }

    static boolean checkPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n /= 10;
        }
        return original == reversed;
    }
}