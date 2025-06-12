import java.util.Scanner;

public class StringReverseClg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 1; i < words.length-1; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        System.out.println(String.join(" ", words));
        sc.close();
    }
    
}
