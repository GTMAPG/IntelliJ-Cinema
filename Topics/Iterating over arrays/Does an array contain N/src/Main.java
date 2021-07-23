import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int c;
        int i;
        boolean intFound = false;
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] array = new int[length];
        for (i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        
        int compare = input.nextInt();
        
        for (c = 0; c < length; c++) {
            if (compare == array[c]) {
                intFound = true;
                break;
            }
        }

        System.out.println(intFound);
    }
}
