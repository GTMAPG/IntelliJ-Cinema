import java.util.*;

class Main {
    public static void main(String[] args) {
        // put your code here

        // this is looking for an exponential value, that's where I was going wrong...
        Scanner inputNumber = new Scanner(System.in);
        boolean maxHit = false;
        int squaredResult = 0;
        int input = 0;
        int number = 0;
        int firstInput = 0;
        input = inputNumber.nextInt();

        do {
            firstInput = input;
            number++;
            squaredResult = number * number;
            if (squaredResult <= firstInput) {
                System.out.println(squaredResult);
            } else {
                maxHit = true;
            }
        } while (!maxHit);

    }
}