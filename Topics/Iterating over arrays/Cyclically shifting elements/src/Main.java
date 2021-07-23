import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 1; i < length; i++) {
            array[i] = input.nextInt();
        }

        array[length - length] = input.nextInt();

        for (int p = 0; p < length; p++) {
            System.out.print(array[p] + " ");
        }

    }
}
