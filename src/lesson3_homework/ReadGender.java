package lesson3_homework;

import java.util.Scanner;

public class ReadGender {
    public static void main(String[] args) {
        System.out.println("Input your gender: F or M");
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();

        switch (gender) {
            case ("F"): {
                System.out.println("Your gender is female");
                break;
            }
            case ("M"): {
                System.out.println("Your gender is male");
                break;
            }
            default:
                System.out.println("Input you gender using F for female or M for male");
        }
    }


}

