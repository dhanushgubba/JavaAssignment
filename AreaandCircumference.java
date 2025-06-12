import java.util.Scanner;

public class AreaandCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double cirres = findCircumference(radius);
        double areares = findArea(radius);
        System.out.println(cirres);
        System.out.println(areares);
        sc.close();
    }

    static double findCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    static double findArea(double radius) {
        double area = 2 * Math.PI * radius;
        return area;
    }
}
