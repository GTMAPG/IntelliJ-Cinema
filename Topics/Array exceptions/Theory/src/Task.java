// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    int numberOfSeats = 81;
    int numberTicketsSold = 3;
    float soldNumber = ((float) numberTicketsSold / numberOfSeats) * 100;
    System.out.println(String.format("Percentage: %.2f%%", soldNumber));
  }
}
