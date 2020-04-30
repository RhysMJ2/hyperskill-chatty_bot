// Posted from EduTools plugin
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (input.length() == 0) {
            input = scanner.nextLine();
        }
        int num1 = -1;
        int num2 = -1;
        while (num1 < 0 && num2 < 0 && num1 < input.length() && num2 < input.length()) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
        }
        int i;
        String output = "";
        for (i = num1; i <= num2; i++) {
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}