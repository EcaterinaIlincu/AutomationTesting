package lesson4;

import java.util.Arrays;
import java.util.Scanner;

//to find last element in array use System.out.println(array [array.length -1]);
public class LastElementArray {
    public static void main(String[] args) {

        //array lenght
        //int array[] = {4, 5, 6, 6, 7, 8};
        //  System.out.println(array [array.length - 6]);

        // input values for array from scanner
        Scanner scanner = new Scanner(System.in);

        int[] nr = new int[5];
        for (int i = 0; i < nr.length; i++) {
            System.out.println("Enter nr");
            nr[i] = scanner.nextInt();
           // System.out.println(nr[i]);
        }
        System.out.println(Arrays.toString(nr));


    }
}