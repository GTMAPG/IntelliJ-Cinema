import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println(sum);
                break;
            } else {
                sum++;
            }
        }
    }
}
