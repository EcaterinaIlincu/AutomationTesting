package lesson2;

import java.util.Scanner;

public class SumAndAverage {
    public SumAndAverage() {
    }

    public static void main(String[] args) {
        System.out.println("Input five numbers: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for(int i = 1; i <= 5; ++i) {
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("The sum of your numbers is: " + sum);
        int average = sum / 5;
        System.out.println("The average of your numbers is: " + average);
    }
}