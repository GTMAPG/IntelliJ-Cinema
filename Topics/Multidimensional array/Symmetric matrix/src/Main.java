import java.util.Scanner;

class Main {
    private static int row;
    private static int col;
    private static String symFlag;
    private static Scanner input;
    private static int[][] matrix;
    private static int[][] transposed;
    public static void main(String[] args) {
        // put your code here
        input = new Scanner(System.in);
        row = input.nextInt(); // number of rows in array
        col = row; // number of cols in array

        makeArray();
        transposeArray();
        checkSymmetric();

        System.out.println(symFlag);
    }

    private static void makeArray() {
        matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    private static void transposeArray() {
        transposed = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
    }

    private static void checkSymmetric() {
        symFlag = "YES";
        if (row == col) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (transposed[i][j] != matrix[i][j]) {
                        symFlag = "NO";
                        break;
                    }
                }
            }
        } else { // if not a square, then can't be symmetrical
            symFlag = "NO";
        }
    }
}