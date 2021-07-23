import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int outRow = col;
        int outCol = row;
        int[][] inRectangle = new int[row][col];
        int[][] outRectangle = new int[outRow][outCol];

        // populate the original array
//            0  1  2  3
//         0 11 12 13 14
//         1 21 22 23 24
//         2 31 32 33 34

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inRectangle[i][j] = input.nextInt();
            }
        }

        // populate the rotated array
//            0  1  2
//         0 31 21 11
//         1 32 22 12
//         2 33 23 13
//         3 34 24 14
        for (int i = 0; i < outRow; i++) {
            int n = i;
            int r = inRectangle.length - 1;
            for (int j = 0; j < outCol; j++) {
                outRectangle[i][j] = inRectangle[r][n];
                r -= 1;
            }
        }

        // print the Output
        for (int i = 0; i < outRow; i++) {
            for (int j = 0; j < outCol; j++) {
                System.out.print(outRectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}