import java.util.Scanner;

class Main {
    public static boolean found1 = false;
    public static boolean found2 = false;
    public static boolean neighbors = false;
    public static int indexNum1 = 0;
    public static int indexNum2 = 0;
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

        // populate the array
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // numbers to check
        final int num1 = input.nextInt();
        final int num2 = input.nextInt();

        // determine if num1 and num2 are in the array
        checkArray(array, num1, num2);

        // check if num1 and num2 are next to each other
        // if one or both are missing then print out false
        if (found1 && found2) {
            checkNeighbor();
        }

        System.out.println(neighbors);

    }

    private static void checkNeighbor() {
        int result = indexNum1 - indexNum2;

        if (result == 1 || result == -1) {
            neighbors = true;
        }
    }

    private static void checkArray(int[] array, int num1, int num2) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                found1 = true;
                indexNum1 = i;
            } else if (array[i] == num2) {
                found2 = true;
                indexNum2 = i;
            }
        }
    }
}