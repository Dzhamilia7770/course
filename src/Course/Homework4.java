package Course;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Please, input any number.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
