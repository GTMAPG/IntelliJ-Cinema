import java.util.Scanner;

class Main {
    private static int sold = 1;
    private static int consec = 0;
    private static int rowConsec = 0;
    private static int available = 0;
    private static int[][] cinema;
    private static int tickets;
    private static int row;
    private static int col;
    private static Scanner input;
    public static void main(String[] args) {
        // put your code here
        input = new Scanner(System.in);
        row = input.nextInt();
        col = input.nextInt();

        cinema = new int[row][col];

        // check if row/col exceed 20
        if (row > 20 || col > 20) {
            System.exit(1);
        }

        makeArray();

        // amount of tickets to buy from input
        tickets = input.nextInt();

        ticketLoop();
    }

    private static void makeArray() {
        // populate the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cinema[i][j] = input.nextInt();
            }
        }
    }

    private static void ticketLoop() {
        // determine if we can buy consecutive tickets
        for (int i = 0; i < row; i++) {
            consec = 0;
            for (int j = 0; j < col; j++) {
                if (cinema[i][j] == available) {
                    consec++;
                    if (consec == tickets) {
                        rowConsec = i + 1;
                        break;
                    }
                } else if (cinema[i][j] == sold) {
                    consec = 0;
                }
            }
            if (consec > 0 && consec == tickets) {
                System.out.println(rowConsec);
                break;
            }
        } if (consec != tickets && rowConsec == 0) {
            System.out.println(rowConsec);
        }
    }
}