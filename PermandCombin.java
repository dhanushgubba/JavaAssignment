import java.util.Scanner;

public class PermandCombin {
    static int getFactorial(int n) {
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }

    static int getPermuatation(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        return getFactorial(n) / getFactorial(n - r);
    }
    
    static int getCombination(int n, int r) {
        if (r < 0 || r > n) {
            return 0;
        }
        return getFactorial(n) / (getFactorial(r) * getFactorial(n - r));
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();

        int permResult = getPermuatation(n, r);
        System.out.println(permResult);

        int combResult = getCombination(n, r);
        System.out.println(combResult);

        sc.close();
        
    }
    
}
