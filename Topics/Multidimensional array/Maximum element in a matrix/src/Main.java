import java.util.Scanner;

class Main {
    private static Scanner input;
    private static int n = 0;
    private static int m = 0;
    private static int largest = 0;
    private static int maxRow = 0;
    private static int maxCol = 0;
    private static int[][] array;

    public static void main(String[] args) {
        // put your code here
        input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();

        // initialize with the smallest possible value
        largest = Integer.MIN_VALUE;

        array = new int[n][m];

//        create the array
        makeArray();

//        find the largest value in the array
        searchArray();

        System.out.println(maxRow + " " + maxCol);
    }

    public static void makeArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < m; j++) {
                int getNext = input.nextInt();
                array[i][j] = getNext;
            }
        }
    }

    public static void searchArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < m; j++) {
                // check if largest is smaller than element
                if (largest < array[i][j]) {
                    largest = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
    }
}