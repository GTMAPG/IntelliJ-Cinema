import java.util.Scanner;

class Main {
    public static boolean printed;
    public static int nextNum;
    public static int barrier;
    public static int sum;
    public static int output;
    public static Scanner inputSequence;

    public static void main(String[] args) {
        // put your code here
        inputSequence = new Scanner(System.in);
        nextNum = inputSequence.nextInt();
        barrier = 1000;
        output = 0;
        sum = 0;
        printed = false;

        do {
            if (nextNum == 0) { // check for zero to break
                output = sum;
                break;
            } else if (sum >= barrier) { // check to see if sum is greater/equal to 1000.
                output = sum - barrier;
                break;
            } else { // continue to accumulate numbers
                while (nextNum > 0) {
                    sum = sum + nextNum;
                    if (sum >= barrier) {
                        output = sum - barrier;
                        printed = true;
                        break;
                    } else {
                        nextNum = inputSequence.nextInt();
                    }
                }
            }
        } while (!printed);
        System.out.println(output);
    } 
}
