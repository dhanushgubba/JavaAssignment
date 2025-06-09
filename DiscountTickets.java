import java.util.Scanner;

public class DiscountTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tickets = sc.nextInt();
        int amount = sc.nextInt();
        int category = sc.nextInt();
        int students = 25;
        int others = 20;

        if (tickets < 15) {
            int res = tickets * amount;
            System.out.println(res);
        } else if (category == 1 && tickets > 15) {
            int res = tickets * amount;
            int finalamount = res - (students / 100);
            System.out.println(finalamount);
        } else if (category != 1 && tickets > 15) {
            int res = tickets * amount;
            int finalamount = res - (res * others / 100);
            System.out.println(finalamount);
        }
        sc.close();
    }    
}
