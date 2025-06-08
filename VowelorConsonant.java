import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        String result = vowelString(ch);
        System.out.println(result);
        sc.close();
    }
    
    static String vowelString(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "It is a vowel";
        } else {
            return "It is not a vowel";
        }
    }
}
