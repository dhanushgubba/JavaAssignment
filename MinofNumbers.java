import java.util.Scanner;

public class MinofNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int res = Minnumbers(first, second, third);
        System.out.println(res);
        sc.close();
    }
    
    static int Minnumbers(int first,int second,int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
