import java.util.Scanner;

class Main {
    public static int[][] numberArray;
    public static int i = 0;
    public static int j = 0;
    public static int zero = 0;
    public static void main(String[] args) {

        // put your code here
        Scanner input = new Scanner(System.in);
        int givenNumber = input.nextInt();
        if (givenNumber <= 100) {
            numberArray = new int[givenNumber][givenNumber];
            makeArray();
            fixArray();
            printArray();
        } else {
            System.exit(0);
        }
    }

    public static void makeArray() {
        for (i = 0; i < numberArray.length; i++) {
            for (j = 0; j < numberArray.length; j++) {
                if (i == j) {
                    numberArray[i][j] = zero;
                } else if (i == 0 && j == 0) {
                    numberArray[i][j] = i;
                } else {
                    numberArray[i][j] = i - j;
                }
            }
        }
    }

    public static void fixArray() {
        for (i = 0; i < numberArray.length; i++) {
            for (j = 0; j < numberArray.length; j++) {
                if (numberArray[i][j] < 0) {
                    numberArray[i][j] = numberArray[i][j] * -1;
                }
            }
        }
    }

    public static void printArray() {
        for (i = 0; i < numberArray.length; i++) {
            for (j = 0; j < numberArray.length; j++) {
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
