package cinema;

import java.util.Scanner;
import java.lang.Math;

public class Cinema {

    public static boolean aboveHalf;
    public static boolean continueProcessing;
    public static boolean ticketPurchased;

    public static char b = 'B';
    public static char bUpper;
    public static char s = 'S';
    public static char sUpper;
    public static char[][] cinemaArray;

    public static double ticketPrice;
    public static double currentIncome;
    public static double totalIncome;

    public static float ticketPercent;

    public static int depth;
    public static int width;
    public static int halfOfSeats = 0;
    public static int rowNum = 0;
    public static int rowCount = 1;
    public static int seatNum = 0;
    public static int halfRounded;
    public static int backHalf;
    public static int frontHalf;
    public static int numberOfRows;
    public static int frontRows;
    public static int backRows;
    public static int userSelection = 0;
    public static int numberOfSeats = 0;
    public static int numberTicketsSold = 0;

    public static Scanner rowNumber;
    public static Scanner rowSeat;
    public static Scanner theatreRows;
    public static Scanner theatreWidth;

    public static String ticketPurchasedString;

    public static void main(String[] args) {
        // Write your code here
        bUpper = Character.toUpperCase(b);
        sUpper = Character.toUpperCase(s);

        getUserInput();
        makeCinemaArray();

        doWeContinue();

    }

    private static void doWeContinue() {
        continueProcessing = true;
        rowNumber = new Scanner(System.in);

        while (continueProcessing) {
            ticketPurchasedString = Boolean.toString(ticketPurchased);
            print_Selection_menu();
            switch (userSelection) {
                case 1:
                    if ("false".equals(ticketPurchasedString)) {
                        print_Cinema_Body();
                    } else {
                        print_Seat_Location();
                    }
                    break;
                case 2:
                    ticketPurchased = true;
                    get_Row_Seat_requested();
                    updateSeatsPurchase();
                    ticketPurchased = false;
                    break;
                case 3:
                    print_Statistics();
                    break;
                case 0:
                default:
                    return;
            }
        }
    }

    private static void get_Row_Seat_requested() {
        System.out.println("Enter a row number:");
        rowNum = rowNumber.nextInt();     //    get row number
        rowSeat = new Scanner(System.in); //    get seat number
        System.out.println("Enter a seat number in that row:");
        seatNum = rowSeat.nextInt();

        checkSeatPurchase();
    }

    private static void checkSeatPurchase() {
        try {
            if (cinemaArray[rowNum][seatNum] == 'B') {
                System.out.println("That ticket has already been purchased");
                get_Row_Seat_requested();
            } else if (cinemaArray[rowNum][seatNum] == 'S') {
                print_Ticket_Price();
            }
        } catch (Exception e) {
            System.out.println("Wrong input!");
            get_Row_Seat_requested();
        }
    }

    private static void print_Statistics() {
//       1. The number of purchased tickets;
//       2. The number of purchased tickets represented as a percentage.
//          Percentages should be rounded to 2 decimal places;
//       3. Current income;
//       4. The total income that shows how much money the theatre will get if all
//          the tickets are sold.
        get_Ticket_price();
        if (totalIncome == 0) {
            get_Total_Income();
        }
        ticketPercent = ((float) numberTicketsSold / numberOfSeats) * 100;
        if (numberTicketsSold == 0) {
            String printPurchased = String.format("Number of purchased tickets: %d", numberTicketsSold);
            String printPercentage = String.format("Percentage: %.2f%%", ticketPercent);
            String printCurIncome = String.format("Current income: $%.0f", currentIncome);
            String printTotIncome = String.format("Total income: $%.0f", totalIncome);
            System.out.println(printPurchased);
            System.out.println(printPercentage);
            System.out.println(printCurIncome);
            System.out.println(printTotIncome);
        } else if (numberTicketsSold > 0) {
            try {
                String printPurchased = String.format("Number of purchased tickets: %d", numberTicketsSold);
                String printPercentage = String.format("Percentage: %.2f%%", ticketPercent);
                String printCurIncome = String.format("Current income: $%.0f", currentIncome);
                String printTotIncome = String.format("Total income: $%.0f", totalIncome);
                System.out.println(printPurchased);
                System.out.println(printPercentage);
                System.out.println(printCurIncome);
                System.out.println(printTotIncome);
            } catch (Exception e) {
                if (numberOfSeats == 0 || numberTicketsSold == 0) {
                    System.out.println("Division by zero!");
                } else {
                    System.out.println("Exception " + e);
                }
            }
        }
    }

    private static void get_Total_Income() {
//        when seats are greater than 60, make sure to take the front rows by 10
//        and back rows by 8

        if (numberOfSeats > 60) {
            numberOfRows = cinemaArray.length - 1;
            frontRows = Math.round(numberOfRows / 2);
            backRows = numberOfRows - frontRows;
            totalIncome = ((width - 1) * frontRows * 10) + ((width - 1) * backRows * 8);
        } else {
            totalIncome = (cinemaArray.length - 1) * (cinemaArray[cinemaArray.length -1].length - 1);
        }
    }

    private static void makeCinemaArray() {
        cinemaArray = new char[depth][width];

        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 && j == 0) {
                    cinemaArray[i][j] = ' ';
                } else if (i == 0) {
                    cinemaArray[i][j] = Integer.toString(j).charAt(0);
                } else if (j == 0) {
                    cinemaArray[i][j] = Integer.toString(i).charAt(0);
                } else {
                    cinemaArray[i][j] = sUpper;
                }
            }
        }
    }

    private static void getUserInput() {
        theatreRows = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        depth = theatreRows.nextInt();
        depth = depth + 1;

        theatreWidth = new Scanner(System.in);
        System.out.println("Enter the number of seats in each row:");
        width = theatreWidth.nextInt();
        width = width +1;
    }

    public static void get_Ticket_price() {
        numberOfSeats = (width - 1) * (depth - 1);

//    calculate half of seats
        halfOfSeats = (int) (numberOfSeats * 0.5);

//    determine the halfway point for larger rooms
        double half = depth * 0.5;
        halfRounded = (int) Math.round(half);

//    set ticket price to $10 when # of seats in theatre is less than 60
        ticketPrice = 0;
        if (numberOfSeats <= 60) {
            ticketPrice = 10.00;
            totalIncome = ticketPrice * numberOfSeats;
        }

//    set ticket price to $10 for the front half of the theatre, when # of seats in theatre is greater than 60
        if (numberOfSeats > 60) {
            while (rowCount <= half) {
                double frontHalfTicketPrice = 10.00;
                frontHalf += frontHalfTicketPrice * width - 1;
                rowCount++;
            }
        }

// set ticket price to $8 for the back half of the theatre, when # of seats in theatre is greater than 60
        if (numberOfSeats > 60) {
            while (rowCount > half && rowCount <= depth) {
                double backHalfTicketPrice = 8.00;
                backHalf += backHalfTicketPrice * width - 1;
                rowCount++;
            }
        }
    }

    public static void print_Selection_menu() {
        Scanner userEntry = new Scanner(System.in);
        System.out.println();
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        userSelection = userEntry.nextInt();
        switch (userSelection) {
            case 1:
            case 2:
            case 3:
                continueProcessing = true;
                break;
            case 0:
            default:
                continueProcessing = false;
        }
    }

    public static void print_Cinema_Body() {
        System.out.println();
        System.out.println("Cinema:");
        for (char[] chars : cinemaArray) { // print out the row numbers
            for (char aChar : chars) { // print out the column numbers
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    public static void print_Ticket_Price() {
        get_Ticket_price();

        int seatCount = (((rowNum - 1) * width) + seatNum);

        aboveHalf = seatCount <= halfOfSeats;

        if (aboveHalf) {
            ticketPrice = 10;
        } else {
            ticketPrice = 8;
        }

        System.out.println("Ticket Price: $" + ticketPrice);

    }

    public static void print_Seat_Location() {
        updateSeatsPurchase();
        print_Cinema_Body();
    }

    private static void updateSeatsPurchase() {
        for (int i = 0; i < cinemaArray.length; i++) { // print out the row numbers
            for (int j = 0; j < cinemaArray[i].length; j++) { // print out the column numbers
                try {
                    if (rowNum == i && seatNum == j) {
                        switch (cinemaArray[i][j]) {
                            case 'B':
                                System.out.println("That ticket has already been purchased!");
                                get_Row_Seat_requested();
                            case 'S':
                                cinemaArray[i][j] = bUpper;
                                numberTicketsSold++;
                                currentIncome += ticketPrice;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Wrong input!");
                }
            }
        }
    }
}