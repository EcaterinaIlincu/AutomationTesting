package lesson3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two numbers: ");
        double numb1 = scanner.nextDouble();
        double numb2 = scanner.nextDouble();

        System.out.println("Input operator(/,*,-,+): ");
        char operator = scanner.next().charAt(0);

        double result;


        switch (operator) {
            case '+':
                result = numb1 + numb2;
            {
                System.out.println("Result is: " + result);
            }
            break;
            case '-':
                result = numb1 - numb2;
            {
                System.out.println("Result is: " + result);
            }
            break;
            case '*':
                result = numb1 * numb2;
            {
                System.out.println("Result is: " + result);
            }
            break;
            case '/':
                result = numb1 / numb2;
            {
                System.out.println("Result is: " + result);
            }
            break;
        }


    }
}
