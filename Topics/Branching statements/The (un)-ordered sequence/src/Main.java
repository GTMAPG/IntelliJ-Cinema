import java.util.Scanner;

class Main {
    public static boolean ordered;
    public static int nextNum;
    public static int prevNum;
    public static Scanner inputSequence;

    public static void main(String[] args) {
        // put your code here
        inputSequence = new Scanner(System.in);
        prevNum = inputSequence.nextInt();
        nextNum = inputSequence.nextInt();
        ordered = true;

        do {
            if (nextNum == 0) { // check for zero to break
                System.out.println(ordered);
                break;
            } else if (nextNum == prevNum) { // check to see if current numbers are equal
                prevNum = nextNum;
                nextNum = inputSequence.nextInt();
                continue;
            } else if (nextNum >= prevNum) { // check ascending
                while (inputSequence.hasNext()) {
                    prevNum = nextNum;
                    nextNum = inputSequence.nextInt();
                    if (nextNum == 0) {
                        System.out.println(ordered);
                        break;
                    } else if (nextNum < prevNum) {
                        ordered = false;
                        System.out.println(ordered);
                        break;
                    }
                }
            } else { // check descending
                while (inputSequence.hasNext()) {
                    prevNum = nextNum;
                    nextNum = inputSequence.nextInt();
                    if (nextNum == 0) {
                        System.out.println(ordered);
                        break;
                    } else if (nextNum > prevNum) {
                        ordered = false;
                        System.out.println(ordered);
                        break;
                    }
                }
            }
        } while (ordered && nextNum > 0);
    }
}