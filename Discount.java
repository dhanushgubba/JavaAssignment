import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        double price = sc.nextInt();
        System.out.println("Enter the discounted price: ");
        double discount = sc.nextInt();
        double finalprice = discountprice(price,discount);
        System.out.println(finalprice);
        sc.close();
    }
    
    static double discountprice(double price, double discount) {    
        double discounted = price - (price * discount/100);
        return discounted;
    }   
}
