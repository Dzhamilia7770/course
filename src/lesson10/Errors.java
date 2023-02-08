package lesson10;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4};
            System.out.println(array[6]);
        } catch (Exception e) {
            System.out.println("Oops, we have a problem " + e.toString());

        }

    }

    public static class Main2 {
        static void InputNumber() {

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                throw new ArithmeticException("Error, input odd number");
            } else {
                System.out.println("Good job");

            }
        }

        public static void main(String[] args) {

            try {
                InputNumber();

            } catch (Exception e) {
                System.out.println("Please, input odd number");
            }
        }
    }
}

