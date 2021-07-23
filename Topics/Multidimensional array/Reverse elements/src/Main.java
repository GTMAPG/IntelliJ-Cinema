class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int row = twoDimArray.length;
        int col = twoDimArray[0].length;
        int[][] twoDimReversed = new int[row][col];

        // create the reversed array from the original array;
        for (int i = 0; i < row; i++) {
            int n = col;
            for (int j = 0; j < col; j++) {
                twoDimReversed[i][n - 1] = twoDimArray[i][j];
                n = n - 1;
            }
        }

        // move the reversed array and overlay the original array;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoDimArray[i][j] = twoDimReversed[i][j];
            }
        }

    }
}