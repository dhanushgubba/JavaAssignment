import java.util.Scanner;

public class Evenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = findEvenOrOdd(n);
        System.out.println(res);
        sc.close();
    }

    static String findEvenOrOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
