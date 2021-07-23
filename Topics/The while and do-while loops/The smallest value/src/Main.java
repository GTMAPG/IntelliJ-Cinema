import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        long inputNum = input.nextLong();
        long factNum = 1L;
        long counter = 0L;

        do {
            counter++;
            factNum *= counter;
        } while (factNum <= inputNum);

        System.out.println(counter);
    }
}