import java.util.Scanner;

class Main {
    public static boolean firstTime;
    public static int i;
    public static int n;
    public static int printI;
    public static int printCount;
    public static void main(String[] args) {
        // put your code here
        Scanner sequence = new Scanner(System.in);
        n = sequence.nextInt();
        i = 0;
        printCount = n;
        firstTime = true;

        while (printCount > 0) {
            i++;
            printI = 1;
            while (printI <= i && printCount > 0) {
                System.out.println(i);
                printI++;
                printCount--;
            }

        }

    }
}