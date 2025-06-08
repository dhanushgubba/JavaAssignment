import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();

        double res = getPower(base, exponent);
        System.out.println(res);
        sc.close();
    }

    static double getPower(double base, double exponent) {
        double res = Math.pow(base, exponent);
        return res;
    }
}
