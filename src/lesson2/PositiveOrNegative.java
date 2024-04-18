package lesson2;

import java.util.Scanner;

public class PositiveOrNegative {
    public PositiveOrNegative() {
    }

    public static void main(String[] args) {
        System.out.println("Input a number to check if it is positive or negative");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is positive");
        }

    }
}
