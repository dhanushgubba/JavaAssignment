import java.util.Scanner;

public class MaxandMinofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxres = findMaxofthree(a, b, c);
        int minres = findMinofthree(a, b, c);
        System.out.println(maxres);
        System.out.println(minres);
        sc.close();
    }

    static int findMaxofthree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int findMinofthree(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}