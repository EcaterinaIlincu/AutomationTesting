package lesson2;

import java.util.Scanner;

public class GreatestNumber {
    public GreatestNumber() {
    }

    public static void main(String[] args) {
        System.out.println("Input three numbers in order to find the greatest one");
        Scanner scanner = new Scanner(System.in);
        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();
        int numb3 = scanner.nextInt();
        if (numb1 > numb2 && numb1 > numb3) {
            System.out.println("The greatest number is: " + numb1);
        } else if (numb2 > numb1 && numb2 > numb3) {
            System.out.println("The greatest number is: " + numb2);
        } else {
            System.out.println("The greatest number is: " + numb3);
        }

    }
}