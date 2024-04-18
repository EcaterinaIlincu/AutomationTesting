package lesson1;

import java.util.Scanner;

public class AreaAndPerimeter {
    public AreaAndPerimeter() {
    }

    public static void main(String[] args) {
        System.out.println("Input the side number of a square to find area and perimeter of it: ");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        int perimeter = side * 4;
        System.out.println("Perimeter of your square is: " + perimeter);
        int area = side * side;
        System.out.println("Area of you square is: " + area);
    }
}