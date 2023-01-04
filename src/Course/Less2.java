package Course;


import java.util.Scanner;

public class Less2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbersAmount = 3;
        int sum = 0;
        int counter = 0;

        int[] numbers = new int[numbersAmount];
        while (counter < numbersAmount) {
            System.out.println("Input number: ");
            numbers[counter] = scan.nextInt();
            sum = sum + numbers[counter];
            counter++;
        }
        int maxNumber = Math.max(Math.max(numbers[0], numbers[1]), numbers[2]);
        int minNumber = Math.min(Math.min(numbers[0], numbers[1]), numbers[2]);
        int average = sum / numbersAmount;
        System.out.println("Average: " + average);
        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);
    }
}

