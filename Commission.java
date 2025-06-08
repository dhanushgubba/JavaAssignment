import java.util.*;
public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sales = sc.nextDouble();
        double Commission = sc.nextDouble();
        double res = CommissionRate(sales, Commission);
        System.out.println(res);
        sc.close();
    }

    static double CommissionRate(double sales, double Commission) {
        double result = sales - (sales * Commission) / 100;
        return result;
    }
}
