import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x1 point: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the x2 point: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the y1 point: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the y2 point: ");
        double y2 = sc.nextDouble();

        double res = findDistance(x1, x2, y1, y2);
        System.out.println(res);
        sc.close();
    }
    static double findDistance(double x1, double x2,double y1, double y2) {
        double res = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return res;
    }
}
