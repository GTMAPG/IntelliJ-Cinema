import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long count = 0;
        long factorial = 0L;
        factorial = n;
        count = n;

        for (int i = 1; i < count; i++) {
            factorial = factorial * i;
        }

        if (factorial == 0) {
            factorial = 1;
        }
        return factorial;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}