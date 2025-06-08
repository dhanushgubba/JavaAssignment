import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int hcfres = findHCF(a, b);
        int lcmres = findLCM(a, b);
        System.out.println(hcfres);
        System.out.println(lcmres);
        sc.close();
    }

    static int findHCF(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findHCF(b, a % b);
    }

    static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }
}
