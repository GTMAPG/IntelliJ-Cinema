import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        int sum = 0;

        while (inputNumber.hasNext()) {
            int number = inputNumber.nextInt();
            if (number == 0) {
                System.out.println(sum);
                break;
            } else {
                sum += number;
            }
        }
    }
}
