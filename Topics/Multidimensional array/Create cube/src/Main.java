import java.util.Arrays;

class ArrayOperations {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(createCube()));

    }

    public static int[][][] createCube() {
        // write your code here
        int[][][] cube;
        cube = new int[3][3][3];

        for (int i = 0; i < cube.length; i++) {
            int counter = 0;
            for (int j = 0; j < cube.length; j++) {
                for (int k = 0; k < cube.length; k++) {
                    if (i == 0 && j == 0 && k == 0) {
                        cube[i][j][k] = 0;
                        counter++;
                    } else {
                        cube[i][j][k] = counter++;
                    }
                }
            }
        }

        return cube;
    }
}