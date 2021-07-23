//import java.util.Scanner;

class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
//        print the corners of the array
        int corner1 = twoDimArray[0][0]; // first corner
        int corner2 = twoDimArray[0][twoDimArray[0].length - 1]; // second corner
        int corner3 = twoDimArray[twoDimArray.length - 1][0]; // third corner

        // fourth corner - tricky as second index has to be subtracted twice (one nested) for correct positioning
        int corner4 = twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1];

        System.out.println(corner1 + " " + corner2);
        System.out.println(corner3 + " " + corner4);
    }
}