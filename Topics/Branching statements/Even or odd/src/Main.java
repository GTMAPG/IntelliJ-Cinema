import java.util.Scanner;

class Main {
    public static int n;
    public static int i;
    public static void main(String[] args) {
        // put your code here
        Scanner evenOdd = new Scanner(System.in);
        n = evenOdd.nextInt();

        for (i = 0; n != 0; i++) {
            if (n % 2 == 0) {
                System.out.println("even");
                n = evenOdd.nextInt();
            } else {
                System.out.println("odd");
                n = evenOdd.nextInt();
            }
        }


    }
}