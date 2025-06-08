import java.util.*;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double res = calculateBill(units);
        System.out.println(res);
        sc.close();
    }
    static double calculateBill(int units) {
        double bill = 0;
        if(units>0) {
            if(units<=100) {
                bill= units * 1.5;
            }else if(units>100 && units<=200) {
                bill = 100 * 1.5 + (units - 100) * 2.0;
            }else if(units>200 && units<=300) {
                bill = 100 * 1.5 + units * 2.0 + (units-200)*3.0; 
            }else  {
                bill = 100*1.5+100*2.0+100*3.0+(units-300)*5.0;
            }
        }else {
            return -1;
        }
        return bill;
    }
}