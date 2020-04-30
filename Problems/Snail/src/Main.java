import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short h = scanner.nextShort();
        short a = scanner.nextShort();
        short b;
        while (true) {
            b = scanner.nextShort();
            if (a > b)
                break;
            else
                System.out.println("A must be larger than B, type B again");
        }

        short position = 0;
        short day = 0;

        while (true) {
            day++;
            position += a;
            if (position >= h){
                break;
            }
            position -= b;
        }
        System.out.println(day);
    }
}