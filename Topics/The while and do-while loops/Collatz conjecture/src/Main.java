import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner inputNumber = new Scanner(System.in);
//        boolean firstTime = true;
        boolean notOne = true;
        int n = inputNumber.nextInt();
        int result = 0;
        System.out.println(n);


        do {
            if (n == 1) {
//                result = n;
//                System.out.println(result);
                notOne = false;
            } else if (n % 2 == 0) {
                result = n / 2;
                System.out.println(result);
                n = result;
            } else if (notOne) {
                result = n * 3 + 1;
                System.out.println(result);
                n = result;
            }
        } while (notOne);
    }
}
