import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String res = findVoteEligible(age);
        System.out.println(res);
        sc.close();
    }

    static String findVoteEligible(int age) {
        if(age>=18) {
            return "Eligible to vote";
        } else {
            return "Not Eligible to vote";
        }
    }
}
