package Course;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String action = scanner.next();
        double b = scanner.nextDouble();
        switch (action) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "^":
                System.out.println(Math.pow(a, b));
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("ERROR,specify +, -, /, *, ^, %");

        }
    }
}