import java.util.Scanner;

public class ReverseString {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
        sc.close();
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String rev = reverse(input);
        System.out.println(rev);
        sc.close();
    }
    
    static String reverse(String str) {
        int right = str.length() - 1;
        String reversed = "";
        while (right >= 0) {
            reversed += str.charAt(right);
            right--;
        }
        return reversed;
    }
}
