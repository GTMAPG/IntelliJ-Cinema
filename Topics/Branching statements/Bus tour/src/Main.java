import java.util.*;

public class Main {
    public static int height;
    public static int numberOfBridges;
    public static int bridgeNumber;
    public static int b;
    public static int i;
    public static boolean crashed;
    public static int[] bridges;
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        bridgeNumber = 0;
        crashed = false;
        height = input.nextInt();
        numberOfBridges = input.nextInt();
        bridges = new int[numberOfBridges];

        // get bridge heights
        do {
            for (b = 0; b < numberOfBridges; b++) {
                bridges[b] = input.nextInt();
            }
            if (b >= numberOfBridges) {
                break;
            }
        } while (input.hasNext());

        // will the bus crash?

        for (i = 0; i < numberOfBridges; i++) {
            if (bridges[i] > height) {
                continue;
            } else {
                bridgeNumber = i + 1;
                System.out.println("Will crash on bridge " + bridgeNumber + "");
                crashed = true;
                i = 10;
                break;
            }
        }

        // if no busses crashed then output "Will not crash"
        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}