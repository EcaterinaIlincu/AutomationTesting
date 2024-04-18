package lesson2;

import java.util.Scanner;

public class LeapYear {
    public LeapYear() {
    }

    public static void main(String[] args) {
        System.out.println("Input a year to check if it a leap year or not: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println("This is a leap year: " + year);
            } else {
                System.out.println("This is not a leap year: " + year);
            }
        } else {
            System.out.println("This is a leap year: " + year);
        }

    }
}