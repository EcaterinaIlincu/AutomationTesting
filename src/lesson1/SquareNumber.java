package lesson1;

import java.util.Scanner;

public class SquareNumber {
    public SquareNumber() {
    }

    public static void main(String[] args) {
        System.out.println("Please input a number to find the square of your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int square = number * number;
        System.out.println("The square of your number is: " + square);
    }
}
