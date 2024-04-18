package lesson1;

import java.util.Scanner;

public class SumAndProduct {
    public SumAndProduct() {
    }

    public static void main(String[] args) {
        System.out.println("Input two numbers to find sum and product of them: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int product = number1 * number2;
        System.out.println("Them sum of your number is: " + sum);
        System.out.println("The product of your number is: " + product);
    }
}