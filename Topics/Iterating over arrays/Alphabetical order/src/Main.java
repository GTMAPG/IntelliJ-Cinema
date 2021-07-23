import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        boolean sorted = true;
        Scanner input = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();

//        create list to then create array
        do {
            String letter = input.next();
            arrayList.add(letter);
        } while (input.hasNext());

        int listLength = arrayList.size();

        String[] array = new String[listLength];
        String[] arrayTwo = new String[listLength];

//        populate both arrays
        for (int i = 0; i < listLength; i++) {
            array[i] = arrayList.get(i);
            arrayTwo[i] = arrayList.get(i);
        }

//        sort second array for upcoming comparison
        Arrays.sort(arrayTwo);

//        compare the arrays
        for (int i = 0; i < listLength; i++) {
            sorted = array[i].equals(arrayTwo[i]);
        }

//        print the output
        System.out.println(sorted);
    }
}