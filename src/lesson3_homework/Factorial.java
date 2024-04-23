package lesson3_homework;
//4.	Write a Java program that calculates the factorial of a given non-negative integer using a while loop.
// The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Input a number to find factorial: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int i = 1;
        int factorial = 1;


        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of you number is: " + factorial);

    }
}
