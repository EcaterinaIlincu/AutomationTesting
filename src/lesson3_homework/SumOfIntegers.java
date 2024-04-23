package lesson3_homework;

import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        System.out.println("Input you number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= number){
            sum = i + sum;
            i++;
        }
        System.out.println("The sum of you number is: " + sum);
    }
}
