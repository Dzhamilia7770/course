package Course;

import java.util.Scanner;

public class Les2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        if (hours <= 0 || hours >= 25) {
            System.out.println("Error. Please, input number from 1 to 24");
        } else if (hours >= 1 && hours <= 12) {
            System.out.println("Good morning");
        } else if (hours >= 13 && hours <= 20) {
            System.out.println("Good day");
        } else if (hours >= 21 && hours <= 24) {
            System.out.println("Good night");
        }
    }
}




