import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int givenOdd = input.nextInt();
        float middleNum = 0f;
        String period = ".";
        String asterisk = "*";

        String[][] starFigure = new String[givenOdd][givenOdd];

        for (i = 0; i < starFigure.length; i++) {
            for (j = 0; j < starFigure.length; j++) {
                starFigure[i][j] = period;
            }
        }

//        find middle of array
        middleNum = givenOdd / 2;
        Math.round(middleNum);

        // reverse diagonal counter
        int counter = starFigure.length - 1;

        for (i = 0; i < starFigure.length; i++) {
            for (j = 0; j < starFigure.length; j++) {
                if (i == j) {
                    starFigure[i][j] = asterisk;
                } else if (i == middleNum || j == middleNum) {
                    starFigure[i][j] = asterisk;
                }
                if (j == counter) {
                    starFigure[i][j] = asterisk;
                    counter--;
                }
            }
        }

        for (i = 0; i < starFigure.length; i++) {
            for (j = 0; j < starFigure.length; j++) {
                System.out.print(starFigure[i][j] + " ");
            }
            System.out.println();
        }
    }
}
