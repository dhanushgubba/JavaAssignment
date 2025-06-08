import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (findPalindrome(str)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is not a Palindrome String");
        }
        sc.close();
    }

    static boolean findPalindrome(String str) {
        int right = str.length()-1;
        String reversed = "";

        while (right >= 0) {
            reversed += str.charAt(right);
            right--;
        }
        return reversed.equals(str);
    }
}
