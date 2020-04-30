import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int max = 0;
        if (a >= b && a >= c) {
            max = 1;
        } else if (b >= c) {
            max = 2;
        } else {
            max = 3;
        }
        return max;
    }
}