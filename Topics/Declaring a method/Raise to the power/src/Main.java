import java.util.Scanner;

public class Main {

    public static long power(int n, int m) {
        // write your code here

        // how I did it the first time
//        long result = (long) Math.pow(n, m);

//        return result;

        // after feedback on return just the value instead of storing in local variable
        // using return, with cast to long, still utilizing Math.pow.
        return (long) Math.pow(n, m);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}