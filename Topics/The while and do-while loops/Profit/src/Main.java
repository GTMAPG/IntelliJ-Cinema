import java.util.*;

public class Main {
    public static double money;
    public static double percent;
    public static double kmoney;
    public static int year;

    public static void main(String[] args) {
        Scanner banking = new Scanner(System.in);
        money = banking.nextInt();
        percent = banking.nextInt();
        kmoney = banking.nextInt();
        year = 0;

        while (money < kmoney) {
            year++;
            money = money + money * (percent / 100);
        }
        System.out.println(year);
    }
}
