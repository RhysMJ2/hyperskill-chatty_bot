import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine().replaceAll(" ", "");
        String input2 = scanner.nextLine().replaceAll(" ", "");

        System.out.println(input1.equals(input2));

    }
}