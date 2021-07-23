import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        int maxNumber = 0;

        Scanner inputNumber = new Scanner(System.in);
        
        while (inputNumber.hasNext()) {
            int number = inputNumber.nextInt();
            if (number % 4 == 0 && number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println(maxNumber);
    }
}
