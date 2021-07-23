import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int sum = 0;
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }

        for (int s = 0; s < length; s++) {
            sum = sum + array[s];
        }

        System.out.println(sum);
    }
}