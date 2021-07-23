import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();

        int[][] twoDemArray;
        twoDemArray = new int[row][col];

        for (int i = 0; i < twoDemArray.length; i++) {
            for (int j = 0; j < col; j++) {
                twoDemArray[i][j] = input.nextInt();
            }
        }

        int index1 = input.nextInt();
        int index2 = input.nextInt();

        swapCol(index1, index2, twoDemArray);

        for (int[] column : twoDemArray) { // reference the array for the column info
            for (int row2 : column) {       // reference the row to the column number
                System.out.print(row2 + " "); // print the row information.
            }
            System.out.println();
        }

//        for (int i = 0; i < twoDemArray.length; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(twoDemArray[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

    public static void swapCol(int arr1, int arr2, int[][] arry) {
        for (int i = 0; i < arry.length; i++) {
            int temp = arry[i][arr1]; // move original value to temp variable
            arry[i][arr1] = arry[i][arr2]; // move second index value to first index value
            arry[i][arr2] = temp; // move temp variable to second index value location.
        }
    }
}