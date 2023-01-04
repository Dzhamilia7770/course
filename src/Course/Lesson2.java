package Course;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        System.out.println("Max number: " + Math.max(a, b));
        System.out.println("Min number: " + Math.min(a, b));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input two numbers");
        int scannerA = scanner.nextInt();
        System.out.println("Well done:-) and now the second number: ");
        int scannerB = scanner.nextInt();
        int maxNumber = Math.max(scannerA, scannerB);
        int minNumber = Math.min(scannerA, scannerB);
        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);

    }
}