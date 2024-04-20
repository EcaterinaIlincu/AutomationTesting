package lesson3;

import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {

        System.out.println("Input two numbers: ");
        Scanner scanner = new Scanner(System.in);

        int numb1 = scanner.nextInt();
        int numb2 = scanner.nextInt();

        switch (numb1 > numb2 ? 1 : 2) {
            case 1: {
                System.out.println("Maximum number is " + numb1);
            }
            break;
            case 2: {
                System.out.println("Maximum number is " + numb2);
            }
            break;
        }
    }
}
